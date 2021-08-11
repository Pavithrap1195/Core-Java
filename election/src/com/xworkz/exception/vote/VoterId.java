package com.xworkz.exception.vote;

import com.xworkz.exception.example.ElectionException;

public class VoterId {
	
	public void rightToVote(int age) throws ElectionException {
		if(age < 18) {
			throw new ElectionException();
		}else {
			System.out.println("You can vote");
		}
	}

}
