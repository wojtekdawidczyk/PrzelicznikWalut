package waluty;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;

import javafx.scene.control.ComboBox;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.awt.event.ActionEvent;

public class OknoPrzelicznika {

	private JFrame frame;
	private JTextField textField_KwotaPLN;
	private JTextField textField_KwotaWaluty;
	private JTextField textField_Wynik2;
	private JTextField textField_Wynik1;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OknoPrzelicznika window = new OknoPrzelicznika();
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
	public OknoPrzelicznika() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 542, 294);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Ile PLN?");
		
		JLabel lblNewLabel_1 = new JLabel("Na jaka walutę?");
		
		JLabel lblNewLabel_2 = new JLabel("Jaką walutę?");
		
		JLabel lblNewLabel_3 = new JLabel("Ile waluty na PLN?");
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF", "JPY", "GBP"}));
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF", "JPY", "GBP"}));
		
		textField_KwotaPLN = new JTextField();
		textField_KwotaPLN.setColumns(10);
		
		textField_KwotaWaluty = new JTextField();
		textField_KwotaWaluty.setColumns(10);
		
		JButton btnNewButton = new JButton("PRZELICZ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				przelicz();
			}
		});
		
		JLabel lblWynik = new JLabel("WYNIK:");
		
		JLabel label = new JLabel("WYNIK:");
		
		textField_Wynik2 = new JTextField();
		textField_Wynik2.setColumns(10);
		
		textField_Wynik1 = new JTextField();
		textField_Wynik1.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel)
						.addComponent(textField_KwotaPLN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(58)
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_1)))
						.addComponent(textField_KwotaWaluty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addGap(57)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_Wynik1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblWynik)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_Wynik2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(71, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(211)
					.addComponent(btnNewButton)
					.addContainerGap(236, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1)
						.addComponent(lblWynik))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_KwotaPLN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_Wynik1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_3)
						.addComponent(label))
					.addGap(3)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_KwotaWaluty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_Wynik2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(47)
					.addComponent(btnNewButton)
					.addGap(52))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	
	private void przelicz() {
			BigDecimal kwotaPln = new BigDecimal(textField_KwotaPLN.getText().replace(',', '.'));
			BigDecimal kwotaWaluta = new BigDecimal(textField_KwotaWaluty.getText().replace(',', '.'));
			
			String waluta1 = "" + comboBox_1.getSelectedItem();
			String waluta2 = "" + comboBox_2.getSelectedItem();
			
		try {
			BigDecimal kurs1 = Pobieranie.pobierzAktualnyKurs(waluta1);
			BigDecimal kurs2 = Pobieranie.pobierzAktualnyKurs(waluta2);
			
			Przelicznik przelicznik1 = new Przelicznik(kurs1);
			Przelicznik przelicznik2 = new Przelicznik(kurs2);
			
			BigDecimal wynik1 = przelicznik1.przeliczNaWalute(kwotaPln);
			BigDecimal wynik2 = przelicznik2.przeliczNaPLN(kwotaWaluta);
			
			textField_Wynik1.setText(""+wynik1);
			textField_Wynik2.setText(""+wynik2);
			
		} catch (ProblemZPobieraniem e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
