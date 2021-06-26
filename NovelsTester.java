class NovelsTester{

public static void main(String a[]){

Novels novels=new Novels("Life's amazing secret","non fictional","Gaur Gopal Das","17 September 2018");
novels.printNovelsDetails();
Novels novel=new Novels("The monk who sold his ferrari","non fictional","Robin Sharma","1996");
novel.printNovelsDetails();
Novels nov=new Novels("The Alchemist","fictional","Paulo Coelho","1988");
nov.printNovelsDetails();

Novels.gainKnowledge();
}
}