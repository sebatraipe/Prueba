package ar.unrn.ui;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class UI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Litros Cargados");
		lblNewLabel.setBounds(10, 47, 100, 14);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(144, 44, 128, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Tipo de Combustible");
		lblNewLabel_1.setBounds(10, 106, 124, 14);
		contentPane.add(lblNewLabel_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Super", "Com\u00FAn" }));
		comboBox.setBounds(144, 103, 128, 20);
		contentPane.add(comboBox);

		JButton btnNewButton = new JButton("Monto Total");
		btnNewButton.setBounds(34, 188, 120, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Confirmar Pago");
		btnNewButton_1.setBounds(164, 188, 128, 23);
		contentPane.add(btnNewButton_1);
	}
}