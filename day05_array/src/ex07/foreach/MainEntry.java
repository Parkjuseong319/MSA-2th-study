package ex07.foreach;

public class MainEntry {
	public static void main(String[] args) {
		int[] a = {1, 3,6, 7, 4, 5, 12, 56, 100, 67};
		
		System.out.println("오름차순");
		for (int i = 0; i < a.length; i++) {	//오름차순
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int item : a) {	// 인덱스 번호 기준으로 내림차순 출력 불가능
			System.out.print(item+ " ");
		}
		System.out.println("\n내림차순");
		for (int i = a.length-1; i >= 0; i--) {	//내림차순
			System.out.print(a[i] + " ");
		}
	}
}
