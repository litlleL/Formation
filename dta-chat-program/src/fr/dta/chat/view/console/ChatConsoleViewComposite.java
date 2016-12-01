package fr.dta.chat.view.console;

import java.util.ArrayList;
import java.util.List;

public abstract class ChatConsoleViewComposite {

	private List<ChatConsoleViewComposite> children = new ArrayList<>();

	public void add(ChatConsoleViewComposite chatView) {
		children.add(chatView);
	}

	public void print() {
		children.forEach(ChatConsoleViewComposite::print);
	}

}
