class SuperMarket{
public static void main(String a[])
{
String perfume[]={"fogg","secret","engage","yardley","Wild stone"};
int amountPernumber[]={250,280,160,320,550};
System.out.println(perfume.length);
String value[]=fetchPerfumeAndPrice(perfume,amountPernumber);
for(String s:value)
{
System.out.println(s);
}
String vegetablesAndFruits[]={"strawberry","mango","tomato","potato","grapes"};
int amountPerkg[]={120,100,20,25,65};
System.out.println(vegetablesAndFruits.length);
String total[]=fetchVegetablesAndPrice(vegetablesAndFruits,amountPerkg);
for (String s:total)
{
	System.out.println(s);
}
String biscuits[]={"hide & seek","gooday","bourbon","moms magic","parleg"};
int amountPerPack[]={30,10,20,10,10};
System.out.println(biscuits.length);
String ans[]=fetchBiscuitWithPrice(biscuits,amountPerPack);
for(String s:ans){
	System.out.println(s);
}
String cereals[]={"wheat","rice","barley","oats","maize"};
int amountPerbag[]={560,900,200,250,620};
System.out.println(cereals.length);
String fact[]=fetchCerealsWithPrice(cereals,amountPerbag);
for (String s:fact){
	System.out.println(s);
}
String chocolate[]={"perk","dairymilk","milkybar","kitkat","munch"};
int amountPerPack1[]={10,120,50,60,10};
System.out.println(chocolate.length);
String sum[]=fetchChocolateWithPrice(chocolate,amountPerPack1);
for(String s: sum){
	System.out.println(s);
}
String soap[]={"mysore sandal","lux","santoor","margo","lifebuoy"};
int amountPerNumber[]={45,30,52,35,25};
System.out.println(soap.length);
String lumpsum[]=fetchSoapWithPrice(soap,amountPerNumber);
for(String s:lumpsum){
	System.out.println(s);
}
String cookingOil[]={"sunflower","goldwinner","coconut oil","olive oil","peanut oil"};
int amountPerLitre[]={110,100,85,250,150};
System.out.println(cookingOil.length);
String sumof[]=fetchCookingOilWithPrice(cookingOil,amountPerLitre);
for(String s: sumof){
	System.out.println(s);
}
String iceCream[]={"butterscotch","strawberry","vanila","mango","chocolate"};
int amountPerNo[]={25,30,50,40,60};
System.out.println(iceCream.length);
String sumup[]=fetchIcecreamWithPrice(iceCream,amountPerNo);
for(String s:sumup){
	System.out.println(s);
}
String accessories[]={"hair oil","comb","wallet","shampoo","nail polish"};
int amtPerNo[]={95,10,150,110,25};
System.out.println(accessories.length);
String combine[]=fetchAccessoriesWithPrice(accessories,amtPerNo);
for(String s: combine){
System.out.println(s);
}
String coolDrinks[]={"maaza","sprite","fanta","coke","mirinda"};
int amtPerLitre[]={50,30,65,55,45};
System.out.println(coolDrinks.length);
String total1[]=fetchCoolDrinksWithPrice(coolDrinks,amtPerLitre);
for(String s: total1){
System.out.println(s);
}
String jam[]={"strawberry jam","apple jam","carrot jam","wild plum jam","cherry jam"};
int amtPerBottle[]={120,150,65,220,160};
System.out.println(jam.length);
String sum1[]=fetchJamWithPrice(jam,amtPerBottle);
for(String s:sum1){
	System.out.println(s);
}
String proteinShake[]={"whey protein","casien protein","egg protein","pea protein","hemp protein"};
int amountPerBottle[]={250,230,160,240,180};
System.out.println(proteinShake.length);
String fact1[]=fetchProteinShakeWithPrice(proteinShake,amountPerBottle);
for(String s: fact1){
	System.out.println(s);
}
}

public static String[] fetchPerfumeAndPrice(String perf[],int amountPernumber[]){
	String totalperf[]=new String[perf.length];
//String perf=null;//
for(int i=0;i<perf.length;i++){
perf[i]=perf[i]+ " " +amountPernumber[i];
//System.out.println(perf);//
 totalperf[i]= perf[i];	
}
return totalperf;
}

public static String[] fetchVegetablesAndPrice(String veggie[],int amountPerkg[]){
String totalveggie[]=new String[veggie.length];
for(int i=0;i<veggie.length;i++){
veggie[i]=veggie[i]+" " +amountPerkg[i];
totalveggie[i]=veggie[i];
}
return totalveggie;
}

public static String[] fetchBiscuitWithPrice(String bisc[],int amountPerPack[]){
String ansbisc[]=new String[bisc.length];
for(int i=0;i<bisc.length;i++)
{
	bisc[i]=bisc[i]+" " + amountPerPack[i];
	ansbisc[i]=bisc[i];
}
return ansbisc;	
}

public static String[] fetchCerealsWithPrice(String cer[],int amountPerbag[]){
	String factcer[]=new String[cer.length];
for(int i=0;i<cer.length;i++){
cer[i]=cer[i]+" "+amountPerbag[i];
factcer[i]=cer[i];
}
return factcer;
}

public static String[] fetchChocolateWithPrice(String choco[],int amountPerPack1[]){
	String sumchoco[]=new String[choco.length];
for(int i=0;i<choco.length;i++){
choco[i]=choco[i]+" "+amountPerPack1[i];
sumchoco[i]=choco[i];
}
return sumchoco;
}

public static String[] fetchSoapWithPrice(String soa[],int amountPerNumber[]){
	String lumpsumsoa[]=new String[soa.length];
	for(int i=0;i<soa.length;i++){
		soa[i]=soa[i]+" "+amountPerNumber[i];
		lumpsumsoa[i]=soa[i];
	}
	return lumpsumsoa;
}

public static String[] fetchCookingOilWithPrice(String cook[],int amountPerLitre[]){
	String sumofcook[]=new String[cook.length];
for(int i=0;i<cook.length;i++){
cook[i]=cook[i]+" "+amountPerLitre[i];
sumofcook[i]=cook[i];
}
return sumofcook;	
}

public static String[] fetchIcecreamWithPrice(String ice[],int amountPerNo[]){
	String sumupice[]=new String[ice.length];
for(int i=0;i<ice.length;i++){
	ice[i]=ice[i]+" "+amountPerNo[i];
sumupice[i]=ice[i];
}
return sumupice;
}

public static String[] fetchAccessoriesWithPrice(String acc[],int amtPerNo[]){
	String combineacc[]=new String[acc.length];
for(int i=0;i<acc.length;i++){
acc[i]=acc[i]+" "+amtPerNo[i];
combineacc[i]=acc[i];
}
return combineacc;
}

public static String[] fetchCoolDrinksWithPrice(String cool[],int amtPerLitre[]){
String total1cool[]=new String[cool.length];
for(int i=0;i<cool.length;i++){
cool[i]=cool[i]+" "+amtPerLitre[i];
total1cool[i]=cool[i];
		}
return total1cool;
}

public static String[] fetchJamWithPrice(String ja[],int amtPerBottle[]){
String sum1ja[]=new String[ja.length];
for(int i=0;i<ja.length;i++){
ja[i]=ja[i]+" "+amtPerBottle[i];
sum1ja[i]=ja[i];
}
return sum1ja;	
}

public static String[] fetchProteinShakeWithPrice(String prot[],int amountPerBottle[]){
	String fact1prot[]=new String[prot.length];
	for(int i=0;i<prot.length;i++){
		prot[i]=prot[i]+" "+amountPerBottle[i];
		fact1prot[i]=prot[i];
	}
	return fact1prot;
}
}