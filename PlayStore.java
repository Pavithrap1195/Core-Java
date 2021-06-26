class PlayStore{
String applicationName;
String type;
int sizeInMb;
double ratedInStar;
public static void main(String a[]){
	System.out.println("Main Method Started");

PlayStore playstore=new PlayStore();
playstore.applicationName="Hill Climb racing";
playstore.type="Gaming";
playstore.sizeInMb=58;
playstore.ratedInStar=4.2;
System.out.println(playstore.applicationName+" is a "+playstore.type+" app of size "+playstore.sizeInMb+" mb and rated "+playstore.ratedInStar+" star ");

PlayStore play=new PlayStore();
play.applicationName="Voot";
play.type="Apps";
play.sizeInMb=20;
play.ratedInStar=3.7;
System.out.println(play.applicationName+" is a "+play.type+"  of size "+play.sizeInMb+" mb and rated "+play.ratedInStar+" star ");

PlayStore store=new PlayStore();
store.applicationName="The magic of thinking big";
store.type="Book";
store.sizeInMb=2;
store.ratedInStar=4.3;
System.out.println(store.applicationName+" is a "+store.type+"  of size "+store.sizeInMb+" mb and rated "+store.ratedInStar+" star ");
	System.out.println("Main Method Ended");
}
}