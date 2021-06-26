class Brands{
String name;
int established;
String industryType;
String headquarter;
public static void main(String a[]){
System.out.println("Main Method Started");
Brands brands=new Brands();
brands.name="Raymond";
brands.established=1925;
brands.industryType="Textiles";
brands.headquarter="Mumbai";
System.out.println(brands.name+" was established in "+brands.established+" , it is "+brands.industryType+" industry and its headquarter located in "+brands.headquarter);

Brands brand=new Brands();
brand.name="Maruthi";
brand.established=1981;
brand.industryType="Automotive";
brand.headquarter="New Delhi";
System.out.println(brand.name+" was established in "+brand.established+" , it is "+brand.industryType+" industry and its headquarter located in "+brand.headquarter);

Brands bran=new Brands();
bran.name="Ola";
bran.established=2010;
bran.industryType="Transportation";
bran.headquarter="Bangalore";
System.out.println(bran.name+" was established in "+bran.established+" , it is "+bran.industryType+" industry and its headquarter located in "+bran.headquarter);
System.out.println("Main Method Ended");
}
}