package fr.diginamic.operations;

public class Operations {
	public static double Calcul(char op, double a, double b) {
		double result = 0;
		switch(op){
			case '+':
				result = a+b;
				break;
			case '-':
				result = a-b;
				break;
			case '*':
				result = a*b;
				break;
			case '/':
				result = a/b;
				break;
		}
		return result;
	}
}
