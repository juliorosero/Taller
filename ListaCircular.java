package epn;

public class ListaCircular {
	
		private Nodo inicio;
	    private Nodo fin;
	    int tamaño;
	    
	    
	    public void Lista(){
	        inicio = null;
	        fin = null;
	        tamaño = 0;
	    }
	    
		  		
		
		public int getTamaño() {
			return tamaño;
		}

		

		public boolean esVacia(){
	        return inicio == null;
		
		}
		
		public void insertarAlFinal(String libro){
	        Nodo nuevo= new Nodo();
	        nuevo.setLibro(libro);
	        if (esVacia()) {
	            inicio=  nuevo;
	            fin= nuevo;
	            fin.setSiguiente(inicio);
	        } else{
	            fin.setSiguiente(nuevo);
	            nuevo.setSiguiente(inicio);
	            fin = nuevo;
	            
	           
	        }
	        tamaño++;
	    }
		
		public void imprimir(){
	        if (!esVacia()) {
	            Nodo aux = inicio;
	            int i = 0;
	            do{
	                 System.out.print(""+i + ".[ " + aux.getLibro() + " ]\n");
	                aux  = aux.getSiguiente();
	                i++;
	            }while(aux!=inicio);
	        }
	    }
		
		
}
