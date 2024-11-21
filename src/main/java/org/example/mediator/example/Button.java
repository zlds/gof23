package org.example.mediator.example;

/**
 * @author: hanchaowei
 * @date 2024/11/11
 * @description:
 */

public class Button extends Component {


	public void click() {
		System.out.println("按钮被点击");
		changed("click");
	}

}
