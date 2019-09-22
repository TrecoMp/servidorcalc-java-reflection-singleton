package sd.socket.servidor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Despachante {

	public String invoke(String request) {

		String[] data= request.split(":");
		String metodo = data[0];
		String op = data[1];
		String novo_data = data[2]+":"+data[3]; 
				
		Class<?> objRef = null;
		Method method = null;
		String resposta = null;
		try {
			objRef = Class.forName("sd.socket.servidor.Esqueleto");
			System.out.println("Executando: " + metodo);
			method = objRef.getMethod(op, String.class);
			resposta = (String) method.invoke(objRef.newInstance(),novo_data);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
		return resposta;
	}
}
