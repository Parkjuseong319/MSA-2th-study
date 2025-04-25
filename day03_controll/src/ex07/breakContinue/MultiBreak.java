package ex07.breakContinue;

public class MultiBreak {
	public static void main(String[] args) {
		
		boolean flag = true;
		
		first: {
			second: {
				
				third: {
					
					int k = 100;
					System.out.println("Before the break");	// 1
					
					if(flag) break second;	// 다중 break 문일때 break 식별자; 로 탈출. 식별자 위치까지 탈출한다.
					
					System.out.println("this won't execute"); 	// 2
					
				}	// end third
				
				System.out.println("msa 2기 화이팅");	//3
				
			}	// end second
			System.out.println("This is after second break");	//4
		} // end first
		System.out.println("12345");
	}
}

/*
	식별자1 : {

		식별자2: {
			break 식별자1;
		}
	}
*/