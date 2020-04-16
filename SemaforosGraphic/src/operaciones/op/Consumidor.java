package operaciones.op;
import javax.swing.JFrame;

import semaforos.gui.interfaz;

public class Consumidor implements Runnable {

	BufferLimitado b = null;
	interfaz MainWindow = null;
	int tiempo;
	
	public Consumidor( BufferLimitado initb, interfaz interf, int mys) {
		b = initb;
		new Thread( this ).start();
		MainWindow = interf;
		tiempo = mys;
	}
	
	public void run() {
		double item;
		while( true ){
			item = b.fetch();
			System.out.println( "Artículo extraído " + item );
			Util.mySleep(tiempo);
		}
	}

}