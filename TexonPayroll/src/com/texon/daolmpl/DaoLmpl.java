package com.texon.daolmpl;

import java.util.List;

import com.texon.Dao.Dao;
import com.texon.service.Service;
import com.texon.servicempl.ServicImpl;
import com.texon.vo.AllowancesVO;
import com.texon.vo.BankVO;
import com.texon.vo.DeductionVO;
import com.texon.vo.EmpListVO;
import com.texon.vo.SalaryVO;



public class DaoLmpl implements Dao{
	public List<EmpListVO> empListgetBy(String name){
		
		Service service = new ServicImpl();
		List<EmpListVO> empListVO= service.empListgetBy(name);
		return empListVO;
		
	}	
	public boolean login(String userId , String password){
		// TODO Auto-generated method stub
		Service service = new ServicImpl();
		boolean result= service.login(userId ,password);
		return result;
	}

	@Override
	public List<EmpListVO> empAllUserView(String name) {
		// TODO Auto-generated method stub
		Service service = new ServicImpl();
		List<EmpListVO> empListVO= service.empAllUserView(name);
		return empListVO;
	}

	@Override
	public List<BankVO> BankAllUserView(String name) {
		// TODO Auto-generated method stub
		Service service = new ServicImpl();
		List<BankVO> bankListVO = service.BankAllUserView(name);
		return bankListVO;
	}

	@Override
	public List<DeductionVO> deductionUserView(String name) {
		// TODO Auto-generated method stub
		Service service = new ServicImpl();
		List<DeductionVO> deductionVO = service.deductionUserView(name);
		return deductionVO;

	}
	@Override
	public List<AllowancesVO> AllowAllUserView(String name) {
		// TODO Auto-generated method stub
		Service service = new ServicImpl();
		List<AllowancesVO> allowanceVO = service.AllowAllUserView(name);
		return allowanceVO;
	}

	@Override
	public List<SalaryVO> salaryAllUserView(String name) {
		// TODO Auto-generated method stub
		Service service = new ServicImpl();
		List<SalaryVO> salryuserVO = service.salaryAllUserView(name);
		return salryuserVO;
	}
	@Override
	public List<EmpListVO> empAllUserView() {
	Service service = new ServicImpl();
	List<EmpListVO> empListVO= service.empAllUserView();
	return empListVO;
	}
	@Override
	public List<EmpListVO> empUserView(String name) {
		// TODO Auto-generated method stub
		Service service = new ServicImpl();
		List<EmpListVO> empListVO= service.empUserView(name);
		return empListVO;
	}

	@Override
	public List<EmpListVO> empDisplayView() {
		// TODO Auto-generated method stub
		Service service = new ServicImpl();
		List<EmpListVO> empDisplayVO=service.empDisplayView();
		return empDisplayVO;
	}
	@Override
	public List<EmpListVO> empUserAdds(String name, String emplName,
			String city, String designation) {
		// TODO Auto-generated method stub
		Service service = new ServicImpl();
		List<EmpListVO> empUserAdd = service.empUserAdd(name,emplName,city,designation);
		return empUserAdd;
	}

	@Override
	public List<AllowancesVO> DemoAllowList(String name) {
		// TODO Auto-generated method stub
		Service service = new ServicImpl();
		List<AllowancesVO> allowanceVO = service.AllowAllListView(name);
		return allowanceVO;
	}
}
