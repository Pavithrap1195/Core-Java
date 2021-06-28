class Apartment{

String name;
String location;
int noOfFlats;
int noOfBlocks;

public Apartment(){
this("Rohan Akriti","Subramanya pura",560,6);
}

public Apartment(String name,String location,int noOfFlats,int noOfBlocks){
this.name=name;
this.location=location;
this.noOfFlats=noOfFlats;
this.noOfBlocks=noOfBlocks;
apartmentDetails();
}

public void apartmentDetails(){
System.out.println(this.name+" "+this.location+" "+this.noOfFlats+" "+this.noOfBlocks);
}

public void resident(){
System.out.println("Now adays buying flats in apartments are quite common");
}

public void resident(String amenities){
System.out.println("Apartments will have all the"+amenities);
}


}