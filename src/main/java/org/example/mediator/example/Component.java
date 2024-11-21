package org.example.mediator.example;

/**
 * @author: hanchaowei
 * @date 2024/11/11
 * @description:
 */

public abstract class Component {

	protected Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public void changed(String event) {
		mediator.notify(this,event);
	}



}
