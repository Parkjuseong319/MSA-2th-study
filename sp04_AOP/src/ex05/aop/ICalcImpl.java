package ex05.aop;

public class ICalcImpl implements ICalc {

	@Override
	public int add(int x, int y) {
		// ��������(cross-cutting-concern)
		int result = x + y;
		System.out.println("add �� ���ɻ�");
		return result;
	}

	@Override
	public int mul(int x, int y) {
		// ��������(cross-cutting-concern)
		int result = x * y;
		System.out.println("mul �� ���ɻ�");
		return result;
	}

	@Override
	public int sub(int x, int y, int z) {
		// ��������(cross-cutting-concern)
		if(y > x ) {
			throw new IllegalArgumentException("y���� x���� Ů�ϴ�");
		}
		int result = x - y - z;
		System.out.println("sub �� ���ɻ�");
		return result;
	}

}
