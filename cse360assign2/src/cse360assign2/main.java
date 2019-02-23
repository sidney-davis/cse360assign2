package cse360assign2;

public class main {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.add(4);
		System.out.println(calc.getHistory());
		System.out.println(calc.getTotal());
		
		calc.subtract(5);
		System.out.println(calc.getHistory());
		System.out.println(calc.getTotal());
		
		calc.multiply(4);
		System.out.println(calc.getHistory());
		System.out.println(calc.getTotal());
		
		calc.divide(2);
		System.out.println(calc.getHistory());
		System.out.println(calc.getTotal());
		
		calc.add(587);
		System.out.println(calc.getHistory());
		System.out.println(calc.getTotal());
		
		calc.subtract(100);
		System.out.println(calc.getHistory());
		System.out.println(calc.getTotal());
		
		calc.multiply(-5);
		System.out.println(calc.getHistory());
		System.out.println(calc.getTotal());
		
		calc.divide(44);
		System.out.println(calc.getHistory());
		System.out.println(calc.getTotal());
		
		calc.divide(0);
		System.out.println(calc.getHistory());
		System.out.println(calc.getTotal());
		
	}

}
