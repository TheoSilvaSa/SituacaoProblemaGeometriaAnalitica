import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int x1, x2, x3, y1, y2, y3;
		
		System.out.println("Informe as coordenada do ponto A(x1 ,y1)");
		System.out.print("x1: ");
		x1 = readInt();
		System.out.print("y1: ");
		y1 = readInt();
			
		System.out.println("Informe as coordenada do ponto B(x2 ,y2)");
		System.out.print("x2: ");
		x2 = readInt();
		System.out.print("y2: ");
		y2 = readInt();
			
		System.out.println("Informe as coordenada do ponto C(x3 ,y3)");
		System.out.print("x3: ");
		x3 = readInt();
		System.out.print("y3: ");
		y3 = readInt();
			
		if (determinante(x1,x2,x3,y1,y2,y3)==0) {
			System.out.printf("os pontos são colineares e a distância entre o ponto A("+x1+","+y1+") e o ponto B("+x2+","+y2+") é "+new DecimalFormat(".##").format(distancia(x1,x2,y1,y2)));
		}
		else {
			System.out.println("Os pontos não estão alinhados.");
		}
		
	}
	
	static Scanner scanner = new Scanner(System.in);
	
	static int readInt() {
		while(true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.print("Informe apenas números inteiros: ");
			}
			
		}
		
	}
	
	static int determinante(int x1, int x2, int x3, int y1, int y2, int y3){
		int det = (((x1*y2)+(y1*x3)+(x2*y3))-((x3*y2)+(y3*x1)+(y1*x2)));
		return det;
	}
	
	static double distancia(double x1,double x2, double y1, double y2) {
		double dist = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
		return dist;
		
	}
	

}
