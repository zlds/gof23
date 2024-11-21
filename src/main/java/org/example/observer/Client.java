package org.example.observer;

/**
 * @author: hanchaowei
 * @date 2024/11/19
 * @description:
 */

public class Client {

	public static void main(String[] args) {

		Observer smsConcrete = new SmsConcrete();
		Observer emailConcrete = new EmailConcrete();
		Observer imConcrete = new IMConcrete();

		MessageSubject messageSubject = new MessageSubject();
		messageSubject.registerObserve(smsConcrete);
		messageSubject.registerObserve(emailConcrete);
		messageSubject.registerObserve(imConcrete);
		messageSubject.send("磁盘空间90%，请及时清理。");
	}
}
