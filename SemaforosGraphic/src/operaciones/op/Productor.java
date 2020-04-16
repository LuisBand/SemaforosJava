package operaciones.op;

import java.util.Random;
import semaforos.gui.interfaz;

public class Productor implements Runnable {

	BufferLimitado b = null;
	interfaz MainWindow = null;
	int tiempo;
	
	public Productor( BufferLimitado initb, interfaz interf, int mys) {
		b = initb;
		new Thread( this ).start();
		MainWindow = interf;
		tiempo  = mys;
	}
	
	public void run() {
		double item;
		Random r = new Random();
		while( true ){
			item = r.nextDouble();
			System.out.println( "Artículo producido " + item );
			b.deposit( item );
			Util.mySleep(tiempo);
		}
	}
	
}