package ex07.argumentVariable;

public class MainEntry {
	
	public static void plus(int...x) {
//		int[] a = new int[30];	// 고정길이 배열
		
		int sum = 0;
		
		for(int i=0; i < x.length; i++) {
//			System.out.print(x[i] + " ");
			sum += x[i];
		}
		System.out.println("sum = " + sum);
	}
	
	public static void main(String[] args) {
		
		plus(1,2);
		plus(1,2,3,4,5);
		plus(1);
		plus(1,2,3,4,5,6,7);
		plus("kbs", "mbc");
		plus("aa", "bb", "cc", "dasfdg", "12345");
		
	}
	
	public static void plus(String...x) {
		String sum = "";
		
		for(int i=0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println("sum = " + sum);
	}

//	private static void plus(int i) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void plus(int i, int j, int k, int l, int m) {
//		// TODO Auto-generated method stub
//		
//	}
}
