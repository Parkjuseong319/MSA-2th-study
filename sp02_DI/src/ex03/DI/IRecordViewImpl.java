package ex03.DI;

import java.util.Scanner;

import ex03.DI.IRecordImpl;

public class IRecordViewImpl implements IRecordView {
	
	private IRecordImpl record;
	
	//setter로 주입하기
	public void setRecord(IRecordImpl record) {
		this.record = record;
	}
	
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("kor: ");	record.setKor(sc.nextInt());
		System.out.print("eng: ");	record.setEng(sc.nextInt());
		System.out.print("com: ");	record.setCom(sc.nextInt());
	}

	@Override
	public void print() {
		System.out.println("\n\nKor: " + record.getKor());
		System.out.println("Eng: " + record.getEng());
		System.out.println("Com: " + record.getCom());
		
		System.out.println("Total: " + record.total() + "\nAvg: " + record.avg());
	}

}
