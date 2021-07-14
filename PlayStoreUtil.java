class PlayStoreUtil{
	
	public static void main(String a[]){
		PlayStore play =new PlayStore();
		play.playStoreId=456;
		play.applicationName="Voot";
		play.type="Apps";
		play.sizeInMb=20;
		play.ratedInStar=3.7;
		System.out.println(play.applicationName);
		System.out.println(play.hashCode());
		
		PlayStore playstore =new PlayStore();
		playstore.playStoreId=457;
		playstore.applicationName="Hill climb racing";
		playstore.type="Gaming";
		playstore.sizeInMb=58;
		playstore.ratedInStar=4.2;
		System.out.println(playstore.applicationName);
		System.out.println(playstore.hashCode());
		
		boolean type=playstore.equals(play);
		System.out.println(type);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}