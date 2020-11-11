package com.kg.myapp.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.kg.myapp.dao.EmpRepository;
import com.kg.myapp.dao.IEmpRepository;
import com.kg.myapp.vo.EmpVO;

@Service
public class EmpService implements IEmpService{
	
	
	
	@Autowired
	@Qualifier("IEmpRepository")
	IEmpRepository empRepository;
	
	public EmpVO selectEmployee(int empId) {
		return empRepository.selectEmployee(empId);
	}
	

	public List<EmpVO> selectAllEmployees(){
		return empRepository.selectAllEmployees();
	}
	
	public int getEmpCount() { 
		return empRepository.getEmpCount(); 
	}
	
	public int getEmpCount(int deptId) { 
		return empRepository.getEmpCount(deptId); 
	}
	
	public List<EmpVO> getEmpList() { 
		return empRepository.getEmpList(); 
	}

	public EmpVO getEmpInfo(int empId) { 
		return empRepository.getEmpInfo(empId); 
	}
	
	public void updateEmp(EmpVO emp) { 
		empRepository.deleteJobHistory(emp.getEmployeeId());
		empRepository.updateEmp(emp); 
	}
	
	public void insertEmp(EmpVO emp) { 
		empRepository.insertEmp(emp); 
	}
	
	public void deleteEmp(int empId) { 		
		empRepository.deleteJobHistory(empId); 
		empRepository.updateManagers(empId); 
		empRepository.deleteEmp(empId); 
	}
	
	public void deleteJobHistory(int empId) { 
		empRepository.deleteJobHistory(empId); 
	}
	
	public List<Map<String, Object>> getAllDeptId() { 
		return empRepository.getAllDeptId(); 
	}
	
	public List<Map<String, Object>> getAllJobId() { 
		return empRepository.getAllJobId(); 
	}
	
	public List<Map<String, Object>> getAllManagerId() { 
		return empRepository.getAllManagerId(); 
	}
	
	@Override
	public List<EmpVO> selectDepartment(int deptId) {
		return empRepository.selectDepartment(deptId);
	}


	@Override
	public List<EmpVO> selectName(String nameId) {
		nameId = "%"+nameId+"%";
		return empRepository.selectName(nameId);
	}


	@Override
	public int idCheck(int empId) {
		return empRepository.idCheck(empId);
	}
	
	

	
}






















