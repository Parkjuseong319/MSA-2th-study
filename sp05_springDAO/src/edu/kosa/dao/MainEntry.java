package edu.kosa.dao;

import edu.kosa.model.UserVO;

public class MainEntry {
	public static void main(String[] args) throws Exception {
		
		UserDAO dao = new OracleUserDaoImpl();
		UserVO vo = new UserVO();
		dao.insert(vo);
		dao.selectAll();
	}
}
