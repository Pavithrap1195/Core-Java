class Fruit{
	
	int id;
	double pricePerKg;
	String color;
	
	public Fruit(){
		System.out.println("Fruit object is created");
	}
	
	public void healthy(){
		System.out.println("Fruits are very healthy food");
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public int getId(){
		return id;
	}
	
	public void setPricePerKg(double pricePerKg){
		this.pricePerKg=pricePerKg;
	}
	
	public double getPricePerKg(){
		return pricePerKg;
	}
	
	public void setColor(String color){
		this.color=color;
	}
	
	public String getColor(){
		return color;
	}
	
}