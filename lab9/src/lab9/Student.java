package lab9;

public class Student extends Person{
	String program;
	int year;
	double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		super();
	}
	
	public String getProgram() {
		return program;
	}
	
	public void setProgram(String program) {
		this.program = program;
	}
	
	public int getYear(){
		return 0;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public double getFee() {
		return 0;
	}
	
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	public String toString() {
		return null;
	}
}
