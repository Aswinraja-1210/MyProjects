package week1.day1;

public class Mobile {
     


	public void sendSms() {
	      
	System.out.println("From oppo");
	 }
	 
     public void makeCall() {
    	 System.out.println("Calling my friend");
     }
	
	public static void main(String[] args) {
	    Mobile obj=new Mobile();
	    obj.sendSms();
        obj.makeCall();
	}

}
