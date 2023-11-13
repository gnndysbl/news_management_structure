package by.study.news.service.factory;

import by.study.news.service.NewsService;
import by.study.news.service.impl.NewsServiceImpl;

public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();
	private final NewsService newsService = new NewsServiceImpl();

	private ServiceFactory() {
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

	public NewsService getNewsService() {
		return newsService;

	}
}