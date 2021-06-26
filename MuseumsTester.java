class MuseumsTester{

public static void main(String a[]){

Museums museums =new Museums("Visvesvaraya Industrial & Technological Museum","14 july 1962","bangalore","science museum","KA Sadhana");
museums.printMuseumsDetails();
Museums museum =new Museums("Sardar Patel National Memorial","7 march 1980","Gujarat","Hall of memory","Sardar Vallabhai Patel Memorial Society");
museum.printMuseumsDetails();
Museums museu =new Museums("Jawaharlal Nehru State Museum","1980","Arunachal Pradesh","ethnographic and archeological","Arunachal Pradesh government");
museu.printMuseumsDetails();

Museums.collection();
}
}