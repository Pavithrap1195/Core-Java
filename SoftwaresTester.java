class SoftwaresTester{

public static void main(String a[]){

Softwares softwares=new Softwares("Auto cadd","autodesk","computer aided design","December 1982");
softwares.printSoftwaresDetails();
Softwares software=new Softwares("Adobe acrobat","adobe Inc.","desktop publishing","15 june 1993");
software.printSoftwaresDetails();
Softwares soft=new Softwares("Java","James Gosling and his team","software platform","23 january 1996");
soft.printSoftwaresDetails();

Softwares.easeOfWork();
}
}