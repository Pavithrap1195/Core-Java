class FilmUtil{
	
	public static void main(String a[]){
		Film film =new LoveMocktail();
		LoveMocktail love =(LoveMocktail)film;
		love.printDetails();
		System.out.println(love.enjoyment());
		
		Film fil =new Film();
		boolean type =fil.equals(film);
		System.out.println(type);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}