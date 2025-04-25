package ex05.network.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader br = null, stin = null;
		BufferedWriter bw = null;
		Socket s = null; // socket 1

		try {
			s = new Socket("127.0.0.1", 9999); // 127.0.0.1 or Localhost
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			// 키보드로 부터 입력 스트림
			stin = new BufferedReader(new InputStreamReader(System.in));
			// 클라이언트로 부터 출력 스트림
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			
			String outputMessage;
			while(true) {
				System.out.println("message input: ");
				outputMessage = stin.readLine();
				
				if(outputMessage.equalsIgnoreCase("exit")) {
					bw.write(outputMessage);
					bw.flush();
					break;
				}
				
				// 키보드에서 읽은 문자열 전송
				bw.write(s.getInetAddress() + "클라이언트 > " + outputMessage + "\n");
				bw.flush();
				
				String inputMessage = br.readLine();
				System.out.println(inputMessage);
				
			}		// end while
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
			try {
				s.close();
			} catch (IOException e2) {
				System.out.println("채팅중 클라이언트 측에서 에러 발생");
			}
		}
	}
}
