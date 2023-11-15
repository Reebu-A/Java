package abstra;

import java.util.Scanner;

public class Banking_v
{
	Scanner s= new Scanner(System.in);
	private String n="";
	private String ac="";
	private String mob="";
	private int ba=1000;
	
	public String getN() {
		System.out.print("Customer Name: ");
		return n;
	}
	public void setN(String n) {
		System.out.print("Enter Customer Name: ");
		n=s.next();
		this.n = n;
	}
	public String getAc() {
		System.out.print("Account Number: ");
		return ac;
	}
	public void setAc(String ac) {
		System.out.print("Enter account number: ");
		ac=s.next();
		this.ac = ac;
	}
	public String getMob() {
		System.out.print("Mob Number: ");
		return mob;
	}
	public void setMob(String mob) {
		System.out.print("Enter the Mob Number: ");
		mob=s.next();
		this.mob = mob;
	}
	
	
	public int getBa() {
		System.out.print("Balance amount: ");
		return ba;
	}
	public void setBa(int ba) {
		this.ba = ba;
	}
	void star()
	{
		System.out.println("******************************");
	}
	
	

}
