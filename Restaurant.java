class Restaurant{
String name;
String location;
String famousFor;
boolean isRoofTopAvailable;
public static void main(String a[]){
System.out.println("Main Method Started");
Restaurant restaurant=new Restaurant();
restaurant.name="The Watering Hole";
restaurant.location="Rajarajeshwari nagar";
restaurant.famousFor="Chinese food";
restaurant.isRoofTopAvailable=true;
System.out.println(restaurant.name+" is located in "+restaurant.location+" which is famous for "+restaurant.famousFor+" and option for rooftop is "+restaurant.isRoofTopAvailable+" ly available");

Restaurant rest=new Restaurant();
rest.name="Ayodhya Grand";
rest.location="BDA Complex";
rest.famousFor="Northern food";
rest.isRoofTopAvailable=false;
System.out.println(rest.name+" is located in "+rest.location+" which is famous for "+rest.famousFor+" and option for rooftop is "+rest.isRoofTopAvailable+" ly available");

Restaurant restaur=new Restaurant();
restaur.name="Rajathadri";
restaur.location="Uttarahalli";
restaur.famousFor="Chinese food and Northern food";
restaur.isRoofTopAvailable=false;
System.out.println(restaur.name+" is located in "+restaur.location+" which is famous for "+restaur.famousFor+" and option for rooftop is "+restaur.isRoofTopAvailable+" ly available");
System.out.println("Main Method Ended");
}
}