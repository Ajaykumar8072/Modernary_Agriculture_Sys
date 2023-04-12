import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Debitcard extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField card_no;
	private JTextField cvv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Debitcard frame = new Debitcard();
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
	public Debitcard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name on the Card");
		lblNewLabel.setForeground(new Color(245, 255, 250));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(64, 112, 104, 28);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(64, 151, 223, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Card Number\r\n");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(64, 220, 104, 28);
		contentPane.add(lblNewLabel_1);
		
		card_no = new JTextField();
		card_no.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)) {
					getToolkit().beep();
					e.consume();
				}
			}
	});
		card_no.setColumns(10);
		card_no.setBounds(64, 259, 223, 28);
		contentPane.add(card_no);
		
		JLabel lblNewLabel_1_1 = new JLabel("CVV\r\n");
		lblNewLabel_1_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(400, 220, 104, 28);
		contentPane.add(lblNewLabel_1_1);
		
		cvv = new JTextField();
		cvv.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)) {
					getToolkit().beep();
					e.consume();
				}
			}
	});
		cvv.setColumns(10);
		cvv.setBounds(401, 259, 118, 28);
		contentPane.add(cvv);
		
		JLabel lblNewLabel_2 = new JLabel("Expiration Date");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(64, 320, 148, 28);
		contentPane.add(lblNewLabel_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Long(1), new Long(1), new Long(12), new Long(1)));
		spinner.setBounds(198, 321, 51, 28);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(2021, 2010, 2030, 1));
		spinner_1.setBounds(275, 321, 51, 28);
		contentPane.add(spinner_1);
		
		JButton btnNewButton = new JButton("Purchase");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, "Thank you for Purchasing");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(267, 393, 148, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Payments");
		lblNewLabel_3.setForeground(new Color(255, 250, 250));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(275, 11, 106, 40);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consumer_full jf5 = new consumer_full();
				jf5.show();
				
				dispose();
			}
		});
		btnNewButton_1.setBounds(535, 26, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\sarav\\Downloads\\Agri new\\photo-1557234195-bd9f290f0e4d.jpg"));
		lblNewLabel_4.setBounds(0, 0, 634, 461);
		contentPane.add(lblNewLabel_4);
	}
}
