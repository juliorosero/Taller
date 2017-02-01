package epn;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		// falta
		ListaCircular listaCircular= new ListaCircular();
		String salida="";
		String sal="";
		int opcion, opciones;
		do{
			Object[] botones={"Lista de Alumnos", "lista de Compras"};
			opciones=JOptionPane.showOptionDialog(null, "Que Lista desea","Opciones",JOptionPane.DEFAULT_OPTION,JOptionPane.NO_OPTION,null,botones, botones[0]);
			
			switch(opciones){
			case 0:{
				
				break;
			}
			
			case 1:{
				do{
						
				String linea=JOptionPane.showInputDialog("Ingrese la cantidad y el producto separador por coma");
				StringTokenizer tokens= new StringTokenizer(linea,",");
				int cantidad=Integer.parseInt(tokens.nextToken());
				String producto=tokens.nextToken();
				if (cantidad !=0){
				JOptionPane.showMessageDialog(null, "Producto Comprado: "+ cantidad+ " "+ producto);
				
				System.out.println("******************************************");
				listaCircular.insertarAlFinal(linea);
				listaCircular.imprimir();
				
				}
				else{
					sal+= "\n"+salida+producto;
				}
				opcion=JOptionPane.showConfirmDialog(null, "Seguir Ingresando", "Continuar",JOptionPane.YES_NO_OPTION);
				}while(opcion==JOptionPane.YES_NO_OPTION);
				
				
				System.out.println("******************************************");
				System.out.println("\nProductos no comprados: ");
				System.out.println(sal);
				break;
			}
				
			}
			opcion=JOptionPane.showConfirmDialog(null, "Volver a seleccionar otra lista", "Continuar",JOptionPane.YES_NO_OPTION);
		}while(opcion==JOptionPane.YES_NO_OPTION);	
			}

	

}
