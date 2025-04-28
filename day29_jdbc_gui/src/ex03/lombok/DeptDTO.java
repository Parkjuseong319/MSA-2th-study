package ex03.lombok;


public class DeptDTO {
	private int deptno;
	private String dname, loc;
	
	// 보일러플레이트 코드(Boilerplate code): 개발시 반복적으로 사용하는 필수 코드
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
}
