package ex02.aop.java;

import java.lang.reflect.Proxy;

public class MainEntry {
	public static void main(String[] args) {

		Calc c = new CalcImpl();
		
		Calc proxy = (Calc)Proxy.newProxyInstance(
					c.getClass().getClassLoader(),	//loader: 클래스 찾기 
					c.getClass().getInterfaces(), 	//interface: 행위(함수) 찾기
					new LogPrintHandlerImpl(c));	//h: 보조업무 구현
		//proxy 통해서 실행
		System.out.println(proxy.add(2, 5));
		System.out.println(proxy.mul(2, 5));
		
		// 클래스 통해서 실행
//		System.out.println(c.add(1, 2));
//		System.out.println(c.add(10, 22));
//		System.out.println();
//		System.out.println(c.mul(3, 5));
	}
}
