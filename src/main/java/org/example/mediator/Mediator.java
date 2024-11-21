package org.example.mediator;

/**
 * @author: hanchaowei
 * @date 2024/11/11
 * @description:
 */

public interface Mediator {

	void send(String message, Airplane sender);
}
