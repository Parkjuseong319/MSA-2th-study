package ex04.network.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest {	// Socket 2개 필요
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		System.out.println("Server Start!");
		
		try {
			ss = new ServerSocket(9000);	// 0~ 1024번 포트 넘버는 예약되어 있다.
			s = ss.accept();	// Client Socket. 응답대기
			// I    /    O 
			InputStream is = s.getInputStream();	// read
			OutputStream os = s.getOutputStream();	// write
			
			byte[] arr = new byte[100];
			is.read(arr);
			System.out.println(new String(arr));
			
			System.out.println("보낼 문자 입력하세요");
			String message = new Scanner(System.in).nextLine();
			os.write(message.getBytes());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { s.close();	ss.close();	} catch (IOException e2) { e2.printStackTrace(); }
		}
	}
}
