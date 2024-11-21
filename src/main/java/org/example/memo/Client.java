package org.example.memo;

/**
 * @author: hanchaowei
 * @date 2024/11/12
 * @description:
 */

public class Client {

	public static void main(String[] args) {
		// 创建一个编辑器
		TextEditor2 editor2 = new TextEditor2();
		// 编辑文本
		editor2.write("v1");
		// 保存数据
		Memento v1 = editor2.save();
		// 编辑文本,写入v2
		editor2.write("v2");
		System.out.println("最新数据: " + editor2.display());
		// 恢复v1版本
		editor2.restore(v1);
		System.out.println("恢复之后v1版本： " + editor2.display());

	}
}
