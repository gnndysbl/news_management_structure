package by.study.news.dao;

import java.util.List;

import by.study.news.bean.Article;
import by.study.news.dao.exception.DAOException;

public interface NewsDAO {
	
	void addArticle(Article article) throws DAOException;
	void deleteArticle(Article article) throws DAOException;
	void editArticle(Article article) throws DAOException;
	Article getArticle() throws DAOException;
	List<Article> getAllArticles() throws DAOException;
	
	
	}


