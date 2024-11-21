package org.example.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: hanchaowei
 * @date 2024/11/20
 * @description:
 */

public class MessageSubject implements Subject {

	private List<Observer> observerList = new ArrayList<>();
	private String message;


	@Override
	public void registerObserve(Observer o) {
		observerList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observerList.remove(o);
	}

	@Override
	public void notifyObservers() {
		observerList.forEach(s -> s.update(message));
	}


	public void send(String message) {
		this.message = message;
		notifyObservers();
	}
}
