import java.util.Scanner;

class CoconutTreeUtil{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the tree id");
int treeId=sc.nextInt();
System.out.println("Enter the kingdom");
String kingdom=sc.next();
sc.close();
CoconutTree tree=new CoconutTree();
tree.treeId=treeId;
tree.kingdom=kingdom;
tree.getHealth();
System.out.println(treeId+" "+kingdom);
}
}