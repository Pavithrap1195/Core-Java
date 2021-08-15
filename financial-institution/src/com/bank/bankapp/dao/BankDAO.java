package com.bank.bankapp.dao;

import com.bank.bankapp.dto.BranchDTO;

public interface BankDAO {
	
	public boolean createBranch(BranchDTO branch);
	
	public BranchDTO[] getBranch();
	
	public boolean updateContactNumberByBranchId(long contactNumber, int branchId);
	
	public boolean deletedBranchByIFSCCode(String ifscCode);

}
