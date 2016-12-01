package fr.dta.chat.view.console;

import java.util.Scanner;

import fr.dta.chat.controller.ChatAuthController;
import fr.dta.chat.model.ChatMessage;
import fr.dta.chat.model.observer.ChatObservable;
import fr.dta.chat.model.observer.ChatObserver;

public class ChatConsoleView extends ChatConsoleViewComposite implements ChatObserver<ChatMessage> {

	private ChatConsoleTitleView titleView;
	private ChatConsoleConversationView conversationView;
	private ChatConsoleLoginView loginView;
	Scanner reader;

	public ChatConsoleView(Scanner reader) {
		this.reader = reader;
		this.setTitleView(new ChatConsoleTitleView());
		this.setConversationView(new ChatConsoleConversationView());
		this.setLoginView(new ChatConsoleLoginView(reader));
		this.add(titleView);
		this.add(loginView);
		this.add(conversationView);
	}

	public ChatConsoleTitleView getTitleView() {
		return titleView;
	}

	public void setTitleView(ChatConsoleTitleView titleView) {
		this.titleView = titleView;
	}

	public ChatConsoleConversationView getConversationView() {
		return conversationView;
	}

	public void setConversationView(ChatConsoleConversationView conversationView) {
		this.conversationView = conversationView;
	}

	public ChatConsoleLoginView getLoginView() {
		return loginView;
	}

	public void setLoginView(ChatConsoleLoginView loginView) {
		this.loginView = loginView;
	}

	public void setAuthController(ChatAuthController chatAuthController) {
		this.loginView.setAuthController(chatAuthController);
	}

	@Override
	public void update(ChatObservable<ChatMessage> observable, ChatMessage obj) {
		System.out.println(obj.getMsg());

	}

}
