package org.example.state;

/**
 * @author: hanchaowei
 * @date 2024/11/15
 * @description:
 */

public interface OrderState {

	void next(OrderContext context);

	void previous(OrderContext context);

	void printStatus();
}
