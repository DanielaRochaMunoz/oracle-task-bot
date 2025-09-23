package com.springboot.MyTodoList;

import java.util.concurrent.StructuredTaskScope.Subtask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import com.springboot.MyTodoList.controller.ToDoItemBotController;
import com.springboot.MyTodoList.model.DeveloperStats;
import com.springboot.MyTodoList.repository.DeveloperRepository;
import com.springboot.MyTodoList.service.DeveloperService;
import com.springboot.MyTodoList.service.DeveloperStatsService;
import com.springboot.MyTodoList.service.SubtaskService;
import com.springboot.MyTodoList.service.ToDoItemService;
import com.springboot.MyTodoList.service.SprintService;
import com.springboot.MyTodoList.util.BotMessages;

@SpringBootApplication
public class MyTodoListApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(MyTodoListApplication.class);

	@Autowired
	private ToDoItemService toDoItemService;

	@Autowired
	private DeveloperService developerService;

	@Autowired
	private SubtaskService subtaskService;

	@Autowired
	private SprintService sprintService;

	@Autowired
	private DeveloperStatsService developerStatsService;

	@Value("${telegram.bot.token}")
	private String telegramBotToken;

	@Value("${telegram.bot.name}")
	private String botName;

	public static void main(String[] args) {
		SpringApplication.run(MyTodoListApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
			telegramBotsApi.registerBot(new ToDoItemBotController(telegramBotToken, botName, toDoItemService, developerService, subtaskService, sprintService, developerStatsService));
			logger.info(BotMessages.BOT_REGISTERED_STARTED.getMessage());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
}
