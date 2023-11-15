package abstra;

public abstract class Mobbrands 
{
	abstract void brand();
}

 class samsung extends Mobbrands
{
	void brand()
	{
		System.out.println("Samsung Phones are: ");
		System.out.println("S23 ultra");
		System.out.println("S22 ultra");
		System.out.println("Samsung Fold");
	}
}	
 class iphone extends Mobbrands
{
	void brand()
	{
		System.out.println("Apple iphone's are: ");
		System.out.println("iphone 15pro");
		System.out.println("iphone 15pro max");
		System.out.println("iphone 14pro");
		
	}

}
 
 class oneplus extends Mobbrands
 {
 	void brand()
 	{
 		System.out.println("onePlus phones are: ");
 		System.out.println("OnePlus 11");
 		System.out.println("OnePlus Nord CE 3");
 		System.out.println("OnePlus 11R");
 		
 	}

 }
 
 class iqoo extends Mobbrands
 {
 	void brand()
 	{
 		System.out.println("IQOO phones are: ");
 		System.out.println("IQOO Neo 7 pro");
 		System.out.println("IQOO Neo 7");
 		System.out.println("IQOO Neo 6 pro");
 		
 	}

 }
