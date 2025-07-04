package es.amr.calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, ActionListener, KeyListener
{
	Modelo modelo;
	Vista vista;
	boolean segundoNumero = false;
	char operacion = 'n';
	
	public Controlador(Modelo m, Vista v) 
	{
		modelo = m;
		vista = v;
		
		v.vCalculadora.addWindowListener(this);
		v.vCalculadora.addKeyListener(this);
		v.txfValor.addKeyListener(this);
		v.btn0.addActionListener(this);
		v.btn1.addActionListener(this);
		v.btn2.addActionListener(this);
		v.btn3.addActionListener(this);
		v.btn4.addActionListener(this);
		v.btn5.addActionListener(this);
		v.btn6.addActionListener(this);
		v.btn7.addActionListener(this);
		v.btn8.addActionListener(this);
		v.btn9.addActionListener(this);
		v.btnPunto.addActionListener(this);
		v.btnSum.addActionListener(this);
		v.btnRes.addActionListener(this);
		v.btnMul.addActionListener(this);
		v.btnDiv.addActionListener(this);
		v.btnResultado.addActionListener(this);
		v.btnLimpiar.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent btn)
	{
		String valor = vista.txfValor.getText();
		String valorResultado = vista.txfResultado.getText();
		double numero1 = 0;
		double numero2 = 0;
		double resultado = 0;
		
		if (btn.getSource().equals(vista.btn0))
		{
			valor += '0';
		}
		
		else if (btn.getSource().equals(vista.btn1))
		{
			valor += '1';
		}
		
		else if (btn.getSource().equals(vista.btn2))
		{
			valor += '2';
		}
		
		else if (btn.getSource().equals(vista.btn3))
		{
			valor += '3';
		}
		
		else if (btn.getSource().equals(vista.btn4))
		{
			valor += '4';
		}
		
		else if (btn.getSource().equals(vista.btn5))
		{
			valor += '5';
		}
		
		else if (btn.getSource().equals(vista.btn6))
		{
			valor += '6';
		}
		
		else if (btn.getSource().equals(vista.btn7))
		{
			valor += '7';
		}
		
		else if (btn.getSource().equals(vista.btn8))
		{
			valor += '8';
		}
		
		else if (btn.getSource().equals(vista.btn9))
		{
			valor += '9';
		}
		
		else if (btn.getSource().equals(vista.btnPunto))
		{
			if(!valor.contains(".")) 
			{
				if (valor.isEmpty()) 
				{
			        valor = "0.";
			    } 
				else 
				{
			        valor += '.';
			    }
			}
		}
		
		else if (btn.getSource().equals(vista.btnSum))
		{
			if(!valorResultado.isEmpty()) 
			{
				valorResultado = modelo.operacionPendiente(operacion, valor, valorResultado, numero1, numero2, resultado);
				numero1 = 0;
				valor = "";
			}
			
			else if (!valor.isEmpty()) 
			{
				try 
				{
					numero1 = Double.parseDouble(valor);
					valorResultado = numero1 + "";
					numero2 = Double.parseDouble(valorResultado);
				}
				catch (NumberFormatException e) {}
				
				numero1 = 0;
				valor = "";
			}
			
			operacion = '+';
		}
		
		else if (btn.getSource().equals(vista.btnRes))
		{
			if(!valorResultado.isEmpty()) 
			{
				valorResultado = modelo.operacionPendiente(operacion, valor, valorResultado, numero1, numero2, resultado);
				numero1 = 0;
				valor = "";
			}
			
			else if (!valor.isEmpty()) 
			{
				try 
				{
					numero1 = Double.parseDouble(valor);
					valorResultado = numero1 + "";
					numero2 = Double.parseDouble(valorResultado);
				}
				catch (NumberFormatException e) 
				{
					valor += '-';
				}
				
				numero1 = 0;
				valor = "";
			}
			
			operacion = '-';
		}
		
		else if (btn.getSource().equals(vista.btnMul))
		{
			if(!valorResultado.isEmpty()) 
			{
				valorResultado = modelo.operacionPendiente(operacion, valor, valorResultado, numero1, numero2, resultado);
				numero1 = 0;
				valor = "";
			}
			
			else if (!valor.isEmpty()) 
			{
				try 
				{
					numero1 = Double.parseDouble(valor);
					valorResultado = numero1 + "";
					numero2 = Double.parseDouble(valorResultado);
				}
				catch (NumberFormatException e) {}
				
				numero1 = 0;
				valor = "";
			}
			
			operacion = '*';
		}
		
		else if (btn.getSource().equals(vista.btnDiv))
		{
			if(!valorResultado.isEmpty()) 
			{
				valorResultado = modelo.operacionPendiente(operacion, valor, valorResultado, numero1, numero2, resultado);
				numero1 = 0;
				valor = "";
			}
			
			else if (!valor.isEmpty()) 
			{
				try 
				{
					numero1 = Double.parseDouble(valor);
					valorResultado = numero1 + "";
					numero2 = Double.parseDouble(valorResultado);
				}
				catch (NumberFormatException e) {}
				
				numero1 = 0;
				valor = "";
			}
			
			operacion = '/';
		}
		
		else if (btn.getSource().equals(vista.btnResultado))
		{
			if(!valorResultado.isEmpty()) 
			{
				valorResultado = modelo.operacionPendiente(operacion, valor, valorResultado, numero1, numero2, resultado);
				numero1 = 0;
				valor = "";
			}
			
			operacion = 'n';
		}
		
		else if (btn.getSource().equals(vista.btnLimpiar))
		{
			valor = "";
			valorResultado = "";
			numero1 = 0;
			numero2 = 0;
			resultado = 0;
			operacion = 'n';
			vista.txfValor.requestFocus();
		}
		
		vista.txfValor.setText(valor);
		vista.txfResultado.setText(valorResultado);
	}
	
	@Override
	public void keyPressed(KeyEvent teclado)
	{
		if (teclado.getKeyChar() == '+')
		{
			vista.btnSum.dispatchEvent(new ActionEvent(vista.btnSum, ActionEvent.ACTION_PERFORMED, "  +  "));
		}
		
		else if (teclado.getKeyChar() == '-')
		{
			vista.btnRes.dispatchEvent(new ActionEvent(vista.btnRes, ActionEvent.ACTION_PERFORMED, "  -  "));
		}
		
		else if (teclado.getKeyChar() == '*')
		{
			vista.btnMul.dispatchEvent(new ActionEvent(vista.btnMul, ActionEvent.ACTION_PERFORMED, "  *  "));
		}
		
		else if (teclado.getKeyChar() == '/')
		{
			vista.btnDiv.dispatchEvent(new ActionEvent(vista.btnDiv, ActionEvent.ACTION_PERFORMED, "  /   "));
		}
		
		else if (teclado.getKeyCode() == KeyEvent.VK_ENTER)
		{
			vista.btnResultado.dispatchEvent(new ActionEvent(vista.btnResultado, ActionEvent.ACTION_PERFORMED, "  =  "));
		}
		
		else if (teclado.getKeyCode() == KeyEvent.VK_DELETE)
		{
			vista.btnLimpiar.dispatchEvent(new ActionEvent(vista.btnLimpiar, ActionEvent.ACTION_PERFORMED, "  C  "));
		}
	}

	@Override public void keyTyped(KeyEvent restriccionTeclas)
	{
		char tecla = restriccionTeclas.getKeyChar();
		
		if (!Character.isDigit(tecla) && tecla != '.' && tecla != '\b')
		{
			restriccionTeclas.consume();
		}
		
		if (tecla == '.' && vista.txfValor.getText().contains("."))
		{
			restriccionTeclas.consume();
		}
		
		if (tecla == '.' && vista.txfValor.getText().isEmpty())
		{
			restriccionTeclas.consume();
		}
	}
	
	@Override
	public void windowClosing(WindowEvent e)
	{
		if (e.getSource().equals(vista.vCalculadora))
		{
			System.exit(0);
		}
	}
	
	@Override public void windowActivated(WindowEvent e){}@Override public void windowClosed(WindowEvent e){}
	@Override public void windowDeactivated(WindowEvent e){}@Override public void windowDeiconified(WindowEvent e){}
	@Override public void windowIconified(WindowEvent e){}@Override public void windowOpened(WindowEvent e){}
	@Override public void keyReleased(KeyEvent e){}
}
