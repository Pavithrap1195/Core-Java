class Library{
String name;
String type;
int rentedForInDays;
String author;
public static void main(String a[]){

System.out.println("Main method Started");
Library library=new Library();
library.name="Spardha Vijetha";
library.type="Monthly magazines";
library.author="Vijay sankeshwar";
library.rentedForInDays=1;
System.out.println(library.name+" is "+library.type+" and the Author is "+library.author+" ,rented for "+library.rentedForInDays+" day ");

Library lib=new Library();
lib.name="Lifes Amazing secret";
lib.type="Novel";
lib.author="Gaaur gopal das";
lib.rentedForInDays=5;
System.out.println(lib.name+" is "+lib.type+" and the Author is "+lib.author+" rented for "+lib.rentedForInDays+" day ");

Library libr=new Library();
libr.name="The complete reference Java ";
libr.type="Educational";
libr.author="Herbert Schildt";
libr.rentedForInDays=10;
System.out.println(libr.name+" is "+libr.type+" and the Author is "+libr.author+" rented for "+libr.rentedForInDays+" day ");
System.out.println("Main method Ended");
}














}