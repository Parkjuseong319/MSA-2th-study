package ex06.arrayMethod;

public class MainEntry {
	
	public static void main(String[] args) {
		int x = 3, y = 5;
		
		int result = methodEx(x,y);
		System.out.println(result);
		line();
		
		int[] arrResult = methodEx2();
		for (int s = 0; s < arrResult.length; s++) {
			System.out.print(arrResult[s] + " ");
		}
		System.out.println();
		for(int item:arrResult) System.out.print(item + " ");
		line();
		// 1차원 배열 함수 호출 결과값 누적된 합 출력하기
		int sum = 0;
		for(int item:arrResult) sum+=item;
		System.out.println(sum);
		line();
		// 2차원 배열 함수 만들기 -> 더한 결과 출력
		int[][] resultArr = methodEx3();	// methodEx3에 있는 arr의 시작 주소를 참조하게 된다.
		int sum2 = 0;
		for (int i = 0; i < resultArr.length; i++) {
			for (int j = 0; j < resultArr[i].length; j++) {
				sum2 += resultArr[i][j];
			}
		}
		System.out.println("2차원 배열 합 = "+sum2);
		line();
		
		for(int[] item: resultArr) {
			System.out.println(item);		// 배열은 일단 주소를 넘긴다. 그러므로 주소 출력(16진수)
			System.out.println(item.hashCode());	// 메모리상의 주소(16진수)를 10진수 형태의 메모리주소로 출력
		}
		
		System.out.println("---------- foreach 문으로 2차원 배열 데이터 출력하기 ---------");
		
		for (int[] item : resultArr) {
			
			for (int arrItem : item) {
				System.out.print(arrItem + " ");
			}
			
		}	// item end
		
		
		
	}

	private static int[][] methodEx3() {
		int[][] arr = {{1,2,3,4},{5,6,7,8}};
		return arr;
	}

	private static int[] methodEx2() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		return arr;
	}

	public static int methodEx(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}
	
	public static void line() {
		System.out.println("\n-----------------------------------------------------");
	}

}
