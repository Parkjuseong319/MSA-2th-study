package ex05.spring;

public class ArticleService {
	// ArticleService는 ArticleDao에 의존
	// 값 주입
	// 생성자, setter 메서드 활용
	
	private ArticleDao articleDao;		// has-a 관계

	public ArticleService(ArticleDao articleDao) {	//DI
		super();
		this.articleDao = articleDao;
		System.out.println("ArticleService 생성자 호출");
	}
	
	// 글쓰기 서비스
	public void write(Article article) {
		this.articleDao.insert(article);
	}
	// 수정(업데이트) 서비스
	public void update(Article article) {
		//articleDao.update(article);
	}
	// 삭제 서비스
	

}
