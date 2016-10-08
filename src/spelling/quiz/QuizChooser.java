package spelling.quiz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuizChooser extends JDialog {


	/**
	 * Create the dialog.
	 */
	public QuizChooser() {
		setTitle("Choose Quiz");
		setName("dialog216");
		setModal(true);
		setBounds(100, 100, 360, 350);
		getContentPane().setLayout(null);
		
		JLabel lblNZCERLevel = new JLabel("Choose NZCER spelling list level\r\n");
		lblNZCERLevel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNZCERLevel.setFont(new Font("Arial Narrow", Font.PLAIN, 24));
		lblNZCERLevel.setBounds(0, 11, 344, 48);
		getContentPane().add(lblNZCERLevel);
		
		JButton btn1 = new JButton("1");
		btn1.setFocusPainted(false);
		btn1.setBounds(32, 70, 39, 39);
		getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFocusPainted(false);
		btn2.setBounds(81, 70, 39, 39);
		getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFocusPainted(false);
		btn3.setBounds(130, 70, 39, 39);
		getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setFocusPainted(false);
		btn4.setBounds(179, 70, 39, 39);
		getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFocusPainted(false);
		btn5.setBounds(228, 70, 39, 39);
		getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFocusPainted(false);
		btn6.setBounds(277, 70, 39, 39);
		getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setFocusPainted(false);
		btn7.setBounds(42, 120, 39, 39);
		getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFocusPainted(false);
		btn8.setBounds(91, 120, 39, 39);
		getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFocusPainted(false);
		btn9.setBounds(140, 120, 39, 39);
		getContentPane().add(btn9);
		
		JButton btn10 = new JButton("10");
		btn10.setFocusPainted(false);
		btn10.setBounds(189, 120, 45, 39);
		getContentPane().add(btn10);
		
		JButton btn11 = new JButton("11");
		btn11.setFocusPainted(false);
		btn11.setBounds(244, 120, 45, 39);
		getContentPane().add(btn11);
		
		JLabel lblUseOwnList = new JLabel("or use own list");
		lblUseOwnList.setHorizontalAlignment(SwingConstants.CENTER);
		lblUseOwnList.setFont(new Font("Arial Narrow", Font.PLAIN, 24));
		lblUseOwnList.setBounds(0, 170, 344, 29);
		getContentPane().add(lblUseOwnList);
		
		JComboBox ownListComboBox = new JComboBox();
		ownListComboBox.setBounds(32, 210, 223, 29);
		getContentPane().add(ownListComboBox);
		
		JButton btnConfirmLvl = new JButton("OK");
		btnConfirmLvl.setFocusPainted(false);
		btnConfirmLvl.setBounds(260, 210, 56, 29);
		getContentPane().add(btnConfirmLvl);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancel.setFocusPainted(false);
		btnCancel.setBounds(130, 259, 89, 29);
		getContentPane().add(btnCancel);
	}
}
