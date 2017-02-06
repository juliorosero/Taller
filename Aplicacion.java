package epn;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) throws Exception {
		// falta
				ListaCircular listaCircular= new ListaCircular();
				ListaCircular2 listaCircular2 = new ListaCircular2();
				String salida="";
				String sal="";
				int opcion, opciones;
				do{
					Object[] botones={"Lista de Alumnos", "lista de Compras"};
					opciones=JOptionPane.showOptionDialog(null, "Que Lista desea","Opciones",JOptionPane.DEFAULT_OPTION,JOptionPane.NO_OPTION,null,botones, botones[0]);
					
					switch(opciones){
					case 0:{
						do{
							
							String alumno= JOptionPane.showInputDialog("Ingrese Cedula y alumno separados por coma");
							StringTokenizer tokens= new StringTokenizer(alumno,",");
							String cedula=tokens.nextToken();
							String nombre=tokens.nextToken();
							
							listaCircular2.insertarAlFinal2(alumno);
//							System.out.println( listaCircular2.buscarPorNombre(alumno));
							listaCircular2.buscar(cedula);
							System.out.println("******************************************");
							listaCircular2.imprimir();

							
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						opcion=JOptionPane.showConfirmDialog(null, "Ingresar mas alumnos", "Continuar",JOptionPane.YES_NO_OPTION);
						}while(opcion==JOptionPane.YES_NO_OPTION);	
						
						
						
						
						
						break;
					}
					
					case 1:{
										
						listaCircular.insertarAlFinal("2,Vasos");
						listaCircular.insertarAlFinal("5,Leche");
						listaCircular.insertarAlFinal("8,Cola");
						listaCircular.insertarAlFinal("9,Cereal");
						listaCircular.insertarAlFinal("10,Queso");
						listaCircular.insertarAlFinal("3,Aceite");
						listaCircular.insertarAlFinal("7,Galletas");
						listaCircular.insertarAlFinal("6,Escoba");
						listaCircular.insertarAlFinal("4,Detergente");
						listaCircular.insertarAlFinal("13,Yogurt");
							
						System.out.println("********************************************");
						System.out.println("********************************************");	
						System.out.println("LISTA DE PRODUCTOS EN LA TIENDA");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						listaCircular.imprimir();
						System.out.println("********************************************");
						
						
						System.out.println("********************************************");
						System.out.println("Lista de productos a comprar ");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	
						System.out.println("   [CANT/PRODUCTO]\n");
						listaCircular.comprar("3,Yogurt");						
						listaCircular.comprar("4,Cola");
						listaCircular.comprar("2,Pan");
						listaCircular.comprar("5,Escoba");						
						listaCircular.comprar("3,Queso");						
						listaCircular.comprar("4,Aceite");
						System.out.println(listaCircular.productosComprados());
						System.out.println("********************************************");
						
						
						System.out.println("********************************************");
						System.out.println("INVENTARIO ACTUAL");
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
						listaCircular.imprimir();
						System.out.println("********************************************");
						
						
						break;
					}
						
					} 
					opcion=JOptionPane.showConfirmDialog(null, "Volver a seleccionar otra lista", "Continuar",JOptionPane.YES_NO_OPTION);
				}while(opcion==JOptionPane.YES_NO_OPTION);	
					}				

}


































/**
 * INGRESAR POR CONSOLA
 */
/*		
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
}*/
