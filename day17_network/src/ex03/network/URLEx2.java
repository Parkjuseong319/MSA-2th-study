package ex03.network;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx2 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
//		URL url = new URL("https://www.google.com/search?q=kim+yuna&oq=kim+yuna&gs_lcrp=EgZjaHJvbWUqCggAEAAY4wIYgAQyCggAEAAY4wIYgAQyBwgBEC4YgAQyBwgCEAAYgAQyBwgDEAAYgAQyBwgEEAAYgAQyBwgFEAAYgAQyBwgGEC4YgAQyBwgHEAAYgAQyBwgIEC4YgAQyBwgJEAAYgATSAQkzODYxajBqMTWoAgiwAgHxBWlO1Mwt1Qij&sourceid=chrome&ie=UTF-8");
		URL url = new URL("https://search.daum.net/search?w=tot&DA=YZR&t__nil_searchbox=btn&q=kim+yuna");
//		https://www.google.com/
//		search?q=kim+yuna
//		&oq=kim+yuna
//		&gs_lcrp=EgZjaHJvbWUqCggAEAAY4wIYgAQyCggAEAAY4wIYgAQyBwgBEC4YgAQyBwgCEAAYgAQyBwgDEAAYgAQyBwgEEAAYgAQyBwgFEAAYgAQyBwgGEC4YgAQyBwgHEAAYgAQyBwgIEC4YgAQyBwgJEAAYgATSAQkzODYxajBqMTWoAgiwAgHxBWlO1Mwt1Qij&sourceid=chrome&ie=UTF-8
		
		// URL이 갖고 있는 함수 사용
		System.out.println("프로토콜: " + url.getProtocol());
		System.out.println("호스트와 포트: " + url.getAuthority());
		System.out.println("호스트: " + url.getHost());
		System.out.println("포트: " + url.getPort());
		System.out.println("경로: " + url.getPath());
		System.out.println("질의: " + url.getQuery());
		System.out.println("파일명: " + url.getFile());
		System.out.println("참조: " + url.getRef());
	}

}
