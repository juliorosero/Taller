package epn;

import java.util.StringTokenizer;

public class Nodo {
	private String compras;
    private Nodo siguiente;
    
    
    
    
    
    
    
    public Nodo() {
		super();
		this.compras = "";
		this.siguiente = null;

	}



	public String getCompras() {
		return compras;
	}



	public void setCompras(String compras) {
		this.compras = compras;
	}



	public Nodo getSiguiente() {
		return siguiente;
	}



	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}


}
