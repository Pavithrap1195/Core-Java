import java.util.Scanner;

class HospitalTester{
	
	public static void main(String a[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		Hospital hospital =new Hospital(size);
		Hospital1 hospital1=new Hospital1(size);
		
		
		PatientDTO dto=new PatientDTO();
		dto.setName("Hemanth");
		dto.setPatientId("1");
		dto.setAge(45);
		dto.setMobileNo(7897987858L);
		/*String addressDetails[]={"Hampinagar,Bangalore-56004","Hubbali,Karnataka-789788"};
		dto.setAddress(addressDetails);*/
		AddressDTO address =new AddressDTO();
			CountryDTO country =new CountryDTO();
			country.setCountryName("India");
				StateDTO state=new StateDTO();
				state.setStateName("Karnataka");
				CityDTO city=new CityDTO();
				city.setCityName("Bangalore");
				AreaDTO area =new AreaDTO();
				area.setAreaName("Indiranagar");
				StreetDTO street=new StreetDTO();
				street.setStreetName("Hal road");
				String streetNo[]={"34","57"};
				street.setStreetNo(streetNo);
	
				StateDTO state1=new StateDTO();
				state1.setStateName("Rajasthan");
				CityDTO city1=new CityDTO();
				city1.setCityName("Udaipur");
				AreaDTO area1 =new AreaDTO();
				area1.setAreaName("Sector14");
				StreetDTO street1=new StreetDTO();
				street1.setStreetName("manik road");
				String streetNo1[]={"39","58"};
				street1.setStreetNo(streetNo1);
				
				StreetDTO street2=new StreetDTO();
				street2.setStreetName("Hal road");
				String streetNo2[]={"34","57"};
				street2.setStreetNo(streetNo2);
				
				StreetDTO street3=new StreetDTO();
				street3.setStreetName("Hal road");
				String streetNo3[]={"34","57"};
				street3.setStreetNo(streetNo3);
	
	
				
		StreetDTO streets[]={street,street1};
		StreetDTO streets1[]={street2,street3};
		area.setStreets(streets);
		area1.setStreets(streets1);
		AreaDTO areas[]={area,area1};
		city.setAreas(areas);
		city1.setAreas(areas);
		CityDTO cities[]={city,city1};
		state.setCities(cities);
		state1.setCities(cities);
		StateDTO states[]={state,state1};
		country.setStates(states);
		address.setCountries(country);
		dto.setAddress(address);
	
		
		/*PatientDTO patient=new PatientDTO();
		patient.setName("Kishan");
		patient.setPatientId("2");
		patient.setAge(55);
		patient.setMobileNo(7897987868L);
		String addressDetails1[]={"Vijaynagar,Bangalore-56004","Bidar,Karnataka-789789"};
		patient.setAddress(addressDetails1);*/
		
		/*hospital.savePatients(dto);*/
		hospital1.savePatients(dto);
		/*hospital.savePatients(patient);*/
		
		/*hospital.getPatients();*/
		hospital1.getPatients();
		/*hospital.updatePatientsMobileNoByPatientId(9856452635L,"1");
		hospital.getPatients();
		hospital.deletePatientById("1");
		hospital.getPatients();
		hospital.getPatientByName("Hemanth");
		hospital.getPatientByName("Kishan");
		hospital.getPatientAgeByName("Kishan");*/
		
		/*String stateName=hospital.getStateNamesByPatientName("Hemanth");
		System.out.println(stateName);*/
		
		/*String streetName=hospital.getStreetNameByPatientId("1");
		System.out.println(streetName);*/
		
		String streetName= hospital1.getStreetNamesByPatientId("1");
		System.out.println(streetName);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}