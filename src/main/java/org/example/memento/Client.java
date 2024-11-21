package org.example.memento;

/**
 * @author: hanchaowei
 * @date 2024/11/12
 * @description:
 */

public class Client {


	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();

		originator.setState("状态1");
		originator.setState("状态2");
		caretaker.add(originator.saveStateToMemento());
		originator.setState("状态3");
		caretaker.add(originator.saveStateToMemento());
		originator.setState("状态4");
		System.out.println("当前状态: " + originator.getState());

		originator.getStateFromMemento(caretaker.get(0));
		System.out.println("第一次恢复状态: " + originator.getState());
		originator.getStateFromMemento(caretaker.get(1));
		System.out.println("第二次恢复状态: " + originator.getState());

	}


}
