package org.example.mediator.example;

/**
 * @author: hanchaowei
 * @date 2024/11/11
 * @description:
 */

public interface Mediator {

	void notify(Component sender,String event);
}
