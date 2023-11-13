package by.study.news.controller;
import java.util.HashMap;
import java.util.Map;
import by.study.news.controller.impl.AddArticle;
import by.study.news.controller.impl.AddArticlePage;
import by.study.news.controller.impl.DeleteArticle;
import by.study.news.controller.impl.DeleteMarked;
import by.study.news.controller.impl.EditArticlePage;
import by.study.news.controller.impl.NewsListPage;
import by.study.news.controller.impl.EditArticle;
import by.study.news.controller.impl.VeiwArticlePage;


public final class CommandProvider {
	private static final CommandProvider instance = new CommandProvider();
	
	private Map<CommandName, Command> commands = new HashMap<>();
	
	private CommandProvider() {
		commands.put(CommandName.NEWS_LIST, new NewsListPage());
		commands.put(CommandName.VIEW_ARTICLE, new VeiwArticlePage());
		commands.put(CommandName.EDIT_ARTICLE_PAGE, new EditArticlePage());
		commands.put(CommandName.DELETE_ARTICLE, new DeleteArticle());
		commands.put(CommandName.DELETE_MARKED, new DeleteMarked());
		commands.put(CommandName.ADD_ARTICLE_PAGE, new AddArticlePage());
		commands.put(CommandName.ADD_ARTICLE, new AddArticle());
		commands.put(CommandName.EDIT_ARTICLE, new EditArticle());

	}
		
	public Command getCommand(String name) {
		CommandName commandName = CommandName.valueOf(name.toUpperCase());
		return commands.get(commandName);
	}
		
	public static CommandProvider getInstance() {
		return instance;
	}

}
