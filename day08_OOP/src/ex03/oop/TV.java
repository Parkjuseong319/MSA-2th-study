package ex03.oop;

public class TV {
	// color, channel, setter/getter, output, constructor method 3개 만들기
	String color;
	int channel;
	
	public TV() {
		this.color = "black";
		this.channel = 1;
	}
	
	public TV(String color) {
		this.color = color;
		this.channel = 5;
	}
	public TV(int channel) {
		this.color = "green";
		this.channel = channel;
	}
	public TV(String color, int channel) {
		this.color = color;
		this.channel = channel;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void output() {
		System.out.println("TV 색상: " + color + "\n채널번호 " + channel);
	}
	
	public String toString() {		// 현업에선 이런 방식으로 오버라이딩하여 많이 사용한다.
		return channel + ", " + color;
	}
}
