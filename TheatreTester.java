class TheatreTester{
	
	public static void main(String a[]){
	
	Theatre theatre=new Theatre();
	theatre.theatreId=456;
	theatre.name="Prasanna";
	theatre.location="Tolgate";
	theatre.totalNoOfSeats=200;
	theatre.noOfScreens=2;
	System.out.println(theatre.name);
	System.out.println(theatre.hashCode());
	
	Theatre theat=new Theatre();
	theat.theatreId=457;
	theat.name="Veeresh";
	theat.location="Tolgate";
	theat.totalNoOfSeats=205;
	theat.noOfScreens=2;
	System.out.println(theat.name);
	System.out.println(theat.hashCode());
	
	boolean type=theat.equals(theatre);
	System.out.println(type);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}