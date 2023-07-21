package week1.day1;

class car1 {
	public void applybreak() {
		System.out.println("Applied break");
		
	}
	public void soundhorn() {
		System.out.println("Sound horn");
	}
}
public class car{
public static void main(String[] args)	{
	car1 c1=new car1();
	//car c= new car();
	c1.applybreak();
	c1.soundhorn();
	}
}