package week1.day1;

public class ObjectClass {
	
	String ObjectCategory = "Mobile Phone";
	Float size;
	String shape;
	String IMEI;
	int resolution;
	boolean istouchscreen;
	short costofmobile;
		
	
	public void makecalls() {
		System.out.println("Making calls");

	}
		
		public void paymoney() {
			System.out.println("PayMoney");

		}	
			

		public static void main(String[] args) {
		
		ObjectClass samsung = new ObjectClass();
		
		ObjectClass Apple= new ObjectClass();
		
		samsung.costofmobile = 15000;
		samsung.IMEI = "65498415161";
		samsung.istouchscreen = true;
		
		System.out.println("costofmobile:" + samsung.costofmobile);
		System.out.println("IMEI:" + samsung.IMEI);
		System.out.println("resolution:" + samsung.resolution);
		
		System.out.println("**********************");
		
		Apple.costofmobile = 18000;
		Apple.IMEI = "654984151541";
		Apple.istouchscreen = true;
		
		
		System.out.println("costofmobile:" + Apple.costofmobile);
		System.out.println("IMEI:" + Apple.IMEI);
		System.out.println("resolution:" + Apple.resolution);
		
		
		
		
		
		
		
		
		}	
		
}
