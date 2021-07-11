class ChemicalUtil{
	
	public static void main(String a[]){
		Chemical chemical = new Chemical();
		chemical.anAcid();
		
		SodiumOxide so=new SodiumOxide();
		so.setChemicalFormula("N2O");
		so.setAppearance("White solid");
		so.setDensity(2.27);
		so.anAcid();
		so.usedInCeramics();
		
		Chemical chem=new SodiumOxide();
		SodiumOxide soe=(SodiumOxide)chem;
		soe.usedInCeramics();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}