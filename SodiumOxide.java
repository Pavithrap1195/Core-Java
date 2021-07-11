class SodiumOxide extends Chemical{
	
	@Override
	public void anAcid(){
		System.out.println(super.getChemicalFormula());
		System.out.println(super.getAppearance());
		System.out.println(super.getDensity());
		System.out.println("Invoked an acid method in sodium oxide");
	}
	
	public void usedInCeramics(){
		System.out.println("It is a chemical compound and used in ceramics and glasses");
	}
	
}