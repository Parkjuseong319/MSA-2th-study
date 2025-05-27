package ex05.spring;

public class MySQLArticleDao implements ArticleDao {

	@Override
	public void insert(Article article) {
		// TODO Auto-generated method stub
		System.out.println("MySQL Insert 구문 실행");
	}
	// update, delete, select,...
}
