package fr.dta.chat.app;

import java.util.Scanner;

import fr.dta.chat.model.ChatConversationModel;
import fr.dta.chat.view.console.ChatConsoleView;

public class ChatClientApp {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ChatConversationModel model = new ChatConversationModel();
		ChatConsoleView view = new ChatConsoleView(reader);

		view.setAuthController((login) -> {
			model.setLogin(login);
		});

		model.addObserver(view);
		view.print();
		model.sendMessages("Bonjour");
		model.sendMessages("Au revoir");
		reader.close();
	}

}
