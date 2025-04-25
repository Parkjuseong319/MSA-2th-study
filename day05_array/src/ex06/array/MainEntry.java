package ex06.array;

import java.util.Scanner;

// 3차원 배열
// 자료형[][][] 배열명 = new 자료형[면크기][행크기][열크기];
public class MainEntry {
	public static void main(String[] args) {
		int[][][] a = new int[2][3][4];
		
		System.out.println(a.length);	// 면크기
		System.out.println(a[0].length);	// 행크기
		System.out.println(a[0][0].length);	// 열크기
		
		//임의의 데이터 입력 받아서 출력
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.print("a["+ i + "]["+j+"]["+k+"] = ");
					a[i][j][k] = sc.nextInt();
				}
			}
		}
		System.out.println("==============");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		sc.close();
	}
}
