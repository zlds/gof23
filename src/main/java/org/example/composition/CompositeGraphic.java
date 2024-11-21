package org.example.composition;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: hanchaowei
 * @date 2024/11/6
 * @description:
 */

public class CompositeGraphic implements Graphic {

	private List<Graphic> children = new ArrayList<>();

	public void add(Graphic graphic) {
		children.add(graphic);
	}

	public void remove(Graphic graphic) {
		children.remove(graphic);
	}

	@Override
	public void draw() {
		for (Graphic child : children) {
			child.draw();
		}
	}
}
