class Food{
	
	public boolean isSpicy=false;
	public boolean isSweet=true;
	public double price=120;
	
	
public Food(){
	System.out.println("Default constructor");
}

public Object tastyAndSpicy(){
	return "tasty";
}

@Override
public boolean equals(Object taste){
	if(taste instanceof Food){
		return true;
	}
	return false;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}