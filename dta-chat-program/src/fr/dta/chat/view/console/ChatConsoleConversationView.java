package fr.dta.chat.view.console;

public class ChatConsoleConversationView extends ChatConsoleViewComposite {

	private String conversation = "=== Conversation ===";
	private String login;

	public void print() {
		System.out.println(getConversation());
	}

	public String getConversation() {
		return conversation;
	}

	public void setConversation(String conversation) {
		this.conversation = conversation;
	}

	public void hello(String login) {
		setLogin(login);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void update(String msg) {
		System.out.println(msg);
	}

}
