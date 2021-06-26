class TransportationTester{

public static void main(String a[]){

Transportation transportation=new Transportation();
transportation.name="Railways";
transportation.typeOfMode="Land";
transportation.fuelUsed="CharCoal";
transportation.speedInKmph=350;
System.out.println(transportation.name+" are the example for "+transportation.typeOfMode+" mode and the fuel used is "+transportation.fuelUsed+" which runs at a speed of "+transportation.speedInKmph+" Kmph ");

Transportation transport=new Transportation();
transport.name="Aeroplane";
transport.typeOfMode="Airways";
transport.fuelUsed="Aviation Kerosene";
transport.speedInKmph=880;
System.out.println(transport.name+" are the example for "+transport.typeOfMode+" mode and the fuel used is "+transport.fuelUsed+" which runs at a speed of "+transport.speedInKmph+" Kmph ");

Transportation trans=new Transportation();
trans.name="Cruise Ship";
trans.typeOfMode="Water";
trans.fuelUsed="Diesel";
trans.speedInKmph=37;
System.out.println(trans.name+" are the example for "+trans.typeOfMode+" mode and the fuel used is "+trans.fuelUsed+" which runs at a speed of "+trans.speedInKmph+" Kmph ");

Transportation.travelling();
}
}