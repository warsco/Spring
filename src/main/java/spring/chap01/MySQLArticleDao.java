package spring.chap01;

public class MySQLArticleDao implements ArticleDao{
	//xml파일에 지정해줘서 해당 클래스를 bean(객체)으로 만들어짐
		public void insert(Article article) {
				System.out.println("MySQLArticleDao.insert() 실행");			
		}

}
