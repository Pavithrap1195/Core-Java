class Theatre{

String name;
String location;
boolean isBookingAvailable;
int totalNoOfSeats;
int noOfScreens;
int noOfShows;

public Theatre(){
this("Prasanna","Tolgate",true);
}

public Theatre(String name,String location,boolean isBookingAvailable){
this(500);
System.out.println("With three parameters");
this.name=name;
this.location=location;
this.isBookingAvailable=isBookingAvailable;
theatreDetails();
}

public Theatre(int totalNoOfSeats){
this(2,3);
this.totalNoOfSeats=totalNoOfSeats;
}

public Theatre(int noOfScreens,int noOfShows){
this.noOfScreens=noOfScreens;
this.noOfShows=noOfShows;
}

public void theatreDetails(){
	System.out.println(this.name+" "+this.location+" "+this.isBookingAvailable+" "+this.totalNoOfSeats+" "+this.noOfScreens+" "+this.noOfShows);
}

public void entertainment(){
	System.out.println("Stop piracy watch movies in theatres");
}

public void entertainment(String popcorn){
	System.out.println("Enjoy with "+popcorn);
}
}