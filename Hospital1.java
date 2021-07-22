class Hospital1{
	
	private String name;
	public PatientDTO[] patients;
	private int index;
	
	public Hospital1(int size){
		patients=new PatientDTO[size];
		System.out.println(this.getClass().getSimpleName()+" object is created");
	}
	
	public void savePatients(PatientDTO patients){
		if(patients!=null){
			System.out.println("Adding patients details");
			this.patients[index]=patients;
		}
		else{
			System.out.println("Patient details are empty...Please add the patient details");
		}
	}
	
	public void getPatients(){
		for(int i=0;i<patients.length;i++){
			if(patients[i]!=null){
				System.out.println(patients[i].getPatientId()+""+patients[i].getName()+""+patients[i].getMobileNo()+""+patients[i].getAge());
			}
			else{
				System.out.println("No patients found");
			}
		}
	}
	
	public boolean updatePatientsMobileNoByPatientId(long mobileNo,String patientId){
		System.out.println("Invoked updatePatientsMobileNoByPatientId()");
		boolean updatedMobileNo=false;
		for(int i=0;i<patients.length;i++){
			if(patients[i]!=null){
				if(patientId.equals(patients[i].getPatientId())){
					patients[i].setMobileNo(mobileNo);
					updatedMobileNo=true;
				}
			}
		}
		return updatedMobileNo;
	}
	
	public boolean deletePatientById(String patientId){
		System.out.println("Invoked deletePatientById()");
		boolean deleted=false;
		for(int i=0;i<patients.length;i++){
			if(patients[i]!=null){
				if(patientId.equals(patients[i].getPatientId())){
					patients[i]=null;
					deleted=true;
				}
			}
		}
		return deleted;
	}
	
	
	public void getPatientByName(String name){
		System.out.println("Invoked getPatientByName()");
		for(int i=0;i<patients.length;i++){
			if(patients[i]!=null){
				if(name.equals(patients[i].getName())){
					System.out.println(patients[i].getPatientId()+""+patients[i].getName()+""+patients[i].getMobileNo()+""+patients[i].getAge());
				}
				else{
					System.out.println("No patient found");
				}
			}
		}
	}
	
	public void getPatientAgeByName(String name){
		System.out.println("Invoked getPatientAgeByName()");
		for(int i=0;i<patients.length;i++){
			if(patients[i]!=null){
				if(name.equals(patients[i].getName())){
					System.out.println(patients[i].getAge());
				}
				else{
					System.out.println("No patient found");
				}
			}
		}
	}
	
	public String getStateNamesByPatientName(String name){
		String stateName=null;
		for(int i=0;i<patients.length;i++){
			if(patients[i]!=null){
				if(name.equals(patients[i].getName())){
					for(StateDTO state: patients[i].getAddress().getCountries().getStates()){
						stateName=state.getStateName();
					}
				}
			}
		}
		return stateName;
	}
	
	public String getStreetNamesByPatientId(String patientId){
		String streetName=null;
		for(int i=0;i<patients.length;i++){
			if(patients[i]!=null){
				if(patientId.equals(patients[i].getPatientId())){
					for(StateDTO state: patients[i].getAddress().getCountries().getStates()){
						for(CityDTO city:state.getCities()){
							for(AreaDTO area: city.getAreas()){
								System.out.println(area.getStreets());
								for(StreetDTO street: area.getStreets()){
									streetName=street.getStreetName();
								}
							}
						}
					}
				}
			}
		}
		return streetName;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getIndex(){
		return index;
	}
	
	public void setIndex(int index){
		this.index=index;
	}
	
		
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}