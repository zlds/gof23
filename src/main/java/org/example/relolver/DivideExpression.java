package org.example.relolver;

/**
 * @author: hanchaowei
 * @date 2024/11/20
 * @description: 除法运算规则
 */

public class DivideExpression implements Expression {

	private Expression leftOperand;
	private Expression rightOperand;



	public DivideExpression(Expression leftOperand, Expression rightOperand) {
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

	@Override
	public int calculate() {
		try {
			return leftOperand.calculate() / rightOperand.calculate();
		} catch (ArithmeticException e) {
			System.out.println("除数不能为0");
			return -1;
		}

	}
}
