class OperatingSystemsTester{

public static void main(String a[]){

 OperatingSystems operatingsystems = new OperatingSystems("Linux","linux foundation","17 September 1991","Monolithic","multilingual");
 operatingsystems.printOSDetails();
 OperatingSystems operating = new OperatingSystems("Unix","Ken Thompson and team","1969","Monolithic","english");
 operating.printOSDetails();
 OperatingSystems opera = new OperatingSystems("Windows","Microsoft","20 November 1985","windows NT family","138 languages");
 opera.printOSDetails();
 
OperatingSystems.managesComputer();
}
}



