package fr.dta.chat.model;

import fr.dta.chat.model.observer.ChatObservable;

public class ChatConversationModel extends ChatObservable<ChatMessage> {
	private String username;

	public void setLogin(String login) {
		this.setUsername(login);
	}

	public void sendMessages(String msg) {
		String chatMsg = getUsername() + " -> " + msg;
		notifyObservers(new ChatMessage(getUsername(), chatMsg));
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
