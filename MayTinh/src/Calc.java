import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc extends JFrame {
	private JTextField jtxDisplay;
	double firstnum;
	double secondnum;
	double result;
	String operations;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
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
	public Calc() {
		getContentPane().setLayout(null);
		
		jtxDisplay = new JTextField();
		jtxDisplay.setFont(new Font("Tahoma", Font.BOLD, 18));
		jtxDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxDisplay.setBounds(21, 22, 352, 44);
		getContentPane().add(jtxDisplay);
		jtxDisplay.setColumns(10);
		
		JButton jBtn1 = new JButton("1");
		jBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Enternumber = jtxDisplay.getText() + jBtn1.getText();
				jtxDisplay.setText(Enternumber);
			}
		});
		jBtn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		jBtn1.setBounds(21, 90, 80, 66);
		getContentPane().add(jBtn1);
		
		JButton jBtn2 = new JButton("2");
		jBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxDisplay.getText() + jBtn2.getText();
				jtxDisplay.setText(Enternumber);
			}
		});
		jBtn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		jBtn2.setBounds(111, 90, 80, 66);
		getContentPane().add(jBtn2);
		
		JButton jBtn3 = new JButton("3");
		jBtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxDisplay.getText() + jBtn3.getText();
				jtxDisplay.setText(Enternumber);
			}
		});
		jBtn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		jBtn3.setBounds(201, 90, 80, 66);
		getContentPane().add(jBtn3);
		
		JButton jBtn4 = new JButton("4");
		jBtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxDisplay.getText() + jBtn4.getText();
				jtxDisplay.setText(Enternumber);
			}
		});
		jBtn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		jBtn4.setBounds(293, 90, 80, 66);
		getContentPane().add(jBtn4);
		
		JButton jBtn5 = new JButton("5");
		jBtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxDisplay.getText() + jBtn5.getText();
				jtxDisplay.setText(Enternumber);
			}
		});
		jBtn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		jBtn5.setBounds(21, 167, 80, 66);
		getContentPane().add(jBtn5);
		
		JButton jBtn6 = new JButton("6");
		jBtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxDisplay.getText() + jBtn6.getText();
				jtxDisplay.setText(Enternumber);
			}
		});
		jBtn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		jBtn6.setBounds(111, 167, 80, 66);
		getContentPane().add(jBtn6);
		
		JButton jBtn7 = new JButton("7");
		jBtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxDisplay.getText() + jBtn7.getText();
				jtxDisplay.setText(Enternumber);
			}
		});
		jBtn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		jBtn7.setBounds(201, 167, 80, 66);
		getContentPane().add(jBtn7);
		
		JButton jBtn8 = new JButton("8");
		jBtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxDisplay.getText() + jBtn8.getText();
				jtxDisplay.setText(Enternumber);
			}
		});
		jBtn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		jBtn8.setBounds(293, 167, 80, 66);
		getContentPane().add(jBtn8);
		
		JButton jBtn9 = new JButton("9");
		jBtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxDisplay.getText() + jBtn9.getText();
				jtxDisplay.setText(Enternumber);
			}
		});
		jBtn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		jBtn9.setBounds(21, 244, 80, 66);
		getContentPane().add(jBtn9);
		
		JButton jBtn10 = new JButton("0");
		jBtn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxDisplay.getText() + jBtn10.getText();
				jtxDisplay.setText(Enternumber);
			}
		});
		jBtn10.setFont(new Font("Tahoma", Font.BOLD, 18));
		jBtn10.setBounds(111, 244, 80, 66);
		getContentPane().add(jBtn10);
		
		JButton jBtn11 = new JButton("+");
		jBtn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(jtxDisplay.getText());
				jtxDisplay.setText("");
				operations="+";
			}
		});
		jBtn11.setFont(new Font("Tahoma", Font.BOLD, 18));
		jBtn11.setBounds(201, 244, 80, 66);
		getContentPane().add(jBtn11);
		
		JButton jBtn12 = new JButton("-");
		jBtn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(jtxDisplay.getText());
				jtxDisplay.setText("");
				operations="-";
			}
		});
		jBtn12.setFont(new Font("Tahoma", Font.BOLD, 18));
		jBtn12.setBounds(293, 244, 80, 66);
		getContentPane().add(jBtn12);
		
		JButton jBtn13 = new JButton("*");
		jBtn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(jtxDisplay.getText());
				jtxDisplay.setText("");
				operations="*";
			}
		});
		jBtn13.setFont(new Font("Tahoma", Font.BOLD, 18));
		jBtn13.setBounds(21, 321, 80, 66);
		getContentPane().add(jBtn13);
		
		JButton jBtn14 = new JButton("/");
		jBtn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(jtxDisplay.getText());
				jtxDisplay.setText("");
				operations="/";
			}
		});
		jBtn14.setFont(new Font("Tahoma", Font.BOLD, 18));
		jBtn14.setBounds(111, 321, 80, 66);
		getContentPane().add(jBtn14);
		
		JButton jBtn15 = new JButton("+/-");
		jBtn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(jtxDisplay.getText()));
				ops = ops*(-1);
				jtxDisplay.setText(String.valueOf(ops));
			}
		});
		jBtn15.setFont(new Font("Tahoma", Font.BOLD, 18));
		jBtn15.setBounds(201, 321, 80, 66);
		getContentPane().add(jBtn15);
		
		JButton jBtn16 = new JButton(".");
		jBtn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxDisplay.getText() + jBtn16.getText();
				jtxDisplay.setText(Enternumber);
			}
		});
		jBtn16.setFont(new Font("Tahoma", Font.BOLD, 18));
		jBtn16.setBounds(293, 321, 80, 66);
		getContentPane().add(jBtn16);
		
		JButton jBtn17 = new JButton("C");
		jBtn17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxDisplay.setText("");
			}
		});
		jBtn17.setFont(new Font("Tahoma", Font.BOLD, 18));
		jBtn17.setBounds(21, 398, 170, 52);
		getContentPane().add(jBtn17);
		
		JButton jBTN18 = new JButton("=");
		jBTN18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(jtxDisplay.getText());
				if(operations=="+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					jtxDisplay.setText(answer);
				}
				else if(operations=="-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					jtxDisplay.setText(answer);
				}
				else if(operations=="*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					jtxDisplay.setText(answer);
				}
				else if(operations=="/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					jtxDisplay.setText(answer);
				}
				else if(operations=="%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					jtxDisplay.setText(answer);
				}
			}
		});
		jBTN18.setFont(new Font("Tahoma", Font.BOLD, 18));
		jBTN18.setBounds(203, 398, 170, 52);
		getContentPane().add(jBTN18);
	}
}
