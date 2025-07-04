package es.amr.calculadora;

public class Modelo
{
	public String operacionPendiente(char operacion, String valor, String valorResultado, double numero1, double numero2, double resultado) 
	{
		try 
		{
			switch(operacion) 
			{
				case '+':
					numero1 = Double.parseDouble(valor);
					numero2 = Double.parseDouble(valorResultado);
					resultado = sumar(numero2, numero1);
					valorResultado = resultado+"";
					break;
				case '-':
					numero1 = Double.parseDouble(valor);
					numero2 = Double.parseDouble(valorResultado);
					resultado = restar(numero2, numero1);
					valorResultado = resultado + "";
					break;
				case '*':
					numero1 = Double.parseDouble(valor);
					numero2 = Double.parseDouble(valorResultado);
					resultado = multiplicar(numero2, numero1);
					valorResultado = resultado+"";
					break;
				case '/':
					numero1 = Double.parseDouble(valor);
					numero2 = Double.parseDouble(valorResultado);
					if(numero1 > 0) 
					{
						resultado = dividir(numero2, numero1);
						valorResultado = resultado+"";
					}
					else 
					{
						valorResultado = "No se puede dividir por 0. Pulsa C";
					}
					break;
			}
		}
		catch(NumberFormatException e) {}
			
		return valorResultado;
	}
	
	public double sumar(double num1, double num2) 
	{
		return num1 + num2;
	}
	
	public double restar(double num1, double num2) 
	{
		return num1 - num2;
	}
	
	public double multiplicar(double num1, double num2) 
	{
		return num1 * num2;
	}
	
	public double dividir(double num1, double num2) 
	{
		return num1 / num2;
	}
}
