package main;
import calculate.Calculator;
public class PrincipalClass {

	public static void main(String[] args) {
		
		Calculator calc1 = new Calculator();
		
		
		int a = 20;
		int b = 20;
		
		int resultado = calc1.soma(a, b);
		
		System.out.println("A soma é :" + resultado);
		
		// TODO Auto-generated method stub

	}

}
