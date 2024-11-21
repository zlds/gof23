package org.example.mediator.example;

/**
 * @author: hanchaowei
 * @date 2024/11/11
 * @description:
 */

public class GUIMain {

	public static void main(String[] args) {
		Button button = new Button();
		TextBox textBox = new TextBox();
		Label label = new Label();

		ConcreteMediator concreteMediator = new ConcreteMediator(button, textBox, label);
		button.click();

	}
}
