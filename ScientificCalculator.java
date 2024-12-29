// A code for scientific calculation having different operation
//Sobiya Vhora

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ScientificCalculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnsin;
	private JButton btncos;
	private JButton btntan;
	private JButton btnabs;
	private JButton btnmode;
	private JButton btnsqrt;
	private JButton btnpi_2;
	private JButton btnE_2;
	private JButton btnfact;
	private JButton btndiv;
	private JButton btnpower;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnmul;
	private JButton btn10pow;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnmin;
	private JButton btnlog;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnadd;
	private JButton btnln;
	private JButton btnneg;
	private JButton btn0;
	private JButton btnflot;
	private JButton btneq;
	private JButton btn2n;
	private JButton btnpi;
	private JButton btnE;
	private JButton btnce;
	private JButton btnx;
	double first,sec;
	BigInteger result;
	String Opt,ans,eq;
	double res;
	String x;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientificCalculator frame = new ScientificCalculator();
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
	public ScientificCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 0, 128), null, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		// text field
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(255, 128, 128));
		textField.setColumns(10);
		textField.setBounds(232, 50, 370, 42);
		contentPane.add(textField);
		textField.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		// all computer button
		
		// sin button
		btnsin = new JButton("sin");
		btnsin.setForeground(new Color(255, 255, 255));
		btnsin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnsin.setBackground(new Color(128, 128, 255));
		btnsin.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btnsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()== true) {
					textField.setText("sin(0)");
					first = 0.0;
					res = Math.sin(first);
					textField.setText(String.valueOf(res));
					Opt= "sin";
				}
				else {
					first = Double.valueOf(textField.getText());
					first = Math.toRadians(first);
					res = Math.sin(first);
					textField.setText(String.valueOf(res));
					Opt ="sin";
				}
			}
		});
		btnsin.setBounds(232, 148, 68, 36);
		contentPane.add(btnsin);
		// complete Sin button
		
		// cos button 
		btncos = new JButton("cos");
		btncos.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btncos.setForeground(new Color(255, 255, 255));
		btncos.setFont(new Font("Tahoma", Font.BOLD, 16));
		btncos.setBackground(new Color(128, 128, 255));
		btncos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()== true) {
					textField.setText("cos(0)");
					first = 0.0;
					res = Math.cos(first);
					textField.setText(String.valueOf(res));
					Opt= "cos";
				}
				else {
				first = Double.valueOf(textField.getText());
				first = Math.toRadians(first);
				res = Math.cos(first);
				textField.setText(String.valueOf(res));
				 Opt ="cos";
				}
			}
		});
		btncos.setBounds(310, 148, 61, 36);
		contentPane.add(btncos);
		
		
		// completed cos button
		
		// tan button
		btntan = new JButton("tan");
		btntan.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btntan.setForeground(new Color(255, 255, 255));
		btntan.setFont(new Font("Tahoma", Font.BOLD, 16));
		btntan.setBackground(new Color(128, 128, 255));
		btntan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()== true) {
					textField.setText("tan(0)");
					first = 0.0;
					res = Math.tan(first);
					textField.setText(String.valueOf(res));
					Opt= "tan";
				}
				else {
					first = Double.valueOf(textField.getText());
					first = Math.toRadians(first);
					res = Math.tan(first);
					textField.setText(String.valueOf(res));
					Opt ="tan";
				}
			}
		});
		btntan.setBounds(381, 148, 61, 36);
		contentPane.add(btntan);
		
		// completed tan button
		
		// abs button
		btnabs = new JButton("|x|");
		btnabs.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btnabs.setForeground(new Color(255, 255, 255));
		btnabs.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnabs.setBackground(new Color(128, 128, 255));
		btnabs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()== true)
					 first = 0.0;
				 else
					 first = Double.valueOf(textField.getText());
				res = Math.abs(first);
				textField.setText(String.valueOf(res));
				Opt ="|x|";
			}
		});
		btnabs.setBounds(452, 148, 70, 36);
		contentPane.add(btnabs);
		//completed abs button
		
		
		// mode button
		btnmode = new JButton("%");
		btnmode.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btnmode.setForeground(new Color(255, 255, 255));
		btnmode.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnmode.setBackground(new Color(128, 128, 255));
		btnmode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()== true)
					 first = 0.0;
				else
					 first = Double.valueOf(textField.getText());
				textField.setText("");
				Opt ="%";
			}
		});
		btnmode.setBounds(532, 148, 70, 36);
		contentPane.add(btnmode);
		// completed mode button
		
		//sqrt button
		btnsqrt = new JButton("sqrt");
		btnsqrt.setForeground(new Color(255, 255, 255));
		btnsqrt.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btnsqrt.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnsqrt.setBackground(new Color(128, 128, 255));
		btnsqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()== true)
					 first = 0.0;
				 else
					 first = Double.valueOf(textField.getText());
				res = Math.sqrt(first);
				textField.setText(String.valueOf(res));
				Opt ="sqrt";
			}
		});
		btnsqrt.setBounds(232, 194, 68, 36);
		contentPane.add(btnsqrt);
		// completed sqrt button
		
	
		// factorial button
		btnfact = new JButton("n!");
		btnfact.setForeground(new Color(255, 255, 255));
		btnfact.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnfact.setBackground(new Color(128, 128, 255));
		btnfact.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btnfact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(textField.getText().isEmpty()== true)
					 first = 0.0;
				 else
					 first = Double.valueOf(textField.getText());
				 res = factorial(first);
				 textField.setText(String.valueOf(res));
				 Opt ="n!";
			}
			int factorial(double n) 
		    { 
		        int re = 1, i; 
		        for (i = 2; i <= n; i++) 
		            re *= i; 
		        return re; 
		    } 
		});
		btnfact.setBounds(452, 194, 70, 36);
		contentPane.add(btnfact);
		// completed factorial button
		
		//basic arithmetic operators
		btndiv = new JButton("/");
		btndiv.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btndiv.setForeground(new Color(255, 255, 255));
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 16));
		btndiv.setBackground(new Color(128, 128, 255));
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(textField.getText().isEmpty()== true)
					 first = 0.0;
				 else
					 first = Double.valueOf(textField.getText());
				 textField.setText("");
				 Opt ="/";
			}
		});
		
		btnmul = new JButton("*");
		btnmul.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btnmul.setForeground(new Color(255, 255, 255));
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnmul.setBackground(new Color(128, 128, 255));
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()== true)
					 first = 0.0;
				 else
					 first = Double.valueOf(textField.getText());
				 textField.setText("");
				 Opt ="*";
			}
		});
		btnmul.setBounds(532, 240, 70, 36);
		contentPane.add(btnmul);
		
		
		btndiv.setBounds(532, 194, 70, 36);
		contentPane.add(btndiv);
		
		btnmin = new JButton("-");
		btnmin.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btnmin.setForeground(new Color(255, 255, 255));
		btnmin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnmin.setBackground(new Color(128, 128, 255));
		btnmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()== true)
					 first = 0.0;
				 else
					 first = Double.valueOf(textField.getText());
				 textField.setText("");
				 Opt ="-";
			}
		});
		btnmin.setBounds(532, 286, 70, 36);
		contentPane.add(btnmin);
		btnadd = new JButton("+");
		btnadd.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btnadd.setForeground(new Color(255, 255, 255));
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnadd.setBackground(new Color(128, 128, 255));
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()== true)
					 first = 0.0;
				 else
					 first = Double.valueOf(textField.getText());
				 textField.setText("");
				 Opt ="+";
			}
		});
		btnadd.setBounds(532, 332, 70, 36);
		contentPane.add(btnadd);
		
		// completed basic arithmetic operators
		
		// power buttons
		
		btnpower = new JButton("x^y");
		btnpower.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btnpower.setForeground(new Color(255, 255, 255));
		btnpower.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnpower.setBackground(new Color(128, 128, 255));
		btnpower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(textField.getText().isEmpty()== true)
					 first = 0.0;
				 else
					 first = Double.valueOf(textField.getText());
				 textField.setText("");
				 Opt ="^";
			}
		});
		btnpower.setBounds(232, 240, 68, 36);
		contentPane.add(btnpower);
		
		btn10pow = new JButton("10^x");
		btn10pow.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btn10pow.setForeground(new Color(255, 255, 255));
		btn10pow.setBackground(new Color(128, 128, 255));
		btn10pow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()== true)
					 first = 0.0;
				 else
					 first = Double.valueOf(textField.getText());
				res = Math.pow(10, first);
				textField.setText(String.valueOf(res));
			}
		});
		btn10pow.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn10pow.setBounds(232, 286, 68, 36);
		contentPane.add(btn10pow);
		
	// square button
		
		btnpi_2 = new JButton("x^2");
		btnpi_2.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btnpi_2.setForeground(new Color(255, 255, 255));
		btnpi_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnpi_2.setBackground(new Color(128, 128, 255));
		btnpi_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()== true)
					 first = 0.0;
				 else
					 first = Double.valueOf(textField.getText());
				res = Math.pow(first,2);
				textField.setText(String.valueOf(res));
				Opt ="^2";
			}
		});
		btnpi_2.setBounds(310, 194, 61, 36);
		contentPane.add(btnpi_2);
		//completed square button
		
		// Cube button
		btnE_2 = new JButton("x^3");
		btnE_2.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btnE_2.setForeground(new Color(255, 255, 255));
		btnE_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnE_2.setBackground(new Color(128, 128, 255));
		btnE_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()== true)
					 first = 0.0;
				 else
					 first = Double.valueOf(textField.getText());
				res = Math.pow(first,3);
				textField.setText(String.valueOf(res));
				Opt ="^3";
		    }
		});
		btnE_2.setBounds(381, 194, 61, 36);
		contentPane.add(btnE_2);
		// completed cube button
		btn2n = new JButton("2^n");
		btn2n.setBorder(new BevelBorder(BevelBorder.RAISED));
		btn2n.setForeground(new Color(255, 255, 255));
		btn2n.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2n.setBackground(new Color(128, 128, 255));
		btn2n.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()== true)
					 first = 0.0;
				 else
					 first = Double.valueOf(textField.getText());
				 first = Math.pow(2, first);
				 textField.setText(String.valueOf(first));
			}
		});
		btn2n.setBounds(232, 102, 68, 36);
		contentPane.add(btn2n);
		
		// completed power buttons
		
		//basic number and default values
		
		btn7 = new JButton("7");
		btn7.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btn7.setForeground(new Color(255, 255, 255));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.setBackground(new Color(128, 128, 255));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btn7.getText();
				 textField.setText(num);
			}
		});
		btn7.setBounds(310, 240, 61, 36);
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btn8.setForeground(new Color(255, 255, 255));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBackground(new Color(128, 128, 255));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btn8.getText();
				 textField.setText(num);
			}
		});
		btn8.setBounds(381, 240, 61, 36);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btn9.setForeground(new Color(255, 255, 255));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.setBackground(new Color(128, 128, 255));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btn9.getText();
				 textField.setText(num);
			}
		});
		btn9.setBounds(452, 240, 70, 36);
		contentPane.add(btn9);
		
		btn4 = new JButton("4");
		btn4.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.setBackground(new Color(128, 128, 255));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btn4.getText();
				 textField.setText(num);
			}
		});
		btn4.setBounds(310, 286, 61, 36);
		contentPane.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setBackground(new Color(128, 128, 255));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btn5.getText();
				 textField.setText(num);
			}
		});
		btn5.setBounds(381, 286, 61, 36);
		contentPane.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btn6.setForeground(new Color(255, 255, 255));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.setBackground(new Color(128, 128, 255));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btn6.getText();
				 textField.setText(num);
			}
		});
		btn6.setBounds(452, 286, 70, 36);
		contentPane.add(btn6);
		
		
	
		
		btn1 = new JButton("1");
		btn1.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.setBackground(new Color(128, 128, 255));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btn1.getText();
				 textField.setText(num);
			}
		});
		btn1.setBounds(310, 332, 61, 36);
		contentPane.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBackground(new Color(128, 128, 255));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btn2.getText();
				 textField.setText(num);
			}
		});
		btn2.setBounds(381, 332, 61, 36);
		contentPane.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.setBackground(new Color(128, 128, 255));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btn3.getText();
				 textField.setText(num);
			}
		});
		btn3.setBounds(452, 332, 70, 36);
		contentPane.add(btn3);
		
		btn0 = new JButton("0");
		btn0.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btn0.setForeground(new Color(255, 255, 255));
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn0.setBackground(new Color(128, 128, 255));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+btn0.getText();
				 textField.setText(num);
			}
		});
		btn0.setBounds(381, 378, 61, 36);
		contentPane.add(btn0);
		
		
		btnpi = new JButton("pi");
		btnpi.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btnpi.setForeground(new Color(255, 255, 255));
		btnpi.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnpi.setBackground(new Color(128, 128, 255));
		btnpi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText("3.14");
			}
		});
		btnpi.setBounds(310, 102, 61, 36);
		contentPane.add(btnpi);
		
		btnE = new JButton("e");
		btnE.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btnE.setForeground(new Color(255, 255, 255));
		btnE.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnE.setBackground(new Color(128, 128, 255));
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText("2.718281828459045");
			}
		});
		btnE.setBounds(381, 102, 61, 36);
		contentPane.add(btnE);
		
		// completed basic numbers and default values
		
		// Logarithm with base 10 and e
		btnlog = new JButton("log");
		btnlog.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btnlog.setForeground(new Color(255, 255, 255));
		btnlog.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnlog.setBackground(new Color(128, 128, 255));
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()== true)
					 first = 0.0;
				 else
					 first = Double.valueOf(textField.getText());
				res = Math.log(first);
				textField.setText(String.valueOf(res));
				 Opt ="log";
			}
		});
		btnlog.setBounds(232, 332, 68, 36);
		contentPane.add(btnlog);
		
		btnln = new JButton("ln");
		btnln.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btnln.setForeground(new Color(255, 255, 255));
		btnln.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnln.setBackground(new Color(128, 128, 255));
		btnln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()== true)
					 first = 0.0;
				 else
					 first = Double.valueOf(textField.getText());
				res = Math.log10(first);
				textField.setText(String.valueOf(res));
				 Opt ="ln";
			}
		});
		btnln.setBounds(232, 378, 68, 36);
		contentPane.add(btnln);
		
		
		// completed Logarithm
		
		// sign change and float values
		btnneg = new JButton("+/-");
		btnneg.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btnneg.setForeground(new Color(255, 255, 255));
		btnneg.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnneg.setBackground(new Color(128, 128, 255));
		btnneg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     if(textField.getText().lastIndexOf("-")== -1) {
			    	 textField.setText("-"+textField.getText());
			     }
			     else {
			    	 if(textField.getText().isEmpty()== true)
						 first = 0.0;
					 else
						 first = Double.valueOf(textField.getText());
			    	 first = Math.abs(first);
			    	 textField.setText(String.valueOf(first));
			     }
				 
			}
		});
		btnneg.setBounds(310, 378, 61, 36);
		contentPane.add(btnneg);
		
		
		
		btnflot = new JButton(".");
		btnflot.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btnflot.setForeground(new Color(255, 255, 255));
		btnflot.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnflot.setBackground(new Color(128, 128, 255));
		btnflot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().lastIndexOf(".")== -1) {
					textField.setText(textField.getText()+".");
				}
				else {
				 textField.setText(textField.getText());
				}
			}
		});
		btnflot.setBounds(452, 378, 70, 36);
		contentPane.add(btnflot);
		
		
		// completed sign change and float
		
		// clear the result 
		btnce = new JButton("CE");
		btnce.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btnce.setForeground(new Color(255, 255, 255));
		btnce.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnce.setBackground(new Color(128, 128, 255));
		btnce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = sec = 0;
				res = 0;
				textField.setText("");	
			}
		});
		btnce.setBounds(452, 102, 70, 36);
		contentPane.add(btnce);
		// completed clear
		
		
		// undo mistake
		btnx = new JButton("x");
		btnx.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btnx.setForeground(new Color(255, 255, 255));
		btnx.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnx.setBackground(new Color(128, 128, 255));
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField.getText().isEmpty()== true) {
					first = 0;
					textField.setText("0");
				}
				else {
					
					if(Double.valueOf(textField.getText()).isNaN()== true) {
						first = 0;
						textField.setText("0");
					}
					else {
						first = Double.valueOf(textField.getText());
						int n = textField.getText().length();
						x = textField.getText().substring(0,n-1);
						textField.setText(x);
						Opt ="x";
					}
				}
				
			}
		});
		
		btnx.setBounds(532, 102, 70, 36);
		contentPane.add(btnx);
		// completed undo mistake section
		
		// answer of calculation
		
		btneq = new JButton("=");
		btneq.setBorder((Border) new BevelBorder(BevelBorder.RAISED));
		btneq.setForeground(new Color(255, 255, 255));
		btneq.setFont(new Font("Tahoma", Font.BOLD, 16));
		btneq.setBackground(new Color(128, 128, 255));
		btneq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Opt=="+") {
					 sec = Double.valueOf(textField.getText());
					 res = first+sec;
					 ans = String.format("%.2f", res);
					 textField.setText(ans);
				}
				else if(Opt=="-") {
					 sec = Double.valueOf(textField.getText());
					 res = first-sec;
					 ans = String.format("%.2f", res);
					 textField.setText(ans);
				}
				else if(Opt=="*") {
					 sec = Double.valueOf(textField.getText());
					 res = first*sec;
					 ans = String.format("%.2f", res);
					 textField.setText(ans);
				}
				else if(Opt=="/") {
					sec = Double.valueOf(textField.getText());
					if(sec !=0) {
					 res = first/sec;
					 ans = String.format("%.2f", res);
					 textField.setText(ans);
					}
					else
						textField.setText("MathError!!");
				}
				else if(Opt=="%") {
					sec = Double.valueOf(textField.getText());
					res = first%sec;
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
				else if(Opt=="sin") {
					first = Math.toRadians(first);
					res = Math.sin(first);
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
				else if(Opt=="cos") {
					first = Math.toRadians(first);
					res = Math.cos(first);
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
				else if(Opt=="tan") {
					first = Math.toRadians(first);
					res = Math.tan(first);
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
				else if(Opt=="|x|") {
					res = Math.abs(first);
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
				else if(Opt=="ln") {
					res = Math.log(first);
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
				else if(Opt=="log") {
					res = Math.log10(first);
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
				else if(Opt=="^") {
					sec = Double.valueOf(textField.getText());
					res = Math.pow(first,sec);
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
				else if(Opt=="sqrt") {
					res = Math.sqrt(first);
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
				else if(Opt=="^2") {
					res = Math.pow(first,2);
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
				else if(Opt=="^3") {
					res = Math.pow(first,3);
					ans = String.format("%.2f", res);
					textField.setText(ans);
				}
				
			}
		});
		btneq.setBounds(532, 378, 70, 36);
		contentPane.add(btneq);
		//completed answer of calculation
		
		
		// completed the code
	}
}
