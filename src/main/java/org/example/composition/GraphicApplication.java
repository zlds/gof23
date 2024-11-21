package org.example.composition;

/**
 * @author: hanchaowei
 * @date 2024/11/6
 * @description: 组合模式
 */

public class GraphicApplication {


	public static void main(String[] args) {
		//
		CompositeGraphic graphic = new CompositeGraphic();
		graphic.add(new Dot());
		graphic.add(new Circle());
		CompositeGraphic group = new CompositeGraphic();
		group.add(new Circle());
		group.add(new Dot());

		graphic.add(group);
		graphic.draw();

	}

}
