package operaciones.op;

import java.awt.Color;

import semaforos.gui.interfaz;

public class BufferLimitado{

	int size = 10;
	double buffer[];
	int inBuf = 0, outBuf = 0;
	
	int contador = 0;
	
	SemaforoBinario mutex = new SemaforoBinario(true);
	SemaforoContador isEmpty = new SemaforoContador(0);
	SemaforoContador isFull;
	interfaz MainWindow;
	
	public BufferLimitado(interfaz interf, int numb){
		MainWindow=interf;
		size = numb;
		buffer = new double[size];
		isFull = new SemaforoContador(size);
	}
	public void deposit( double value ){
		isFull.P(); // espera si el buffer está lleno
			MainWindow.regresar("ProductorR");
			MainWindow.cambiarVerde("Productor");
			mutex.P(); // asegura la exclusión mutua
				MainWindow.regresar("ConsumidorV");
				MainWindow.cambiarRojo("Consumidor");
				buffer[inBuf] = value;
				contador ++;
				MainWindow.buffers[contador-1].setBackground(Color.CYAN);
				
				System.out.println(contador);
				inBuf = (inBuf + 1) % size;
			mutex.V();
		isEmpty.V(); // notifica a algún consumidor en espera
	}
	
	public double fetch(){	
		double value;
		isEmpty.P(); // esperar si el buffer está vacío
			MainWindow.cambiarVerde("Consumidor");
			MainWindow.regresar("ConsumidorR");
			mutex.P(); // asegura la exclusión mutua
				MainWindow.cambiarRojo("Productor");
				MainWindow.regresar("ProductorV");
				value = buffer[outBuf]; // lee desde el buffer
				outBuf = (outBuf+1) % size;
				MainWindow.buffers[contador-1].setBackground(Color.yellow);
				contador--;
				
				
				//System.out.println(contador);
			mutex.V();
		isFull.V(); // notifica a cualquier productor en espera
		
		return value;
	}
}
