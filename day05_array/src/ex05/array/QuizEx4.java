package ex05.array;

public class QuizEx4 {
	public static void main(String[] args) {
		int[][]	arr = {{3, 10, 2, 8}, {7, 15, 5, 3}, {0, 0, 0, 0}};
		
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length-2; j++) {
				arr[arr.length-1][i] = arr[j][i] + arr[j+1][i];
			}
		}
		
		for (int i = 0; i < arr[0].length; i++) {
			System.out.print(arr[arr.length-1][i] + " ");
		}
	}
}
