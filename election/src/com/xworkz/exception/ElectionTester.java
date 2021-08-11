package com.xworkz.exception;

import com.xworkz.exception.example.ElectionException;
import com.xworkz.exception.vote.VoterId;

public class ElectionTester {
	
	public static void main(String[] args) {
		
		VoterId id = new VoterId();
		try {
			id.rightToVote(19);
		} catch (ElectionException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
