import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] arg)
	{
		Scanner lector = new Scanner(System.in);
		int[] palillos ={6,8,9};
		
		JuegoPalillos juego;
		String[] jugador = new String[2];
		jugador[0]="jugador 1";
		jugador[1]="jugador 2";
		int turno=0;
		int fila;
		int cuantos;
		juego= new JuegoPalillos(palillos);
		do{
			try{
				System.out.println(juego);
				System.out.println(jugador[turno]+", elije ls fila");
				fila= lector.nextInt();
				System.out.println(jugador[turno]+"¿Cuántos palillos quieres quitar?");
				cuantos= lector.nextInt();
				if(juego.quitaPalillos(fila, cuantos)){
					turno=(turno+1)%2;
				}else{
					System.out.println("Introduce una fila y palillos adecuados");
				}
			}catch(InputMismatchException e){
				System.out.println("Porfavor introdusca un numero");
				lector.next();
			}
		}while(!juego.finDeJuego());
		
		System.out.println("El ganodor es :"+jugador[turno]);
	}

}
