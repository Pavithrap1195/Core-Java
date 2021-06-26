class TreesTester{

public static void main(String a[]){

Trees tees=new Trees("Banyan tree","Plantae","Moraceae","Rosales");
tees.printTreesDetails();
Trees tree=new Trees("Neem tree","Plantae","Meliaceae","Sapindales");
tree.printTreesDetails();
Trees tre=new Trees("Coconut Tree","Plantae","Arecaceae","Arecales");
tre.printTreesDetails();

Trees.getHealth();
}
}