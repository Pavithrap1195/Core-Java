class VirusTester{

public static void main(String a[]){

Virus virus =new Virus("Influenza virus","fever,runny nose,sorethroat","Influenza viruses",8);
virus.printVirusDetails();
Virus viru =new Virus("Nipha virus","fever,cough,headache","Nipha viruses",14);
viru.printVirusDetails();
Virus vir =new Virus("Covid 19","fever,cough,sorethroat,fatigue,loss of taste and smell","SARS-COV-2",7);
vir.printVirusDetails();

Virus.infectiousAgent();
}
}
