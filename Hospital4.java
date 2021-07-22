class Hospital4{
	
	private String name;
	public PatientDTO[] patients;
	private int index;
	
	public Hospital4(int size){
		patients=new PatientDTO[size];
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}
	
	public void savePatients(PatientDTO patients){
		if(patients!=null){
			System.out.println("Adding patients details");
			this.patients[index]=patients;
		}
		else{
			System.out.println("Patient details empty...please fill it");
		}
	}
	
	public void getPatient(){
		for(int i=0;i<patients.length.i++){
			if(patients[i]!=null){
				System.out.println(patients[i].getPatientId()+""+patients[i].getName()+""+patients[i].getAge()+""patients[i].getMobileNo());
			}
			else{
				System.out.println("No patients found");
			}
		}
	}
	
	public boolean updatePatientsMobileNoByPatientId(long mobileNo,String patientId){
		boolean updateMobileNo=false;
		for(int i=0;i<patients.length;i++){
			if(patients[i]!=null){
				if(patientId.equals(patients[i].getPatientId())){
					patients[i].setMobileNo(mobileNo);
					updateMobileNo=true;
				}
			}
		}
		return updateMobileNo;
	}
	
	public boolean deletePatientByName(String name){
		boolean deleted=false;
		for(int i=0;i<patients.length;i++){
			if(patients[i]!=null){
				if(name.equals(patients[i].getName())){
					patients[i]=null;
					deleted=true;
				}
			}
		}
		return deleted;
	}
	
	public void getPatientByPatientId(String patientId){
		for(int i=0;i<patients.length;i++){
			if(patients[i]!=null){
				if(patientId.equals(patients[i].getPatientId())){
					System.out.println(patients[i].getPatientId()+""+patients[i].getName()+""+patients[i].getAge()+""patients[i].getMobileNo());
				}
				else{
					System.out.println("No patients found");
				}
			}
		}
	}
	
	public String getStateNamesByPatientName(String name){
		String stateName=null;
		for(int i=0;i<patients.length;i++){
			if(patients[i]!=null){
				if(name.equals(patients[i].getName())){
					for(StateDTO state : patients[i].getAddress().getCountries().getStates()){
						stateName=state.getStateName();
					}
				}
			}
		}
		return stateName;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setIndex(int index){
		this.index=index;
	}
	
	public int getIndex(){
		return index;
	}
			
					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}