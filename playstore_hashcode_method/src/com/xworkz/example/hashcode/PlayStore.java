package com.xworkz.example.hashcode;

public class PlayStore {
	
	public int playStoreId;
	public String applicationName;
	public String type;
	public int sizeInMb;
	public double ratedInStar;
	
	public PlayStore() {
		System.out.println();
	}
	
	@Override
	public int hashCode(){
		return this.playStoreId;
	}
	
	@Override
	public boolean equals(Object playstore) {
		if(playstore instanceof PlayStore) {
			PlayStore store=(PlayStore)playstore;
			if(this.hashCode()==store.hashCode()) {
				return true;
			}else {
				System.out.println("Hash code are different");
			}
			if(this.applicationName.equals(store.applicationName)) {
				return true;
			}else {
				System.out.println("Names are different");
			}
			if(this.type.equals(store.type)) {
				return true;
			}else {
				System.out.println("Different type");
			}
			if(this.sizeInMb==store.sizeInMb) {
				return true;
			}else {
				System.out.println("Sizes are different");
			}
			if(this.ratedInStar==store.ratedInStar) {
				return true;
			}else {
				System.out.println("Rated in star are different");
			}
		}else {
			System.out.println("Not a same type");
			return false;
		}
		return false;
	}

}
