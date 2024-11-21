package org.example.relolver;

/**
 * @author: hanchaowei
 * @date 2024/11/20
 * @description: 减法运算规则
 */

public class SubtractExpression implements Expression {

	private Expression leftOperand;
	private Expression rightOperand;

	public SubtractExpression(Expression leftOperand, Expression rightOperand) {
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

	@Override
	public int calculate() {
		return leftOperand.calculate() - rightOperand.calculate();
	}
}
