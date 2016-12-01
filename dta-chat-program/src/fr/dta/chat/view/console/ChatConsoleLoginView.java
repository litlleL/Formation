package fr.dta.chat.view.console;

import java.util.Scanner;

import fr.dta.chat.controller.ChatAuthController;

public class ChatConsoleLoginView extends ChatConsoleViewComposite {

	private String chatAuth = "== Authentification ==";
	private String chatLogin = "Veuillez saisir votre login : ";

	private String login;

	private Scanner reader;
	ChatAuthController controller;

	public ChatConsoleLoginView(Scanner reader) {
		super();
		this.reader = reader;
	}

	public void print() {
		System.out.println(getChatAuth() + "\n" + getChatLogin());
		setLogin(this.reader.next());
		controller.authenticate(getLogin());
	}

	public Scanner getReader() {
		return reader;
	}

	public void setReader(Scanner reader) {
		this.reader = reader;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getChatAuth() {
		return chatAuth;
	}

	public void setChatAuth(String chatAuth) {
		this.chatAuth = chatAuth;
	}

	public String getChatLogin() {
		return chatLogin;
	}

	public void setChatLogin(String chatLogin) {
		this.chatLogin = chatLogin;
	}

	public void setAuthController(ChatAuthController chatAuthController) {
		this.controller = chatAuthController;
	}

}
