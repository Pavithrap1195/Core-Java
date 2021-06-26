class BankingApplications{
String name;
String developer;
String launched;
String website;
public static void main(String a[]){
System.out.println("Main Method Started");
BankingApplications bankingApps=new BankingApplications();
bankingApps.name="Yono Sbi";
bankingApps.developer="State bank of India";
bankingApps.launched="24 Novemeber 2017";
bankingApps.website="www.sbiyono.sbi";
System.out.println(bankingApps.name+" is one of the banking application developed by "+bankingApps.developer+" that was launched on "+bankingApps.launched+" and we can access by this website "+bankingApps.website);

BankingApplications banking=new BankingApplications();
banking.name="CANDI";
banking.developer="Canara Bank";
banking.launched="27 July 2018";
banking.website="www.canarabank.com";
System.out.println(banking.name+" is one of the banking application developed by "+banking.developer+" that was launched on "+banking.launched+" and we can access by this website "+banking.website);

BankingApplications bankApps=new BankingApplications();
bankApps.name="Axis mobile";
bankApps.developer="Axis bank ";
bankApps.launched="26 August 2013";
bankApps.website="www.axisbank.com/axismobile";
System.out.println(bankApps.name+" is one of the banking application developed by "+bankApps.developer+" that was launched on "+bankApps.launched+" and we can access by this website "+bankApps.website);
System.out.println("Main Method Ended");
}
}