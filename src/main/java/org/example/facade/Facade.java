package org.example.facade;

/**
 * @author: hanchaowei
 * @date 2024/11/7
 * @description: 门面类
 */

public class Facade {

	private SubSystemA subSystemA;
	private SubSystemB subSystemB;
	private SubSystemC subSystemC;




	public Facade() {
		subSystemA = new SubSystemA();
		subSystemB = new SubSystemB();
		subSystemC = new SubSystemC();
	}

	// 提供简单的接口给客户端调用，隐藏子系统的复杂性
	public void operation() {
		subSystemA.operationA();
		subSystemB.operationB();
		subSystemC.operationC();
	}




}
