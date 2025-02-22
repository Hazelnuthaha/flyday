package web.emp.empinfo.dao;

import java.util.List;

import web.emp.empinfo.entity.Emp;

public interface EmpDao {
	

	int insert(Emp emp);

	int deleteByEmpNo(Integer empNo);
	
	int update(Emp emp);
	
	Emp selectByEmpNo(Integer empNo);
	
	Emp selectByEmpStatus(Integer empStatus);
	
	Emp selectAccAndPwd(String empAcc, String empPwd);

	Emp selectByEmpAcc(String empAcc);
	
	List<Emp> selectAll();


	
}
