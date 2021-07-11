class Plastic{

int id;
double price;
String brandName;
boolean isDurable;

public Plastic(){
	System.out.println("With zero parameter");
	System.out.println("Plastic object is created");
}

/*public Plastic(int id,double price,String brandName,boolean isDurable){
	System.out.println("With four parameters");
	this.id=id;
	this.price=price;
	this.brandName=brandName;
	this.isDurable=isDurable;
}*/

/*We can initialize the variable using constructor or getter setter method*/

public void deforms(){
	System.out.println("Plastic can be deformed easily");
}

public void setId(int id){
	this.id=id;
}

public int getId(){
	return id;
}

public void setPrice(double price){
	this.price=price;
}

public double getPrice(){
	return price;
}

public void setBrandName(String brandName){
	this.brandName=brandName;
}

public String getBrandName(){
	return brandName;
}

public void setIsDurable(boolean isDurable){
	this.isDurable=isDurable;
}

public boolean getIsDurable(){
	return isDurable;
}








}