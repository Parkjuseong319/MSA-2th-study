package com.model;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;		// DML 명령 처리 클래스
	
	@Override
	public MemberDTO selectMemberById(String id) throws Exception {		// 특정 아이디로 검색
		String sql = "SELECT * FROM USERMEMBER WHERE ID=?";
		
		try {
			return this.jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<MemberDTO>(MemberDTO.class));
//			return this.jdbcTemplate.queryForObject(sql, new Object{ id }, MemberDTO.class);
		} catch (Exception e) {
//			return new EmptyResultDataAccessException();		// 예외발생 시 null 리턴
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List memberById(String id) throws Exception {
		String sql = "SELECT * FROM USERMEMBER WHERE ID=?";
		
		return jdbcTemplate.queryForList(sql, id);
	}

	@Override
	public boolean memberCheck(String id, String pwd) throws SQLException {	// id check

		String sql = "SELECT * FROM USERMEMBER WHERE ID=? AND PWD=?";
		boolean flag = false;
		Object[] arr = { id, pwd };
		
		if(jdbcTemplate.queryForList(sql, arr).size() > 0) flag = true;
		return flag;
	}

	@Override
	public boolean memberInsert(String id, String name, String pwd, String email, int age) throws SQLException {
		String sql = "INSERT INTO USERMEMBER VALUES(?,?,?,?,?)";
		boolean flag = false;
		
		Object[] params = { id, name, pwd, email, age };
		if(jdbcTemplate.update(sql, params) > 0) flag = true;
		return flag;
	}

}
