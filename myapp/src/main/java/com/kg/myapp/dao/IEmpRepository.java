package com.kg.myapp.dao;

import java.util.List;
import java.util.Map;

import com.kg.myapp.vo.EmpVO;

public interface IEmpRepository {

	int getEmpCount();

	int getEmpCount(int deptId);

	List<EmpVO> getEmpList();

	EmpVO getEmpInfo(int empId);

	void updateEmp(EmpVO emp);

	void insertEmp(EmpVO emp);

	void deleteEmp(int empId);

	void deleteJobHistory(int empId);

	List<Map<String, Object>> getAllDeptId();

	List<Map<String, Object>> getAllJobId();

	List<Map<String, Object>> getAllManagerId();
	
	List<EmpVO> selectDepartment(int deptId);
	
	List<EmpVO> selectName(String nameId);
	
	void updateManagers(int empId);

	EmpVO selectEmployee(int empId);

	List<EmpVO> selectAllEmployees();
	public int idCheck(int empId);


}
