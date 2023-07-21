package week1.day1;
class report { 
	String Name;
	int rollNo;
	String collegeName;
	int markScored;
	double cgpa;
}
public class Students {
public static void main(String[] args) {
	report std =new report();
		std.Name = "vishnu";
		std.rollNo =10;
		std. collegeName="M.O.P Vaishnav College for Womens";
		std.markScored =88;
		std.cgpa=8.3f;
	System.out.println("Name is:" + std.Name);
	System.out.println("Roll no is:" + std.rollNo);
	System.out.println("College name  is:" + std.collegeName);
	System.out.println("Mark Scored is:" + std.markScored);
	System.out.println("Cgpa is:" + std.cgpa);
}
}