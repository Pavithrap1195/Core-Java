package com.bank.bankapp.dao;

import com.bank.bankapp.dto.BranchDTO;

public class BankDAOImpl implements BankDAO {

	private BranchDTO[] branch;
	private int index;

	public BankDAOImpl(int size) {
		branch = new BranchDTO[size];
	}

	@Override
	public boolean createBranch(BranchDTO branch) {
		boolean createdBranch = false;
		if (branch != null && !branch.getBranchName().isEmpty()) {
			this.branch[index++] = branch;
			createdBranch = true;
		} else if (branch.getBranchName().isEmpty()) {
			System.out.println("Branch not found");
		}
		return createdBranch;
	}

	@Override
	public BranchDTO[] getBranch() {
		return branch;
	}

	@Override
	public boolean updateContactNumberByBranchId(long contactNumber, int branchId) {
		boolean updatedContactNumber = false;
		if (branchId > 0) {
			for (BranchDTO branchDTO : branch) {
				if (branchDTO.getBranchId() == branchId) {
					branchDTO.setContactNumber(contactNumber);
					updatedContactNumber = true;
				} else {
					System.out.println("Branch not found");
				}
			}
		}
		return updatedContactNumber;
	}

	@Override
	public boolean deletedBranchByIFSCCode(String ifscCode) {
		boolean deletedBranch = false;
		for (int i = 0; i < branch.length; i++) {
			if (branch[i] != null) {
				if (branch[i].getIfscCode().equals(ifscCode)) {
					branch[i] = null;
					deletedBranch = true;
				} else {
					System.out.println("Branch not found");
				}
			}
		}
		return deletedBranch;
	}

}
