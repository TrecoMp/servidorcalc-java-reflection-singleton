package sd.socket.servidor;

import sd.socket.calculadora.Calculadora;

public class Esqueleto {

	Calculadora calculadora = Calculadora.getInstance();
	
	public String add(String msg) {
		String[] n = msg.split(":");
		double n1 = Double.parseDouble(n[0]);
		double n2 = Double.parseDouble(n[1]);
		
		return Double.toString(calculadora.add(n1, n2));
	}
	
	public String sub(String msg) {
		String[] n = msg.split(":");
		double n1 = Double.parseDouble(n[0]);
		double n2 = Double.parseDouble(n[1]);
		
		return Double.toString(calculadora.sub(n1, n2));
	}
	
	public String mult(String msg) {
		String[] n = msg.split(":");
		double n1 = Double.parseDouble(n[0]);
		double n2 = Double.parseDouble(n[1]);
		
		return Double.toString(calculadora.mult(n1, n2));
	}
	
	public String div(String msg) {
		String[] n = msg.split(":");
		double n1 = Double.parseDouble(n[0]);
		double n2 = Double.parseDouble(n[1]);
		
		return Double.toString(calculadora.div(n1, n2));
	}
}
