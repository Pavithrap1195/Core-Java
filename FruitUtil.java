class FruitUtil{
	
	public static void main(String a[]){
		Fruit fruit =new Fruit();
		fruit.healthy();
		
		Mango mango=new Mango();
		mango.setId(145);
		mango.setPricePerKg(120);
		mango.setColor("Yellow");
		mango.healthy();
		mango.yummy();
		
		Fruit frui=new Mango();
		frui.setId(155);
		frui.setPricePerKg(110);
		frui.setColor("Green");
		System.out.println(frui.getId());
		System.out.println(frui.getPricePerKg());
		System.out.println(frui.getColor());
		
		
	}
	
	}