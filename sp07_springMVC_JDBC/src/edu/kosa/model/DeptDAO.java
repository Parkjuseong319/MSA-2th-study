package edu.kosa.model;

import java.util.List;

public interface DeptDAO {
	List listDept();
	void insertDept(DeptDTO dto);
	void deleteDept(int no);
}
