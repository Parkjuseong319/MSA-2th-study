package ex06.network.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TcpMultiChatServer {	// outer class
	
	HashMap clients;	// key, value로 유저이름과 메세지
	
	public TcpMultiChatServer() {		// 생성자 함수 - 멤버변수 초기화 담당
		clients = new HashMap();
		Collections.synchronizedMap(clients);		// clients 동기화
	}
	
	public void start() {		// user method
		ServerSocket ss = null;	// Server socket 1
		Socket s = null;		// client socket 1
		
		try {
			ss = new ServerSocket(7777);
			System.out.println("Server start. Can use chat");
			
			while(true) {
				s = ss.accept();
				System.out.println("[" + s.getInetAddress() + ":" + s.getPort() + "]에서 접속");
				ServerReceiver thread = new ServerReceiver(s);
				thread.start();
			}	// end while
			
		} catch (Exception e) { e.printStackTrace();	}
	}
	
	class ServerReceiver extends Thread{	// inner class
		Socket s;	// client socket
		DataInputStream dis;	// readXXX()
		DataOutputStream dos; 	// writeXXX()
		
		public ServerReceiver(Socket s) {
			// TODO Auto-generated constructor stub
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream());		// 네트워크 통해서 읽기
				dos = new DataOutputStream(s.getOutputStream());	// 네트워크 통해서 쓰기
			} catch (Exception e) {
				e.printStackTrace();
			}
		}		// end constructor
		
		public void sendToAll(String msg) {
			Iterator it = clients.keySet().iterator();	// key 값 출력
			
			while(it.hasNext()) {
				try {
					DataOutputStream dos = (DataOutputStream)clients.get(it.next()); // 해당 키 값으로 value 값 출력
//					System.out.println("dos.toString(): " + dos.toString());
					dos.writeUTF(msg);
				} catch (IOException e) {	e.printStackTrace();		}
			}	// end while
		}	// end sendToAll()
		
		@Override
		public void run() {
			String name = "";
			try {
				name = dis.readUTF();
				sendToAll("#"+ name + "님이 입장함");
				
				clients.put(name, dos);
				System.out.println("현재 접속자 수: " + clients.size()); 	// 접속자 수 확인
				
				while(dis != null) {
					sendToAll(dis.readUTF());
				}
				
			} catch (Exception e) { e.printStackTrace();			
			}finally {
				sendToAll("#" + name + "님이 나가셨습니다.");
				clients.remove(name);	// 접속자 수 제거
				System.out.println("[" + s.getInetAddress() + ":" + s.getPort() + "] 에서 접속 종료");
				System.out.println("현재 접속자 수: " + clients.size());
			}	// end try
		}	// end run
	}	// end ServerReceiver class
	
	public static void main(String[] args) {
		new TcpMultiChatServer().start();
//		TcpMultiChatServer server = new TcpMultiChatServer();
//		server.start();
	}
}	// outer class end
