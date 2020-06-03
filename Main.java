import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese la distancia que recorrera el auto 1");
		
		int n1 = scan.nextInt();
		
		System.out.println("Ingrese la distancia que recorrera el auto 2");
		int n2 = scan.nextInt();
		
		System.out.println("Ingrese la distancia que recorrera el auto 3");
		int n3 = scan.nextInt();
			     
		
	Mihilo hilo = new Mihilo(n1,1);
	Mihilo hilo2 = new Mihilo(n2,2);
	Mihilo hilo3 = new Mihilo(n3,3);
	hilo.start();
	hilo2.start();		  
	hilo3.start();			
		
	
		

	}

}
