package org.example.observer;

/**
 * @author: hanchaowei
 * @date 2024/11/20
 * @description:
 */

public class EmailConcrete implements Observer {

	@Override
	public void update(String message) {
		System.out.println("邮件订阅者收到了报警信息：" + message);
	}
}
