package ex02.aop.java;

import java.lang.reflect.Proxy;

public class MainEntry {
	public static void main(String[] args) {

		Calc c = new CalcImpl();
		
		Calc proxy = (Calc)Proxy.newProxyInstance(
					c.getClass().getClassLoader(),	//loader: Ŭ���� ã�� 
					c.getClass().getInterfaces(), 	//interface: ����(�Լ�) ã��
					new LogPrintHandlerImpl(c));	//h: �������� ����
		//proxy ���ؼ� ����
		System.out.println(proxy.add(2, 5));
		System.out.println(proxy.mul(2, 5));
		
		// Ŭ���� ���ؼ� ����
//		System.out.println(c.add(1, 2));
//		System.out.println(c.add(10, 22));
//		System.out.println();
//		System.out.println(c.mul(3, 5));
	}
}
