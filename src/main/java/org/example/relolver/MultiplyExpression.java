package org.example.relolver;

/**
 * @author: hanchaowei
 * @date 2024/11/20
 * @description: 乘法运算规则
 */

public class MultiplyExpression implements Expression {

	private Expression leftOperand;
	private Expression rightOperand;



	public MultiplyExpression(Expression leftOperand, Expression rightOperand) {
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

	@Override
	public int calculate() {
		return leftOperand.calculate() * rightOperand.calculate();
	}
}
