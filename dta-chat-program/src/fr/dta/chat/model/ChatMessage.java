package fr.dta.chat.model;

public class ChatMessage {

	private String login;
	private String msg;

	public ChatMessage(String login, String message) {
		this.setMsg(message);
		this.setLogin(login);
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
