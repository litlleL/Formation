package fr.dta.chat.view.console;

public class ChatConsoleTitleView extends ChatConsoleViewComposite {

	private String titleChatApp = "= CHAT APP =";

	public void print() {
		System.out.println(getTitleChatApp());
	}

	public String getTitleChatApp() {
		return titleChatApp;
	}

	public void setTitleChatApp(String titleChatApp) {
		this.titleChatApp = titleChatApp;
	}

}
