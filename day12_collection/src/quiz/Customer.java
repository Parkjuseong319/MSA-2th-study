package quiz;

import java.util.ArrayList;

// no, name, address, tel feild. 생성자 함수, setter/getter method
// arraylist or vector를 이용하여 고객 추가, 고객 삭제, 리스트 출력, 수정, 프로그램 무한루프/종료 구성하기
public class Customer {
	String no, name, address, tel;
	ArrayList list = new ArrayList<>();
	
	public Customer() {
		// TODO Auto-generated constructor stub
		this.no = "1";
		this.name = "zoo";
		this.address = "Seoul";
		this.tel = "010-1111-1111";
		list.add(this.no);
		list.add(this.name);
		list.add(this.address);
		list.add(this.tel);
	}
	
	public void ViewCustomer() {
		System.out.println("번호" + "\t이름 " + "\t주소 " + "\t 전화번호");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+"\t");
			if(i%4 == 3) System.out.println();
			else if(i == 3) System.out.println();
		}
		System.out.println();
	}
	
	public void InsertCustomer(int no, String cont) {
		list.set(no, cont);
	}
	
	public void AddCustomer(String no, String name, String addr, String tel) {
		list.add(no);
		list.add(name);
		list.add(addr);
		list.add(tel);
	}
	
	public void DeleteCustomer(int no) {
		list.remove(no);
		list.remove(no);
		list.remove(no);
		list.remove(no);
	}
	
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
