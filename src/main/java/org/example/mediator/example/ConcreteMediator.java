package org.example.mediator.example;


/**
 * @author: hanchaowei
 * @date 2024/11/11
 * @description:
 */

public class ConcreteMediator implements Mediator {

	private Button button;

	private TextBox textBox;

	private Label label;


	public ConcreteMediator(Button button, TextBox textBox, Label label) {
		this.button = button;
		this.button.setMediator(this);
		this.textBox = textBox;
		this.textBox.setMediator(this);
		this.label = label;
		this.label.setMediator(this);
	}

	@Override
	public void notify(Component sender, String event) {
		if (sender == button && event.equals("clicked")) {
			textBox.clear();
			label.show("Button was clicked");
		}
	}
}
