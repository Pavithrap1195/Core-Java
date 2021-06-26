class ConstructionMaterialsTester{

public static void main(String a[]){

ConstructionMaterials constructionmaterials=new ConstructionMaterials("Cement",2.8,"binder",1440);
constructionmaterials.printConsMaterials();
ConstructionMaterials construction=new ConstructionMaterials("Steel",8.05,"strength",7850);
construction.printConsMaterials();
ConstructionMaterials construct=new ConstructionMaterials("Bricks",1.6,"building blocks",1600);
construct.printConsMaterials();

ConstructionMaterials.construction();
}
}