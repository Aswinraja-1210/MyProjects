package week1.day1;

public class Mobile2 {
          public void makeCall() {
        	  String mobileModel = "oppo";
        		Float mobileWeight= 180f;	  
        	  System.out.println("The model is "+ mobileModel);
        	  System.out.println("The Weight(grams)is "+ mobileWeight );
          }
          public void sendMsg() {
        	  boolean fullyCharged= true;
        	  int mobileCost= 12000;
        	  System.out.println(" Fully charged "+ fullyCharged);
        	  System.out.println(" Cost of mobile is "+ mobileCost);
        	  
          }
	public static void main(String[] args) {
		 
         Mobile2 obj=new Mobile2();
         obj.makeCall();
         obj.sendMsg();
         System.out.println("This is my mobile");
	}

}
