package ex05.spring;

public class ArticleService {
	// ArticleService�� ArticleDao�� ����
	// �� ����
	// ������, setter �޼��� Ȱ��
	
	private ArticleDao articleDao;		// has-a ����

	public ArticleService(ArticleDao articleDao) {	//DI
		super();
		this.articleDao = articleDao;
		System.out.println("ArticleService ������ ȣ��");
	}
	
	// �۾��� ����
	public void write(Article article) {
		this.articleDao.insert(article);
	}
	// ����(������Ʈ) ����
	public void update(Article article) {
		//articleDao.update(article);
	}
	// ���� ����
	

}
