package week1.day1;
public class Mobile1 {
	public void makeCall(String mobilemodel,float mobileweight) {
		System.out.println("Mobile model" + mobilemodel);
		System.out.println("Mobile weight" +  mobileweight );
	}
	public void sendMsg(boolean fullcharged,int mobilecost) {
		System.out.println("Mobile fully charged" + fullcharged);
		System.out.println("Mobile Cost" + mobilecost);
	}
public void main(String[] args) {
	Mobile1 im=new Mobile1();
	im.makeCall("oppo",8.6f);
	im.sendMsg(true,52000);
	System.out.println("This is my Mobile");
}
}
