class SportUtil{
	
	public static void main(String a[]){
		
		Sport sport=new Sport();
		sport.activity();
		
		Cricket crick =new Cricket();
		crick.setFirstPlayed("16th century");
		crick.setTeamMembers(11);
		crick.setEquipmentUsed("Bat,ball,wicket,protective equipment");
		crick.activity();
		crick.batting();
		
		Sport spor=new Cricket();
		
	}
	}