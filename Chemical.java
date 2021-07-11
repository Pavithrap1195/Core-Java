class Chemical{
	
	String chemicalFormula;
	String appearance;
	double density;
	
	public Chemical(){
		System.out.println("Chemical object is created");
	}
	
	public void anAcid(){
		System.out.println("A chemical substance is a form of matter having constants chemical composition and characteristic properties");
	}
	
	public void setChemicalFormula(String chemicalFormula){
		this.chemicalFormula=chemicalFormula;
	}
	
	public String getChemicalFormula(){
		return chemicalFormula;
	}
	
	public void setAppearance(String appearance){
		this.appearance=appearance;
	}
	
	public String getAppearance(){
		return appearance;
	}
	
	public void setDensity(double density){
		this.density=density;
	}
	
	public double getDensity(){
		return density;
	}
}