/*
 * constructor never get inherited
 */
package methodOverridding;
class Bank
{
	double principal,time,si,amt; // instance var
	double rate; // instance variable
	public double getRateOfInterest()
	{
		
		return rate;
	}
	Bank(double p,double t) // parameterized constructor
	{
		this.principal=p;
		this.time=t;
	}
	public void calSI()
	{
		si=(principal*rate*time)/100;
		System.out.println("Simple interest on loan amount "+principal+" is: "+si);
		amt=principal+si;
		System.out.println("Total amount to be paid now: "+amt);
	}
}
class SBI extends Bank
{
	SBI(double p,double t) // calling parent class constructor with values
	{
		super(p,t); // call parent class constructor
	}
	public double getRateOfInterest() // method overriding
	{
		rate=12.5;
		return rate;
	}
}
public class RealLifeExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// As the object is created, constructor is invoked/ called automatically
		SBI s1=new SBI(140000,5); // s1 posses principal, rate, time, si, amt instance, principal and time will get values
		System.out.println("Rate of interested in SBI: "+s1.getRateOfInterest()); // Runtime polymorphism
		s1.calSI();
	}

}
