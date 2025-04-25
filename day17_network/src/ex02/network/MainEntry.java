package ex02.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainEntry {
	public static void main(String[] args) {
		String host = "127.0.0.1";	// 192.168.230.36 과 같다
		
		try {
			InetAddress[] address = InetAddress.getAllByName(host);
			
			for (InetAddress item : address) {
				System.out.println(item.getCanonicalHostName());
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
