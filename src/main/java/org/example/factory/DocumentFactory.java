package org.example.factory;

/**
 * @author: hanchaowei
 * @date 2024/10/30
 * @description:
 */

public class DocumentFactory {

	public static Document createDocument(String type) {
		switch (type) {
			case "Word":
				return new WordDocument();
			case "PDF":
				return new PDFDocument();
			default:
				throw new IllegalArgumentException("Invalid type: " + type);
		}
	}
}
