package com.model;

import java.sql.SQLException;
import java.util.List;

public interface MemberDAO {
	
	//ȸ�� �� ��ȸ
	MemberDTO selectMemberById(String id) throws Exception;
	List memberById(String id) throws Exception;
	
	//ȸ�� ���� �Ǵ��ϴ� ��ȸ
	boolean memberCheck(String id, String pwd) throws SQLException;
	
	boolean memberInsert(String id, String name, String pwd, String email, int age) throws SQLException;
}
