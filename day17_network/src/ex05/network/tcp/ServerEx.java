package ex05.network.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader br = null, stin = null;
		BufferedWriter bw = null;
		ServerSocket ss = null;		//socket 1
		Socket s = null;		// socket 2
		System.out.println("서버연결 됨");
		
		try {
			ss = new ServerSocket(9999);
			s = ss.accept();		// 응답 대기, 클라이언트 소켓
			
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));		// 네트워크 통해서 데이터 읽어옴
			// 키보드로 부터 입력 스트림
			stin = new BufferedReader(new InputStreamReader(System.in));
			// 클라이언트로 부터 출력 스트림
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			
			String inputMessage;
			
			while(true) {
				inputMessage = br.readLine();	// 클라이언트에서 한 행의 문자열 읽어옴
				// 클라이언트가 "EXIT"을 보내면 종료
				if(inputMessage.equalsIgnoreCase("exit")) break;
				
				System.out.println(inputMessage);
				
				String outputMessage = stin.readLine();	// 키보드에서 한 행의 문자열 읽음
				// 키보드에서 읽은 문자열 전송
				bw.write(s.getInetAddress() + "서버>" + outputMessage + "\n");
				bw.flush();
			}	// end while
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				s.close();		// 클라이언트 소켓 종료
			} catch (IOException e) {
				// TODO: handle exception
				System.out.println("클라이언트와 채팅중 오류 발생");
			}
		}
	}
}
