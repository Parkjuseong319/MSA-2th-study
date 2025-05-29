package edu.kosa.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("dao")
//@Component		// deptDAOImpl bean 생성한다.
public class DeptDAOImpl implements DeptDAO {


	@Autowired
	private JdbcTemplate jdbcTemplate;		// DML 명령 처리 클래스
	
	
	@Override
	public List listDept() {
		String sql = "Select * from dept order by deptno desc";
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public void deleteDept(int no) {
		String sql = "delete from dept where deptno=?";
		this.jdbcTemplate.update(sql, no);
	}
	
	@Override
	public void insertDept(DeptDTO dto) {
		String sql = "insert into dept(deptno, dname, loc) values(?,?,?)";
		Object[] arr = { dto.getDeptno(), dto.getDname(), dto.getLoc()};
		this.jdbcTemplate.update(sql, arr);
	}

}
