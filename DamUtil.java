class DamUtil{
	
	public static void main(String a[]){
		Dam dam =new Dam();
		dam.barrier();
		
		KRS krs=new KRS();
		krs.setLocation("Mandya");
		krs.setHeightInMeters(40);
		krs.setOpened(1932);
		krs.barrier();
		krs.storesKaveriWater();
		
		Dam da=new KRS();
		
	}
	
	}