package ex02.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class GetAllByNameEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strUrl = null;
		InetAddress[] address;
		
		System.out.println("site address = ");
		try {
			strUrl = br.readLine();	// 예외 발생
			address = InetAddress.getAllByName(strUrl);	// 예외 발생
			
			for (int i = 0; i < address.length; i++) {
				System.out.println(address[i]);
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
