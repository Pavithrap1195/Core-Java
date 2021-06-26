class MineralsTester{

public static void main(String a[]){

Minerals minerals=new Minerals("Copper","Cu",29,8.96,"orange");
minerals.printMineralsDetails();
Minerals mineral=new Minerals("Manganese","Mn",25,7.21,"purple");
mineral.printMineralsDetails();
Minerals minera=new Minerals("Iron","Fe",26,7.874,"silvery grey");
minera.printMineralsDetails();

Minerals.naturallyoccuring();
}
}