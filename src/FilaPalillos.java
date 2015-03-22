
public class FilaPalillos 
{
	
	private int numPalillos;
	
	public FilaPalillos(int tamanio)
	{
		numPalillos=tamanio;
	}
	
	public boolean quitaPalillos(int cuantos)
	{
		if(cuantos > numPalillos){
			return false;
		}else{
			numPalillos -=cuantos;
			return true;
		}
	}
	
	public String toString()
	{
		String s="";
		for(int i=0; i<numPalillos; i++){
			
			s +="|";
		}
		return s;
	}
	
	public void agregaPalillos(int cuantos)
	{
		numPalillos +=cuantos;
	}
	
	public int cuantosPalillos()
	{
		return numPalillos;
	}
}
