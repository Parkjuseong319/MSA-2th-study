package edu.kosa.dao.di;

import java.sql.Connection;

// 확장, 관계 느슨하게 처리
public interface ConnectionMaker {

	Connection makeConnection() throws Exception;
}
