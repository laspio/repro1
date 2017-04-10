package m5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Panel;
import javax.swing.JSplitPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;



public class Windoww {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Windoww window = new Windoww();
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
	public Windoww() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(26, 40, 105, 42);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnEnvia = new JButton("Enviar");
		btnEnvia.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				double p = Double.parseDouble(textField.getText());
				double i = Double.parseDouble(textField_2.getText());
				double l = Double.parseDouble(textField_3.getText());
				
				double j = i/(12*100);
		
				double n = l*12;
				
				double m =p*j/(1-Math.pow((1+j), -n)) ;
				
				boolean anys=false;
				if (-1 < l && l < 30){
				anys = true;	
				}
				
				boolean pe=false;
				if (-1 < p && p < 500000){
				pe = true;	
				}
				boolean lai=false;
				if (-1 < i && i < 100){
				lai = true;	
				}
				
				if(lai==false||pe==false||anys==false){
					
					textField_1.setText("Dades Erroneas");
				}
				else{
					String mostrar = String.valueOf(m);
					textField_1.setText(mostrar);
				}
				
				
			
				
			}
		});
		btnEnvia.setBounds(155, 121, 105, 37);
		panel.add(btnEnvia);
		
		textField_1 = new JTextField();
		textField_1.setBounds(93, 186, 230, 37);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(155, 40, 98, 42);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(277, 43, 105, 36);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblP = new JLabel("Principal");
		lblP.setBounds(52, 15, 46, 14);
		panel.add(lblP);
		
		JLabel lblInteresMensual = new JLabel("Interes mensual");
		lblInteresMensual.setBounds(155, 15, 98, 14);
		panel.add(lblInteresMensual);
		
		JLabel lblMesos = new JLabel("Mesos");
		lblMesos.setBounds(307, 15, 46, 14);
		panel.add(lblMesos);
	}
}
