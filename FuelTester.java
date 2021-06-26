class FuelTester{

public static void main(String a[]){

Fuel fuel=new Fuel("Charcoal","carbon","black","railway trains");
fuel.printFuelDetails();
Fuel fue=new Fuel("Petrol","organic carbon and hydrogen compounds","colourless","vehicles");
fue.printFuelDetails();
Fuel ful=new Fuel("Diesel","aliphatic and aromatic hydrocarbons","colourless","heavy vehicles");
ful.printFuelDetails();

Fuel.provideEnergy();
}
}