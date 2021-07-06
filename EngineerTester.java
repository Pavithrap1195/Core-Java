class EngineerTester{
	
	public static void main(String a[]){
		Engineer engineer=new Engineer();
		engineer.setUSN("USN changes with branch");
		engineer.problemSolving();
		System.out.println(engineer.getUSN());
		System.out.println("***************************************************");
		CSEngineer cs =new CSEngineer();
		cs.setUSN("1JB13CS075");
		cs.setCompanies("Wipro,Dell,IBM,etc..,");
		System.out.println(cs.getBranch());
		System.out.println(cs.getUSN());
		System.out.println(cs.getCompanies());
		cs.problemSolving();
		cs.coding();
		System.out.println("***************************************************");
		CivilEngineer cv =new CivilEngineer();
		cv.setUSN("1JB13CV090");
		cv.setCompanies("Shobha,Mantri,Rohanetc..,");
		System.out.println(cv.getBranch());
		System.out.println(cv.getUSN());
		System.out.println(cv.getCompanies());
		cv.problemSolving();
		cv.construction();
		System.out.println("***************************************************");
		MechanicalEngineer me =new MechanicalEngineer();
		me.setUSN("1JB13ME088");
		me.setCompanies("toyota,etc..,");
		System.out.println(me.getBranch());
		System.out.println(me.getUSN());
		System.out.println(me.getCompanies());
		me.problemSolving();
		me.designing();
		System.out.println("***************************************************");
		ISEngineer IS =new ISEngineer();
		IS.setUSN("1JB13IS089");
		IS.setCompanies("Wipro,Dell,IBM,etc..,");
		System.out.println(IS.getBranch());
		System.out.println(IS.getUSN());
		System.out.println(IS.getCompanies());
		IS.problemSolving();
		IS.programming();
		System.out.println("***************************************************");
		TCEngineer tc =new TCEngineer();
		tc.setUSN("1JB13TC077");
		tc.setCompanies("Paramavah,Bridgei2p,etc..,");
		System.out.println(tc.getBranch());
		System.out.println(tc.getUSN());
		System.out.println(tc.getCompanies());
		tc.problemSolving();
		tc.telephoneServices();
		System.out.println("***************************************************");
		ECEngineer EC =new ECEngineer();
		EC.setUSN("1JB13EC055");
		EC.setCompanies("Intel,Cisco,etc..,");
		System.out.println(EC.getBranch());
		System.out.println(EC.getUSN());
		System.out.println(EC.getCompanies());
		EC.problemSolving();
		EC.electronicEquipment();
		System.out.println("***************************************************");
		EEEEngineer EEE =new EEEEngineer();
		EEE.setUSN("1JB13EC055");
		EEE.setCompanies("Flakt,ford,etc..,");
		System.out.println(EEE.getBranch());
		System.out.println(EEE.getUSN());
		System.out.println(EEE.getCompanies());
		EEE.problemSolving();
		EEE.designCircuits();
		
		System.out.println("***************************************************");
		Engineer eng=new CSEngineer();
		System.out.println(eng.getBranch());
		Engineer eng1=new CivilEngineer();
		System.out.println(eng1.getBranch());
		Engineer eng2=new MechanicalEngineer();
		System.out.println(eng2.getBranch());
		Engineer eng3=new ISEngineer();
		System.out.println(eng3.getBranch());
		Engineer eng4=new TCEngineer();
		System.out.println(eng4.getBranch());
		Engineer eng5=new ECEngineer();
		System.out.println(eng5.getBranch());
		Engineer eng6=new EEEEngineer();
		System.out.println(eng6.getBranch());
		
		}
		
		
		




}