import java.util.Scanner;

public class Cajero {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Cajero Automático");
		System.out.println("BIENVENIDO, GRACIAS POR USAR NUESTRO CAJERO AUTOMÁTICO");
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresa el número de cuenta: "); //Deberìa ser: Ingrese su tarjeta
		String cuenta = leer.next();
		System.out.println("Ingresa su clave: ");
		String pin = leer.next();
		if (pin.equals ("1234")) {
			
			double saldo = 0;
			
			String opcion="1";
			
			while(!opcion.equals("5")) {
				
				//Estas son las opciones del cajero
				
				System.out.println("MENU DE OPCIONES");
				System.out.println("Eliga una opción: ");
				System.out.println("1.- Consignar");
				System.out.println("2.- Retirar");
				System.out.println("3.- Consultar Saldo");
				System.out.println("4.- Cambiar clave");
				System.out.println("5.- Salir");
				
				opcion=leer.next();
				
				switch(opcion){
					case "1": {
						System.out.println("Ingrese la cantidad a consignar: ");
						
						double consignacion = leer.nextDouble();
						
						
						if(consignacion>0) {
							saldo = saldo + consignacion;
							System.out.println("Tu nuevo saldo es: "+ Double.toString(saldo));
						}
						else {
							System.out.println("Cantidad invalida, solo se permiten valores mayores a 0...");
						}
						break;
					}
						
						
					case "2": {
						
						System.out.println("Ingrese el valor a retirar: ");
						double retiro = leer.nextDouble();
						
						if(retiro>saldo) {
						System.out.println("Error! Saldo insuficiente..");
						}
						else { 
					
						if(retiro>0) {
						saldo=saldo-retiro;
						System.out.println("Tu nuevo saldo es: "+ Double.toString(saldo));
						}
						else {
						System.out.println("Cantidad invalida, solo se permiten valores mayores a 0...");
						}
						}
						break;
						}
						
						
					case "3": {
						System.out.println("El saldo de tu cuenta es: " + Double.toString(saldo));
						break;
					}
					
					case "4": {
						
						System.out.println("Ingrese nueva clave: ");
						String clave = leer.next();
						if ( clave.equals ("0000"));
						System.out.println("Cambio de clave exitoso");	
						System.out.println("Tu nueva calve es: " + (clave) + " No la olvidses");
						break;
						}
					
						
					case "5": { System.out.println("Gracias por utilizar nuestra red de Cajeros automáticos");
						break;
						}
						default: { System.out.println("Opción incorrecta..");
						break;
						}
					}
				}
			}
						else {
						System.out.println("Clave incorrecta.");
						System.out.println("Gracias por utilizar nuestra red de Cajeros automáticos");
						
						}
						
		}			
			
	}
		
	


