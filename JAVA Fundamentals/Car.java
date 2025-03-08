public class Car {
	private String car_color;
	private String car_brand;
	private String fuel_type;
	private String mileage;
	
	public void start() {
	   System.out.println("car is started");
	}
	public void stop() {
	   System.out.println("car is stopped");
	}
	public void service() {
	   System.out.println("car is for service");
	}
	public static void main(String args[]) {
             Car car1 = new Car();
             car1.car_color="black"; 
	     car1.car_brand="BMW";
             car1.fuel_type="diesel";
             car1.mileage="20"; 
	     car1.start();
 	     car1.stop();
     	     car1.service();
	   System.out.println("car_color:"+car1.car_color);
	   System.out.println("car_brand:"+car1.car_brand);
           System.out.println("fuel_type:"+car1.fuel_type);
	   System.out.println("mileage:"+car1.mileage);
             Car car2 = new Car();
             car2.car_color="white"; 
	     car2.car_brand="audi";
             car2.fuel_type="petrol";
             car2.mileage="20";
	     car2.start();
	     car2.stop();
	     car2.service();	
	   System.out.println("car_color:"+car2.car_color);
	   System.out.println("car_brand:"+car2.car_brand);
           System.out.println("fuel_type:"+car2.fuel_type);
	   System.out.println("mileage:"+car2.mileage);
	     Car car3 = new Car();	   
             car3.car_color="white";
             car3.car_brand="Benz";
             car3.fuel_type="petrol";
             car3.mileage="10";
	     car3.start();
 	     car3.stop();
             car3.service();
	   System.out.println("car_color:"+car3.car_color);
	   System.out.println("car_brand:"+car3.car_brand);
           System.out.println("fuel_type:"+car3.fuel_type);
	   System.out.println("mileage:"+car3.mileage);
  }
}
