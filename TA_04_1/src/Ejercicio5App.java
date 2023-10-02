
public class Ejercicio5App {
	public static void main(String[] args) {
		int a = 6;
		int b = 7;
		int c = 8;
		int d = 9;
		
		int temp1 = 0;
		int temp2 = 0;
		
		System.out.println("Valor de A: "+a+" Valor de B: "+b+" Valor de C: "+c+" Valor de D: "+d);
		
		temp1 = b;
		b = c;
		
		System.out.println("Valor de A: "+a+" Valor de B: "+b+" Valor de C: "+c+" Valor de D: "+d);
		
		temp2 = d;
		d = temp1;
		
		System.out.println("Valor de A: "+a+" Valor de B: "+b+" Valor de C: "+c+" Valor de D: "+d);
		
		temp1 = a;
		a = temp2;
		
		System.out.println("Valor de A: "+a+" Valor de B: "+b+" Valor de C: "+c+" Valor de D: "+d);
		
		c = temp1;
		
		System.out.println("Valor de A: "+a+" Valor de B: "+b+" Valor de C: "+c+" Valor de D: "+d);
	}
}
