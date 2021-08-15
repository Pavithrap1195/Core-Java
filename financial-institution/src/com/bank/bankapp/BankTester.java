package com.bank.bankapp;

import java.util.Scanner;

import com.bank.bankapp.dao.BankDAO;
import com.bank.bankapp.dao.BankDAOImpl;
import com.bank.bankapp.dto.BranchDTO;

public class BankTester {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		BankDAO bankDAO = new BankDAOImpl(size);
		
		for (int i = 0; i < size; i++) {
			
			BranchDTO bran = new BranchDTO();
			bran.setBranchId(sc.nextInt());
			bran.setBranchName(sc.next());
			bran.setIfscCode(sc.next());
			bran.setAddress(sc.next());
			bran.setContactNumber(sc.nextLong());
			
			bankDAO.createBranch(bran);
			
		}
		
		BranchDTO[] branchDTO = bankDAO.getBranch();
		for (BranchDTO branchDTO2 : branchDTO) {
			System.out.println(branchDTO2);
		}
		
		System.out.println("Enter the branch contact number with branch id");
		bankDAO.updateContactNumberByBranchId(sc.nextLong(), sc.nextInt());
		
		BranchDTO[] branchDTO1 = bankDAO.getBranch();
		for (BranchDTO branchDTO2 : branchDTO1) {
			System.out.println(branchDTO2);
		}
		
		System.out.println("Enter the bank ifsccode to delete branch");
		bankDAO.deletedBranchByIFSCCode(sc.next());
		
		BranchDTO[] branchDTO3 = bankDAO.getBranch();
		for (BranchDTO branchDTO2 : branchDTO3) {
			System.out.println(branchDTO2);
		}
	}

}
