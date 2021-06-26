class ResearchCentersTester{

public static void main(String a[]){

ResearchCenters researchcenters=new ResearchCenters("ISRO","15 August 1969","space agency","Kailasavadivoo Sivan","bangalore");
researchcenters.printResearchCentersDetails();
ResearchCenters researchcenter=new ResearchCenters("Raman Research Institute","1948","research institution","CV Raman","bangalore");
researchcenter.printResearchCentersDetails();
ResearchCenters research=new ResearchCenters("Jawaharlal Nehru Centre for Advanced Scientific Research","1989","Autonomous government institute","Prof. C. N. R. Rao","bangalore");
research.printResearchCentersDetails();

ResearchCenters.doingResearch();
}
}