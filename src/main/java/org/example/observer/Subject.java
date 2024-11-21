package org.example.observer;

/**
 * @author: hanchaowei
 * @date 2024/11/19
 * @description: 主题接口
 */

public interface Subject {

	void registerObserve(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();

}
