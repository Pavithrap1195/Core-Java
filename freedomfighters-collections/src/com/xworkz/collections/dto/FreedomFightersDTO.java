package com.xworkz.collections.dto;

public class FreedomFightersDTO implements Comparable<FreedomFightersDTO> {
	
	private int freedomFightersId;
	private String name;
	private String bornOn;
	
	public FreedomFightersDTO() {
		// TODO Auto-generated constructor stub
	}

	public FreedomFightersDTO(int freedomFightersId, String name, String bornOn) {
		super();
		this.freedomFightersId = freedomFightersId;
		this.name = name;
		this.bornOn = bornOn;
	}

	public int getFreedomFightersId() {
		return freedomFightersId;
	}

	public void setFreedomFightersId(int freedomFightersId) {
		this.freedomFightersId = freedomFightersId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBornOn() {
		return bornOn;
	}

	public void setBornOn(String bornOn) {
		this.bornOn = bornOn;
	}

	@Override
	public String toString() {
		return "FreedomFightersDTO [freedomFightersId=" + freedomFightersId + ", name=" + name + ", bornOn=" + bornOn
				+ "]";
	}
	
	@Override
	public int compareTo(FreedomFightersDTO o) {
		// TODO Auto-generated method stub
		return this.getFreedomFightersId()-o.getFreedomFightersId();
	}

}
