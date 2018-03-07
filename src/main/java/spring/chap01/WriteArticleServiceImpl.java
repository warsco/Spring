package spring.chap01;

import org.springframework.beans.factory.annotation.Required;

/*public class WriteArticleServiceImpl implements WriteArticleService {

	private ArticleDao articleDao;

	public WriteArticleServiceImpl(ArticleDao articleDao) {
		this.articleDao = articleDao;		
	}

	public void write(Article article) {
		System.out.println("WriteArticleServiceImpl.write() 메서드 실행");
		articleDao.insert(article);

	}

}
*/

public class WriteArticleServiceImpl implements WriteArticleService {

	   private ArticleDao articleDao;

	   public WriteArticleServiceImpl() {
	   }

	   @Required
	    public void setArticleDao(ArticleDao articleDao) {
	       this.articleDao = articleDao;
	   }
	    public  WriteArticleServiceImpl(ArticleDao articleDao) {
	          this.articleDao = articleDao;
      }

	    public void write(Article article) {
	      System.out.println("WriteArticleServiceImpl.write() 메서드 실행");
	      articleDao.insert(article);
	   }

	}