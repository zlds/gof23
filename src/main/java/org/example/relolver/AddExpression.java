package org.example.relolver;

/**
 * @author: hanchaowei
 * @date 2024/11/20
 * @description: 加法运算规则
 */

public class AddExpression implements Expression {

	private Expression leftOperand;
	private Expression rightOperand;

	public AddExpression(Expression left, Expression right) {
		this.leftOperand = left;
		this.rightOperand = right;
	}

	@Override
	public int calculate() {
		return leftOperand.calculate() + rightOperand.calculate();
	}

}
