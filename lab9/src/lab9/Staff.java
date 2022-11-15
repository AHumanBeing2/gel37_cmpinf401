package lab9;

public class Staff extends Person{
	String school;
	double pay;
	
	public Staff(String name, String address, double pay) {
		super();
	}
	
	public String getSchool() {
		return school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	
	public double getPay() {
		return pay;
	}
	
	public void setPay(double pay) {
		this.pay = pay;
	}
	
	public String toString() {
		return null;
	}
}
