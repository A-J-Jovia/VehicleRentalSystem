package classfiles;

public class Vehicle {
	private int reg_no;
	private String brand;
	private float rate;
	
	public Vehicle(){}
	public Vehicle(int reg_no, String brand, float rate) {
		this.reg_no = reg_no;
		this.brand = brand;
		this.rate = rate;
	}
	
	public void Setreg_no(int reg_no) {
		this.reg_no = reg_no;
	}
	public int Getreg_no() {
		return reg_no;
	}
	
	public void Setbrand(String brand) {
		this.brand = brand;
	}
	public String Getbrand() {
		return brand;
	}
	
	public void Setrate(float rate) {
		this.rate = rate;
	}
	public float Getrate() {
		return rate;
	}
	
	public void Display(){
		System.out.println("Reg.no : "+reg_no);
		System.out.println("Brand : "+brand);
		System.out.println("Rate per hr : "+rate);
	}
	
}

