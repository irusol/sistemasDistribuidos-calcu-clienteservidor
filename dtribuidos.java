public interface Operaciones extends Remote{
	public int suma (int x, int y){
		throws
	}
	public int multiplica (int x, int y){
		throws
	}
}

public class OperacionesImpl extends UnicastRemoteObject implements Operaciones{
	public OperacionesImpl() throws RemoteException{
		super ();
	}
	public int suma ()
}

public static void main (String[] args){
	Registro registro = locate.Registry.create.Registry(1099);
	Operaciones op = new OperacionesImpl();
	registro.bind("");
	System.out.println ("Server Ready");
	
}

public class Cliente{
	public 
}

register?* no entiendo nada :(
Reporte caratula introduccion y desarrollo, conclusion (Ejercicio 7)


1.- cliente servidor con sockets de un codigo q el profe
2.-adivina numero cliente servidor (sockets)
3.-storeprocedure (del primero)
4.-lo mismo toda la logica en el servidor (del primer ejercicio)
5.-relog lógico de lamport con 3 o 4 hilos
6.-Transacciones? el crud hibernate orm , jpa ( tablas movimiento articulo y articulo)

cliente jar?***

actividades: sacar la pieza del servidor y dejar lo del cliente y saber hacerlo xD
actividad 2: ponerle una interfaz gráfica
desviación estandar??? 
editar ejercicio de movimientos. articulos? que verga crud, banco y una tienda

https://github.com/tonabarrera/CalculadoraSockets