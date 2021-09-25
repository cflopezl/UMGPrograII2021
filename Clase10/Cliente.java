import java.io.*;
import java.net.*;

public class Cliente{
	public static final int PUERTO = 4182;
	public static final String HOST = "localhost";
	public static Socket cs;
	public static DataOutputStream salidaServidor;
	
	public static void startClient(){
		
		try{
			cs = new Socket(HOST, PUERTO);
			System.out.println("(cliente) Ya fue realizada la conexion");
			
			//leer mensaje del servidor
			BufferedReader entrada = new BufferedReader(
				new InputStreamReader(cs.getInputStream()));
			String mensajeRecibido = entrada.readLine();
			System.out.println("		(cliente) Recibimos: " 
								+ mensajeRecibido);
			
			//escribir mensajes al servidor
			System.out.println("(cliente) Envio informacion al servidor?");
			BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
			br.readLine();
		
			salidaServidor = new DataOutputStream(cs.getOutputStream());
			for(int i=0; i<10 ; i++)
				salidaServidor.writeUTF("bien gracias " +i+ "\n");			
			
			cs.close();
			System.out.println("(cliente) La app finalizo");
			
		}catch(Exception ex){
			System.out.println("Error: " + ex.getMessage());
		}
	}
	
	public static void main(String[] args){
			startClient();
	}	
	
	
}