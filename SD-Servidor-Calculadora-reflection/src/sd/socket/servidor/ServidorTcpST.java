package sd.socket.servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import sd.socket.calculadora.Calculadora;

public class ServidorTcpST {
	static Despachante despachante = new Despachante();
	static Socket s;
	static Calculadora calculadora = Calculadora.getInstance();
	public static void main(String argv[]) throws Exception {
		
		ServerSocket welcomeSocket = new ServerSocket(7896);

		while (true) {
			s = welcomeSocket.accept();
			String data = getRequest();
		
	    	sendResponse(despachante.invoke(data));
		
		}
	}
	
	
	public static String getRequest() throws IOException {
		DataInputStream in = new DataInputStream(s.getInputStream());
		String n = in.readUTF();
		return n;
	}
	
	public static void sendResponse(String response) throws IOException {
		DataOutputStream out = new DataOutputStream(s.getOutputStream());
		out.writeUTF(response);
	}
}