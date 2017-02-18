package com.texon.service;

import java.util.List;

import com.texon.vo.AllowancesVO;
import com.texon.vo.BankVO;
import com.texon.vo.DeductionVO;
import com.texon.vo.EmpListVO;
import com.texon.vo.SalaryVO;

public interface Service {
	
	public List<EmpListVO> empListgetBy(String name);

	public boolean login(String userId, String password);

	

	public List<EmpListVO> empAllUserView(String name);

	public List<BankVO> BankAllUserView(String name);

	public List<DeductionVO> deductionUserView(String name);



	public List<AllowancesVO> AllowAllUserView(String name);

	public List<SalaryVO> salaryAllUserView(String name);

	public List<EmpListVO> empAllUserView();

	public List<EmpListVO> empUserView(String name);

	public List<EmpListVO> empDisplayView();

	

	public List<EmpListVO> empUserAdd(String name, String emplName,
			String city, String designation);

	public List<AllowancesVO> AllowAllListView(String name);


	}

