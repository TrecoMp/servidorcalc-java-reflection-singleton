package sd.socket.proxy;

import sd.socket.cliente.ClienteTcp;

public class Proxy {
	
	ClienteTcp cliente = new ClienteTcp();
	String msg = "calc:";
	public double add(double n1, double n2) {
		
		msg = msg + "add:" + Double.toString(n1) + ":" + Double.toString(n2); 
		cliente.sendRequest(msg);
		
		return Double.parseDouble(cliente.getResponse());
		
	}
	
	public double sub(double n1, double n2) {
		
		msg = msg + "sub:" + n1 + ":" + n2; 
		cliente.sendRequest(msg);
		
		return Double.parseDouble(cliente.getResponse());
		
	}
	
	public double mult(double n1, double n2) {
		
		msg = msg + "mult:" + n1 + ":" + n2; 
		cliente.sendRequest(msg);
		
		return Double.parseDouble(cliente.getResponse());
		
	}
	
	public double div(double n1, double n2) {
		
		msg = msg + "div:" + n1 + ":" + n2; 
		cliente.sendRequest(msg);
		
		return Double.parseDouble(cliente.getResponse());
		
	}
}
