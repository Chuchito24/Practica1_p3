package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VsPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VsPrincipal frame = new VsPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VsPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSuma = new JButton("Suma");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Suma_VS su=new Suma_VS();
				su.setVisible(true);
			}
		});
		btnSuma.setBounds(165, 24, 89, 23);
		contentPane.add(btnSuma);
		
		JButton btnResta = new JButton("Resta");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resta_VS ru=new Resta_VS();
				ru.setVisible(true);
			}
		});
		btnResta.setBounds(165, 77, 89, 23);
		contentPane.add(btnResta);
		
		JButton btnNewButton_2 = new JButton("Multiplicacion");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Multiplicacion_VS mu=new Multiplicacion_VS();
				mu.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(151, 133, 109, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Divicion");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Divicion_VS du=new Divicion_VS();
				du.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(165, 189, 89, 23);
		contentPane.add(btnNewButton_3);
	}
}
