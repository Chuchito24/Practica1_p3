package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Divicion_VS extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Divicion_VS frame = new Divicion_VS();
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
	public Divicion_VS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("variable1");
		lblNewLabel.setBounds(10, 81, 68, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("variable 2");
		lblNewLabel_1.setBounds(10, 136, 68, 14);
		contentPane.add(lblNewLabel_1);
		
		txt1 = new JTextField();
		txt1.setBounds(109, 78, 86, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(109, 133, 86, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		JButton btnNewButton = new JButton("Dividir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s1=Integer.parseInt(txt1.getText());
	            int s2=Integer.parseInt(txt2.getText());
					double resul=s1/s2;
					JOptionPane.showMessageDialog(null, "el resultado es"+resul);
			}
		});
		btnNewButton.setBounds(109, 195, 89, 23);
		contentPane.add(btnNewButton);
	}

}
