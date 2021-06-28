class ElectricalTool{

String name;
String purpose;
String unitOfMeasurement;
boolean isRunsByBattery;

public ElectricalTool(){
this("Voltmeter","measures voltages of direct or alternate current","volts",true);
}

public ElectricalTool(String name,String purpose,String unitOfMeasurement,boolean isRunsByBattery){
this.name=name;
this.purpose=purpose;
this.unitOfMeasurement=unitOfMeasurement;
this.isRunsByBattery=isRunsByBattery;
electricalToolDetails();
}

public void electricalToolDetails(){
System.out.println(this.name+" "+this.purpose+" "+this.unitOfMeasurement+" "+this.isRunsByBattery);
}

public void measuringTool(){
System.out.println("Primary requirement for electrical works");
}

public void measuringTool(String tools){
System.out.println("Right" +tools+ " are very important for any projets");
}
}