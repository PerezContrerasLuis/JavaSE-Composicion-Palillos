
public class JuegoPalillos 
{
	
	private FilaPalillos[] filas;  //arreglo COMPUESTO por objetos de tipo FilaPalillos
    
	public JuegoPalillos(int[] palillos )
	{
		filas = new FilaPalillos[palillos.length];
		
		for(int i=0;i< filas.length; i++){
			filas[i]= new FilaPalillos(palillos[i]);
		}
		
	}
	
	public boolean quitaPalillos(int fila, int cuantos)
	{
		if(fila<0||fila>=filas.length){
			return false;
		}else{
			
			return filas[fila].quitaPalillos(cuantos); //metodo de FilaPalilos
		}
	}
	
	public boolean finDeJuego()
	{
		for(int i=0; i<filas.length;i++){
			if(filas[i].cuantosPalillos()!=0) return false;
		}
		return true;
	}
	
	public String toString()
	{
		String s="";
		
		for(int i=0; i<filas.length;i++){
			s +=i+" "+filas[i]+"\n";
		}
		
		return s;
	}
}
