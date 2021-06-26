class Speaker{

public static String brandName="JBL";
public static String color="Black";
public static int minVolLevel=0;
public static int currentVolume=0;
public static int maxVolumeLevel=6;
public static boolean connected;

public static void  onOrOff(){
	System.out.println("Inside onOrOff() method");
if(connected==false){
connected=true;
System.out.println("Speaker is turned on...");
}
else if(connected==true){
	connected=false;
	System.out.println("Speaker is turned off.....");
}
}
public static int increaseVolume(){
if(connected==true){
	if(currentVolume < maxVolumeLevel){
currentVolume=currentVolume+1;
System.out.println("The current volume is"+currentVolume);
	}
	else{
		System.out.println("max volume reached");
	}
}
else{
	System.out.println("Speaker is off");
}
return currentVolume;
}

public static int decreaseVolume(){
	if(connected==true){
if(currentVolume> minVolLevel){
currentVolume=currentVolume-1;
System.out.println("The current volume is"+currentVolume);
}
else{
	System.out.println("min volume reached");
}
	}
	else{
		System.out.println("Speaker is off");
	}
	
	return currentVolume;
}

public static void main(String a[]){
	onOrOff();
	int volume=increaseVolume();
	System.out.println(volume);
	increaseVolume();
increaseVolume();
increaseVolume();
increaseVolume();
increaseVolume();
increaseVolume();
decreaseVolume();
decreaseVolume();
decreaseVolume();
decreaseVolume();
decreaseVolume();
decreaseVolume();
decreaseVolume();
onOrOff();
}
}



















