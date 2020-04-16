package semaforos.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Panel;
//import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import operaciones.op.BufferLimitado;
import operaciones.op.Consumidor;
import operaciones.op.Productor;
import javax.swing.JSpinner;


public class interfaz {

	public JFrame frame;
	public Panel foco_consumidor_verde = new Panel();
	public Panel foco_consumidor_rojo = new Panel();
	public Panel panel_caja_consumidor = new Panel();
	public Panel Consumidor = new Panel();
	public Panel Productor = new Panel();
	public Panel foco_productor_rojo = new Panel();
	public Panel foco_productor_verde = new Panel();
	public Panel panel_caja_productor = new Panel();
	public Panel foco_buffer_rojo = new Panel();
	public Panel foco_buffer_verde = new Panel();
	
	public JPanel[] buffers;
	
	//public JPanel buffer1 = new JPanel();
	//public JPanel buffer2 = new JPanel();
	//public JPanel buffer3 = new JPanel();
	//public JPanel buffer4 = new JPanel();
	//public JPanel buffer5 = new JPanel();
	//public JPanel buffer6 = new JPanel();
	//public JPanel buffer7 = new JPanel();
	//public JPanel buffer8 = new JPanel();
	//public JPanel buffer9 = new JPanel();
	//public JPanel buffer10 = new JPanel();
	public Panel panel_caja_buffer = new Panel();
	
	//BufferLimitado buffer = new BufferLimitado(this);
	//Productor productor = new Productor( buffer, this );
	//Consumidor consumidor = new Consumidor( buffer, this);
	
	interfaz window = this;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz window = new interfaz();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 553, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		foco_consumidor_verde.setBounds(122, 155, 32, 29);
		frame.getContentPane().add(foco_consumidor_verde);
		foco_consumidor_verde.setBackground(Color.gray);
		
		
		foco_consumidor_rojo.setBounds(122, 116, 32, 33);
		frame.getContentPane().add(foco_consumidor_rojo);
		foco_consumidor_rojo.setBackground(Color.gray);
		
		JLabel lblProduc = new JLabel("Proceso Consumidor");
		lblProduc.setBounds(45, 47, 136, 16);
		frame.getContentPane().add(lblProduc);
		
		JLabel lblProcesoProductoe = new JLabel("Proceso Productor");
		lblProcesoProductoe.setBounds(390, 47, 121, 16);
		frame.getContentPane().add(lblProcesoProductoe);
		
		
		panel_caja_consumidor.setBounds(115, 107, 47, 87);
		frame.getContentPane().add(panel_caja_consumidor);
		panel_caja_consumidor.setBackground(Color.black);
		
		
		Consumidor.setBounds(31, 107, 78, 108);
		frame.getContentPane().add(Consumidor);
		Consumidor.setBackground(Color.green);
		
		
		Productor.setBounds(433, 107, 78, 108);
		frame.getContentPane().add(Productor);
		Productor.setBackground(Color.blue);
		
		
		foco_productor_rojo.setBackground(Color.GRAY);
		foco_productor_rojo.setBounds(387, 116, 32, 29);
		frame.getContentPane().add(foco_productor_rojo);
		foco_productor_rojo.setBackground(Color.gray);
		
		
		foco_productor_verde.setBackground(Color.GRAY);
		foco_productor_verde.setBounds(387, 155, 32, 29);
		frame.getContentPane().add(foco_productor_verde);
		foco_productor_rojo.setBackground(Color.gray);
		
		
		panel_caja_productor.setBounds(380, 107, 47, 87);
		frame.getContentPane().add(panel_caja_productor);
		panel_caja_productor.setBackground(Color.black);
		
		
		foco_buffer_rojo.setBackground(Color.GRAY);
		foco_buffer_rojo.setBounds(260, 399, 32, 29);
		frame.getContentPane().add(foco_buffer_rojo);
		foco_buffer_rojo.setBackground(Color.gray);
		
		
		foco_buffer_verde.setBackground(Color.GRAY);
		foco_buffer_verde.setBounds(260, 434, 32, 29);
		frame.getContentPane().add(foco_buffer_verde);
		foco_buffer_verde.setBackground(Color.gray);
		

		/*buffer1.setBounds(, 339, 10, 29);
		frame.getContentPane().add(buffer1);
		buffer1.setBackground(Color.yellow);
		
		
		buffer2.setBounds(224, 339, 10, 29);
		frame.getContentPane().add(buffer2);
		buffer2.setBackground(Color.yellow);
		
		
		buffer3.setBounds(236, 339, 10, 29);
		frame.getContentPane().add(buffer3);
		buffer3.setBackground(Color.yellow);
		
		
		buffer4.setBounds(248, 339, 10, 29);
		frame.getContentPane().add(buffer4);
		buffer4.setBackground(Color.yellow);
		
		
		buffer5.setBounds(260, 339, 10, 29);
		frame.getContentPane().add(buffer5);
		buffer5.setBackground(Color.yellow);
		
		
		buffer6.setBounds(272, 339, 10, 29);
		frame.getContentPane().add(buffer6);
		buffer6.setBackground(Color.yellow);
		
		
		buffer7.setBounds(284, 339, 10, 29);
		frame.getContentPane().add(buffer7);
		buffer7.setBackground(Color.yellow);
		
		
		buffer8.setBounds(296, 339, 10, 29);
		frame.getContentPane().add(buffer8);
		buffer8.setBackground(Color.yellow);
		
		
		buffer9.setBounds(308, 339, 10, 29);
		frame.getContentPane().add(buffer9);
		buffer9.setBackground(Color.yellow);
		
		
		buffer10.setBounds(320, 339, 10, 29);
		frame.getContentPane().add(buffer10);
		buffer10.setBackground(Color.yellow);*/
		
		
		panel_caja_buffer.setBounds(253, 388, 47, 87);
		frame.getContentPane().add(panel_caja_buffer);
		panel_caja_buffer.setBackground(Color.black);

