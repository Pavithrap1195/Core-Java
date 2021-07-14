class Minerals{
	
	public int mineralsId;
	public String name;
	public String symbol;
	public int atomicNumber;
	public double densityIngpcm3;
	
	
	public Minerals(){
		System.out.println();
	}
	
	@Override
	public int hashCode(){
		return this.mineralsId;
	}

	@Override
	public boolean equals(Object mineral){
		if(mineral instanceof Minerals){
			Minerals mine=(Minerals)mineral;
			if(this.hashCode()==mine.hashCode()){
				return true;
			}
			if(this.name.equals(mine.name)){
				return true;
			}else{
				System.out.println("Names are different");
			
			}
			if(this.symbol.equals(mine.symbol)){
				return true;
			}else{
				System.out.println("Symbols are different");
				
			}
			if(this.atomicNumber==mine.atomicNumber){
				return true;
			}else{
				System.out.println("Atomic numberes sre different");
				
			}
			if(this.densityIngpcm3==mine.densityIngpcm3){
				return true;
			}else{
				System.out.println("Density is different");
				
			}
		}else{
			System.out.println("Not a same type");
		}
		return false;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}