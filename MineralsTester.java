class MineralsTester{
	
	public static void main(String a[]){
	
	Minerals minerals =new Minerals();
	
	minerals.mineralsId=789;
	minerals.name="Copper";
	minerals.symbol="Cu";
	minerals.atomicNumber=29;
	minerals.densityIngpcm3=8.96;
	System.out.println(minerals.name);
	System.out.println(minerals.hashCode());
	
	
	Minerals miner =new Minerals();
	
	miner.mineralsId=789;
	miner.name="Manganese";
	miner.symbol="Mn";
	miner.atomicNumber=25;
	miner.densityIngpcm3=7.21;
	System.out.println(miner.name);
	System.out.println(miner.hashCode());
	
	boolean type=miner.equals(minerals);
	System.out.println(type);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}