		JSpinner bufferSpinner = new JSpinner();
		bufferSpinner.setBounds(291, 186, 67, 26);
		frame.getContentPane().add(bufferSpinner);
		
		JSpinner consumidorSpinner = new JSpinner();
		consumidorSpinner.setBounds(291, 224, 67, 26);
		frame.getContentPane().add(consumidorSpinner);
		
		JSpinner productorSpinner = new JSpinner();
		productorSpinner.setBounds(291, 262, 67, 26);
		frame.getContentPane().add(productorSpinner);
		
		JPanel cabIzq1 = new JPanel();
		cabIzq1.setBounds(70, 214, 5, 221);
		frame.getContentPane().add(cabIzq1);
		cabIzq1.setBackground(Color.darkGray);
		
		JPanel cabDer1 = new JPanel();
		cabDer1.setBounds(472, 213, 5, 221);
		frame.getContentPane().add(cabDer1);
		cabDer1.setBackground(Color.darkGray);
		
		JPanel cabDer2 = new JPanel();
		cabDer2.setBounds(298, 430, 179, 5);
		frame.getContentPane().add(cabDer2);
		cabDer2.setBackground(Color.darkGray);
		
		JPanel cabIzq2 = new JPanel();
		cabIzq2.setBounds(75, 430, 179, 5);
		frame.getContentPane().add(cabIzq2);
		cabIzq2.setBackground(Color.darkGray);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int BufferNumb = (Integer)bufferSpinner.getValue();
				int consNumb = (Integer)consumidorSpinner.getValue();
				int processNumb = (Integer)productorSpinner.getValue();
				
				System.out.println(consNumb);
				System.out.println(processNumb);
				System.out.println(BufferNumb);
				
				 buffers = new JPanel[BufferNumb];
				 colocarBuffers();
				 
				BufferLimitado buffer = new BufferLimitado(window, BufferNumb);
				Productor productor = new Productor( buffer, window, processNumb);
				Consumidor consumidor = new Consumidor( buffer, window, consNumb);


			}
		});
		btnIniciar.setBounds(216, 293, 117, 29);
		frame.getContentPane().add(btnIniciar);
		
		JLabel lblBuffer = new JLabel("Buffer");
		lblBuffer.setBounds(246, 191, 47, 16);
		frame.getContentPane().add(lblBuffer);
		
		JLabel lblTiempoConsumidor = new JLabel("Tiempo Consumidor");
		lblTiempoConsumidor.setBounds(157, 229, 136, 16);
		frame.getContentPane().add(lblTiempoConsumidor);
		
		JLabel lblTiempoProductor = new JLabel("Tiempo Productor");
		lblTiempoProductor.setBounds(176, 267, 117, 16);
		frame.getContentPane().add(lblTiempoProductor);
		

	}
	
	public void cambiarRojo(String semaforo){
		if(semaforo == "Consumidor"){
			foco_consumidor_rojo.setBackground(Color.red);
		}
		else if(semaforo == "Productor"){
			foco_productor_rojo.setBackground(Color.red);
		}
		else if(semaforo == "Buffer"){
			foco_buffer_rojo.setBackground(Color.red);
		}
		else{
			System.out.println("ERROR: semaforo inexistente.");
		}
	}
	
	public void cambiarVerde(String semaforo){
		if(semaforo == "Consumidor"){
			foco_consumidor_verde.setBackground(Color.green);
		}
		else if(semaforo == "Productor"){
			foco_productor_verde.setBackground(Color.green);
		}
		else if(semaforo == "Buffer"){
			foco_buffer_verde.setBackground(Color.green);
		}
		else{
			System.out.println("ERROR: semaforo inexistente.");
		}
	}
	
	public void regresar(String semaforo){
		if(semaforo == "ConsumidorV"){
			foco_consumidor_verde.setBackground(Color.gray);
		}
		else if(semaforo == "ProductorV"){
			foco_productor_verde.setBackground(Color.gray);
		}
		else if(semaforo == "BufferV"){
			foco_buffer_verde.setBackground(Color.gray);
		}
		
		else if(semaforo == "ConsumidorR"){
			foco_consumidor_rojo.setBackground(Color.gray);
		}
		else if(semaforo == "ProductorR"){
			foco_productor_rojo.setBackground(Color.gray);
		}
		else if(semaforo == "BufferR"){
			foco_buffer_rojo.setBackground(Color.gray);
		}
		else{
			System.out.println("ERROR: semaforo inexistente.");
		}

		
	}
	
	public void colocarBuffers(){
		int counter = 212;
		for (int i=0; i<buffers.length; i++){
			
			buffers[i] = new JPanel();
			buffers[i].setBounds(counter,339,10,29);
			frame.getContentPane().add(buffers[i]);
			buffers[i].setBackground(Color.yellow);
			
			counter+=12;
		}
	}
}
