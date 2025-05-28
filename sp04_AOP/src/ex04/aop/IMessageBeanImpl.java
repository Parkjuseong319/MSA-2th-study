package ex04.aop;

public class IMessageBeanImpl implements IMessageBean {

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("public void sayHello");

	}

	@Override
	public void engHello() {
		// TODO Auto-generated method stub
		System.out.println("public void engHello");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
