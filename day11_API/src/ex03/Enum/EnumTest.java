package ex03.Enum;

enum Day{	// 기본적으로 static, final 속성을 갖고 있다.
	SUNDAY, MONDAY, TUESDAY, WENDSDAY, THURSDAY, FRIDAY, SATUDAY
}

public class EnumTest {
	Day day;
	
	public EnumTest(Day day) {
		this.day = day;
	}
	
	public void tellItLinkedItIs() {
		switch (day) {
		case MONDAY : 
			System.out.println("Mondays so bad"); break;
		case FRIDAY : 
			System.out.println("Friday so good"); break;
		case SATUDAY : 
			System.out.println("Satuday so happy"); break;
		default:
			System.out.println("Midweek days are so-so");
			break;
		} // switch end
	}
	
	public static void main(String[] args) {
		EnumTest firstday = new EnumTest(Day.MONDAY);
		firstday.tellItLinkedItIs();
		EnumTest thirdday = new EnumTest(Day.WENDSDAY);
		thirdday.tellItLinkedItIs();
		EnumTest sixthday = new EnumTest(Day.SATUDAY);
		sixthday.tellItLinkedItIs();
	}
}
