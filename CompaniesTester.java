class CompaniesTester{

public static void main(String a[]){

Companies companies=new Companies("Infosys","7 July 1981","IT services","N R NArayan Murty","bangalore");
companies.printCompaniesDetails();
Companies companie=new Companies("Sobha Ltd","1995","Real estate development","PNC Menon","bangalore");
companie.printCompaniesDetails();
Companies comp=new Companies("Toyota","28 August 1937","Automotive","Kiichiro toyoda","toyota city,Japan");
comp.printCompaniesDetails();

Companies.jobOpportunity();
}
}