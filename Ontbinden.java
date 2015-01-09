import java.util.Scanner;


class Class {
	float a;
	float b;
	float c;
	
	/**
	 * 
	 * Getters
	 * 
	 */
	float haalA(){
		return a;
	}
	float haalB() {
		return b;
	}
	float haalC() {
		return c;
	}
	
	/**
	 * 
	 * Setters
	 * 
	 */
	void zetA(float a){
		this.a = a;
	}
	void zetB(float b){
		this.b = b;
	}
	void zetC(float c){
		this.c = c;
	}
	
}

public class Ontbinden {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class object = new Class();
		
		Scanner mijnScanner = new Scanner(System.in);
		
		System.out.print("Vul de A in: ");
		
		object.a = mijnScanner.nextFloat();
		
		System.out.print("Vul de B in: ");
		
		object.b = mijnScanner.nextFloat();
		
		System.out.print("Vul de C in: ");
		
		object.c = mijnScanner.nextFloat();
		
		float d = 0;
		d = (object.haalB()*object.haalB() + ( -4 * object.haalA() * object.haalC()));
		
		System.out.println("De D staat gelijk aan: " + d);
		
		if(d >= 0){
			float e = (float) Math.sqrt(d);
			float f1 = (-object.haalB() + e) / 2 * object.haalA();
			float f2 = (-object.haalB() - e) / 2 * object.haalA();
			
			System.out.println("X1 staat gelijk aan: " + f1);
			System.out.println("X2 staat gelijk aan: " + f2);
		} else if(d == 0){
			System.out.println("D is gelijk aan 0, 1 oplossingen.");
			
			float e = (float) Math.sqrt(d);
			float f2 = (-object.haalB() + e) / 2 * object.haalA();
			
			System.out.println("X staat gelijk aan: " + e);
			
		} else if(d < 0){
			System.out.println("D is kleiner dan 0 dus er zijn 0 oplossingen.");
		}
		float i = object.haalA();
		
		

	}

}
