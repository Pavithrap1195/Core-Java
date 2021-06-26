class OperatingSystems{

String name;
String developer;
String releasedOn;
String kernelType;
String availableIn;

public void printOSDetails(){
	System.out.println(name+" "+developer+" "+releasedOn+""+kernelType+" "+availableIn);
}

public OperatingSystems(String nam,String develop,String release,String kernel,String available){
	name=nam;
	developer=develop;
	releasedOn=release;
	kernelType=kernel;
	availableIn=available;
}

public static void managesComputer(){
	System.out.println("Operating Systems manages computers");
}

}