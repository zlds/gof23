package org.example.responsibility;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: hanchaowei
 * @date 2024/11/19
 * @description:
 */
@Data
@AllArgsConstructor
public class Order {

	private String orderNumber;
	private String paymentMethod;
	private boolean stockAvailability;
	private String shippingAddress;

}
