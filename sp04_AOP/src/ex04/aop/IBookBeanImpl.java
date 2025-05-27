package ex04.aop;

public class IBookBeanImpl implements IBookBean {

	@Override
	public void testHello(String str) {
		// TODO Auto-generated method stub
		System.out.println("public void testHello");
		
	}

	@Override
	public int korHello() {
		System.out.println("public int korHello");

		return 0;
	}

}
