package by.study.news.dao.factory;
import by.study.news.dao.NewsDAO;
import by.study.news.dao.impl.SQLArticleDAO;

public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();
	private final NewsDAO sqlArticleImpl = new SQLArticleDAO();

	private DAOFactory() {
	}

	public static DAOFactory getInstance() {
		return instance;
	}

	public NewsDAO getArticleDAO() {
		return sqlArticleImpl;
	}

}