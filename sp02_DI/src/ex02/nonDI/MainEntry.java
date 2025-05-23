package ex02.nonDI;

public class MainEntry {
	public static void main(String[] args) {
		IRecordImpl record = new IRecordImpl();
		
		IRecordViewImpl view = new IRecordViewImpl();
		
		// ����
		view.setRecordImpl(record);
		view.input();
		view.print();
	}
}
