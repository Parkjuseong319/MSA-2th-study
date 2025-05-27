package ex05.spring;

// Oracle, MySQL이 사용하는 공통함수(추상함수) 강제 구현
public interface ArticleDao {
	void insert(Article article);	// write
	
	// update, delete, select,...
}
