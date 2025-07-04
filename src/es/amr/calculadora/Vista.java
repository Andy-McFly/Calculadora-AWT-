package es.amr.calculadora;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Vista
{
	Frame vCalculadora = new Frame("Calculadora");
	TextField txfValor = new TextField(25);
	TextField txfResultado = new TextField(25);
	Label lblResultado = new Label("Resultado:");
	Button btn0 = new Button("  0  ");
	Button btn1 = new Button("  1  ");
	Button btn2 = new Button("  2  ");
	Button btn3 = new Button("  3  ");
	Button btn4 = new Button("  4  ");
	Button btn5 = new Button("  5  ");
	Button btn6 = new Button("  6  ");
	Button btn7 = new Button("  7  ");
	Button btn8 = new Button("  8  ");
	Button btn9 = new Button("  9  ");
	Button btnSum = new Button("  +  ");
	Button btnRes = new Button("  -  ");
	Button btnMul = new Button("  *  ");
	Button btnDiv = new Button("  /   ");
	Button btnLimpiar = new Button("  C  ");
	Button btnPunto = new Button("  .   ");
	Button btnResultado = new Button("  =  ");
	Panel pnl1 = new Panel();
	Panel pnl2 = new Panel();
	Panel pnl3 = new Panel();
	Panel pnl4 = new Panel();
	Panel pnl5 = new Panel();
	Panel pnl6 = new Panel();
	Panel pnl7 = new Panel();
	
	Font fuente = new Font("Arial", Font.BOLD, 15);
	Font fntNum = new Font("Arial", Font.PLAIN, 15);
	Color clrBotones = new Color(235, 234, 140);
	Color clrBotones2 = new Color(102, 198, 102);
	
	public Vista() 
	{
		vCalculadora.setLayout(new GridLayout(8, 1));
		vCalculadora.setSize(350, 350);
		vCalculadora.setLocationRelativeTo(null);
		vCalculadora.setResizable(false);
		vCalculadora.setBackground(Color.darkGray);
		
		btn0.setFont(fntNum);
		btn1.setFont(fntNum);
		btn2.setFont(fntNum);
		btn3.setFont(fntNum);
		btn4.setFont(fntNum);
		btn5.setFont(fntNum);
		btn6.setFont(fntNum);
		btn7.setFont(fntNum);
		btn8.setFont(fntNum);
		btn9.setFont(fntNum);
		btnSum.setFont(fuente);
		btnRes.setFont(fuente);
		btnMul.setFont(fuente);
		btnDiv.setFont(fuente);
		btnPunto.setFont(fuente);
		btnResultado.setFont(fuente);
		btnLimpiar.setFont(fuente);
		txfValor.setFont(fuente);
		txfResultado.setFont(fuente);
		lblResultado.setFont(fuente);
		
		btnSum.setBackground(clrBotones);
		btnRes.setBackground(clrBotones);
		btnMul.setBackground(clrBotones);
		btnDiv.setBackground(clrBotones);
		btnPunto.setBackground(clrBotones2);
		btnResultado.setBackground(clrBotones2);
		pnl1.setBackground(new Color(120, 120, 120));
		txfValor.setBackground(new Color(251, 254, 199));
		txfResultado.setBackground(new Color(190, 194, 248));
		btnLimpiar.setBackground(new Color(164, 177, 227));
		
		txfResultado.setForeground(new Color(60, 60, 60));
		btnLimpiar.setForeground(new Color(200, 50, 50));
		
		pnl1.add(txfValor);
		vCalculadora.add(pnl1);
		pnl2.add(btn7);
		vCalculadora.add(pnl2);
		pnl2.add(btn8);
		vCalculadora.add(pnl2);
		pnl2.add(btn9);
		vCalculadora.add(pnl2);
		pnl2.add(btnDiv);
		vCalculadora.add(pnl2);
		pnl3.add(btn4);
		vCalculadora.add(pnl3);
		pnl3.add(btn5);
		vCalculadora.add(pnl3);
		pnl3.add(btn6);
		vCalculadora.add(pnl3);
		pnl3.add(btnMul);
		vCalculadora.add(pnl3);
		pnl4.add(btn1);
		vCalculadora.add(pnl4);
		pnl4.add(btn2);
		vCalculadora.add(pnl4);
		pnl4.add(btn3);
		vCalculadora.add(pnl4);
		pnl4.add(btnRes);
		vCalculadora.add(pnl4);
		pnl5.add(btn0);
		vCalculadora.add(pnl5);
		pnl5.add(btnPunto);
		vCalculadora.add(pnl5);
		pnl5.add(btnResultado);
		vCalculadora.add(pnl5);
		pnl5.add(btnSum);
		vCalculadora.add(pnl5);
		lblResultado.setAlignment(Label.CENTER);
		vCalculadora.add(lblResultado);
		pnl6.add(txfResultado);
		vCalculadora.add(pnl6);
		pnl7.add(btnLimpiar);
		vCalculadora.add(pnl7);
		
		txfValor.requestFocus();
		txfResultado.setEditable(false);
		
		vCalculadora.setVisible(true);
	}
}
