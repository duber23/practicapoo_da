package co.edu.poli.poo.clases;

public class CrearPerro {
    
	public static void main(String args[]) {
    	//Crear una instancia de la clase Perro
		//Declaraci�n
		Perro p1;
    	//Inicializaci�n
    	p1 = new Perro();
    	p1.setNombre("Jacob");
    	p1.setRaza("Pastor");
    	
    	System.out.println(p1.getNombre());
    	System.out.println(p1.getRaza());
    	
    	Perro miPerro;
    	miPerro = new Perro("Mia");
    	miPerro.setPeso(5);
    	
    	System.out.println(miPerro.getNombre()+" "+miPerro.getPeso());
    	
    }
}
