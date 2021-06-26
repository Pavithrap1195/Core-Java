class ScientistsTester{

public static void main(String a[]){

Scientists scientists=new Scientists("C.V.Raman","7 november 1888","raman effect","physics","21 november 1970");
scientists.printScientistsDetails();
Scientists scientist=new Scientists("Albert Einstein","14 march 1879","relativity","physics","18 april 1955");
scientist.printScientistsDetails();
Scientists scient=new Scientists("Stephen Hawking","8 january 1942","radiation","quantum gravity","14 march 2018");
scient.printScientistsDetails();

Scientists.inventions();
}
}