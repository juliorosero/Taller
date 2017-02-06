package epn;


import java.util.StringTokenizer;

public class ListaCircular {
	private Nodo inicio;
    private Nodo fin;
    int tamaño, tam;
    String salida="";
    
        
    public void Lista(){
        inicio = null;
        fin = null;
        tamaño = 0;
        tam=0;
    }
    
	  			
	public int getTamaño() {
		return tamaño;
	}

	

	public boolean esVacia(){
        return inicio == null;
	
	}
	
	public void insertarAlFinal(String lista){
        Nodo nuevo= new Nodo();
        nuevo.setCompras(lista);
        
        
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
	
	
	
	
	
	 public boolean buscar(String buscar){
		
	       Nodo aux = inicio;
	        boolean encontrado = false;
	        do{// busca en la lista hasta regresar al principio
	           if (aux.getCompras().indexOf(buscar)>0){
	                  encontrado=  true;
	            }
	            else{aux =  aux.getSiguiente();
	            }
	        }while(aux!=  inicio &&  encontrado!= true);
	        return encontrado;
	        
	    }
	 
	
	
	 	 
	 public void comprar(String compra){
		 StringTokenizer tokens= new StringTokenizer(compra,",");
		 int cantidad2=Integer.parseInt(tokens.nextToken());
		 String producto2=tokens.nextToken();
		
		 if (buscar(producto2)) {
			 Nodo aux = inicio;
	         while(aux.getCompras().indexOf(producto2)<0){     	 
		         aux =  aux.getSiguiente();
		     }  
	         
	         StringTokenizer tokens2= new StringTokenizer(aux.getCompras().toString(),",");
	         int cantidad=Integer.parseInt(tokens2.nextToken());
	         String producto=tokens2.nextToken();
	         int sobra= cantidad-cantidad2; 
	         
	         if(sobra>=0){//Comprados
	        	 aux.setCompras(sobra+","+producto);
	                
		         salida+= tam+". [ "+compra+" ]\t\t Listo!!!\n";
		         tam++;  
	         }
	         else{	//supera el inventario        	 
	        	 salida+= tam+". [ "+compra+" ]\t\t Supera inventario\n";
		         tam++;
	         }    		 	
	                            
		 }else {// NO existe		
			 salida+= tam+". [ "+compra+" ]\t\t No encontrado\n";
	         tam++;
		 }	       	            
	 }
	 
	
	
	 public String productosComprados(){
			return salida;
		}
	
				
	
	public void imprimir(){
        if (!esVacia()) {
            Nodo aux = inicio;
            int i = 0;
            do{
                 System.out.print(""+i + ". [ " + aux.getCompras() + " ]\n");
                aux  = aux.getSiguiente();
                i++;
            }while(aux!=inicio);
        }
    }

}


















/** BUSCAR PRODUCTO Y DEVOLVER PRODUCTO */
/*
public int buscarPorNombre(String pBuscar){
	 StringTokenizer tokens= new StringTokenizer(pBuscar,",");
	 int cantidad=Integer.parseInt(tokens.nextToken());
	 String producto=tokens.nextToken();
	 
	 if (buscar(producto)) {
           Nodo aux = inicio;
           int contador = 0; //almacena la posicion del nodo
           while(aux.getCompras().indexOf(producto)<0){
               contador++;
               aux =  aux.getSiguiente();
           }
           return contador;
       } else {
       	System.out.println("El producto no se encuentra en el inventario");
       	return -10;
         
       }
   }*/

/*
public String buscarPorNombre(String pBuscar){
	 StringTokenizer tokens= new StringTokenizer(pBuscar,",");
	 int cantidad=Integer.parseInt(tokens.nextToken());
	 String producto=tokens.nextToken();
	 
	 if (buscar(producto)) {
           Nodo aux = inicio;
           int contador = 0; //almacena la posicion del nodo
           while(aux.getCompras().indexOf(producto)<0){
               contador++;
               aux =  aux.getSiguiente();
           }
           return aux.getCompras();
       } else {
       	System.out.println("El producto no se encuentra en el inventario");
       	return "nooooooooo";
         
       }
   }

*/
