package ex02.nonDI;

import java.util.Scanner;

public class IRecordViewImpl implements IRecordView {
	
	private IRecordImpl recordImpl;

	//setter로 주입하기
	public void setRecordImpl(IRecordImpl recordImpl) {
		this.recordImpl = recordImpl;
	}
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("kor: ");	recordImpl.setKor(sc.nextInt());
		System.out.print("eng: ");	recordImpl.setEng(sc.nextInt());
		System.out.print("com: ");	recordImpl.setCom(sc.nextInt());
	}

	@Override
	public void print() {
		System.out.println("\n\nKor: " + recordImpl.getKor());
		System.out.println("Eng: " + recordImpl.getEng());
		System.out.println("Com: " + recordImpl.getCom());
		
		System.out.println("Total: " + recordImpl.total() + "\nAvg: " + recordImpl.avg());
	}

}
