public class VacuumCleanerDTO{
	
	private String brand;
	private double capacityInLitres;
	private String powerSource;
	private double price;
	
	public VacuumCleanerDTO(){
	}
	
	public void setBrand(String brand){
		this.brand=brand;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public void setCapacityInLitres(double capacityInLitres){
		this.capacityInLitres=capacityInLitres;
	}
	
	public double getCapacityInLitres(){
		return capacityInLitres;
	}
	
	public void setPowerSource(String powerSource){
		this.powerSource=powerSource;
	}
	
	public String getPowerSource(){
		return powerSource;
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	
	public double getPrice(){
		return price;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}