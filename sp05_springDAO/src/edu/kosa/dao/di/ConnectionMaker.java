package edu.kosa.dao.di;

import java.sql.Connection;

// Ȯ��, ���� �����ϰ� ó��
public interface ConnectionMaker {

	Connection makeConnection() throws Exception;
}
