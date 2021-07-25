class Mobile{
	
	
	private ApplicationDTO[] apps;
	private int index;
	
	public Mobile(int size){
		apps =new ApplicationDTO[size];
		System.out.println(this.getClass().getSimpleName()+"object is created");
	}
	
	public boolean createApps(ApplicationDTO apps){
		boolean createdapps=false;
		System.out.println("Invoked create apps method");
		if(apps!=null){
			if(apps.getName()!=null && apps.getApplicationId()>0){
				this.apps[index++]=apps;
				createdapps=true;
			}else{
				System.out.println("Id must be greater than zero");
				}
		}else{
			System.out.println("ApplicationDTO is not found");
			}
		return createdapps;
	}
	
	public void getApps(){
		System.out.println("Invoked getApps()");
		for(ApplicationDTO appDTO : apps){
			if(appDTO!=null){
				System.out.println(appDTO.getApplicationId()+" "+appDTO.getName()+" "+appDTO.getType()+" "+appDTO.getSizeInMb()+" "+appDTO.getInternetRequired());
			}else{
				System.out.println("ApplicationDTO is not found");
				}
		}
	}
	
	
	
	public boolean updateAppSizeByName(String sizeInMb,String name){
			boolean updatedSize=false;
			System.out.println("Invoked updateAppSizeByName method");
			for(ApplicationDTO dto : apps){
				if(name!=null && sizeInMb!=null){
					if(name.equals(dto.getName())){
						dto.setSizeInMb(sizeInMb);
						updatedSize=true;
					}else{
						System.out.println(name+" not found");
					}
				}else{
					System.out.println("Size and name are empty");
				}
			}
			return updatedSize;
	}
	
	public boolean deleteAppByApplicationId(int applicationId){
		boolean deleted=false;
		System.out.println("Invoked deleteAppByApplicationId method");
		for(int i=0;i<apps.length;i++){
			if(apps[i]!=null){
				if(applicationId==apps[i].getApplicationId()){
					apps[i]=null;
					deleted=true;
				}else{
					System.out.println(applicationId+" not found");
				}
			}else{
				System.out.println("App details is empty");
			}
		}
		return deleted;
	}
	
	public void getAppsByApplicationId(int applicationId){
		System.out.println("Invoked getAppsByApplicationId");
		for(ApplicationDTO ap : apps){
			if(ap!=null){
				if(applicationId==ap.getApplicationId()){
					System.out.println(ap.getApplicationId()+" "+ap.getName()+" "+ap.getType()+" "+ap.getSizeInMb()+" "+ap.getInternetRequired());
				}else{
					System.out.println("ApplicationId not found");
				}
			}else{
				System.out.println("ApplicationDTO not found");
			}
		}
	}
	
	public void getApplicationByType(String type){
		System.out.println("Invoked getApplicationByType()");
		for(ApplicationDTO dto2 : apps){
			if(dto2!=null){
				if(type.equals(dto2.getType())){
					System.out.println(dto2.getApplicationId()+" "+dto2.getName()+" "+dto2.getType()+" "+dto2.getSizeInMb()+" "+dto2.getInternetRequired());
				}else{
					System.out.println("Application type not found");
				}
			}else{
				System.out.println("ApplicationDTO not found");
			}
		}
	}
	
	public void getApplicationByInternetRequired(boolean internetRequired){
		System.out.println("Invoked getApplicationByInternetRequired()");
		for(ApplicationDTO dt : apps){
			if(dt!=null){
				if(internetRequired==dt.getInternetRequired()){
					System.out.println(dt.getApplicationId()+" "+dt.getName()+" "+dt.getType()+" "+dt.getSizeInMb()+" "+dt.getInternetRequired());
				}else{
					System.out.println("Application type not found");
				}
			}else{
				System.out.println("ApplicationDTO not found");
			}
		}
	}
					
					
			
				
				
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}