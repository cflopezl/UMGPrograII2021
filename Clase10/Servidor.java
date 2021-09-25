import java.net.*;
import java.io.*;

public class Servidor{
	public static final int PUERTO=4182;
	public static String mensajeServidor;
	public static ServerSocket ss;
	public static Socket cs;
	public static DataOutputStream salidaCliente;
	
	public static void startServer() throws Exception{
		//Crear el socket del servidor y lo dejamos escuchando
		ss = new ServerSocket(PUERTO);
		cs = new Socket();
		System.out.println("(SERVIDOR) Escuchando");
		cs = ss.accept();
		System.out.println("(SERVIDOR) El cliente se conecto exitosamente");
		
		//envio de datos al cliente
		System.out.println("(SERVIDOR) Envio mensaje de bienvenida?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		salidaCliente = new DataOutputStream(cs.getOutputStream());
		salidaCliente.writeUTF("Kiubo, te has conectado exitosamente\n");
		System.out.println("(SERVIDOR) Mensaje Enviado");
		
		//recepcion de datos desde el cliente 
		BufferedReader entrada = 
                new BufferedReader(
                        new InputStreamReader(cs.getInputStream()));
		while(  (mensajeServidor=entrada.readLine())!= null  ){
			System.out.println("		(SERVIDOR) recibi: " + mensajeServidor);
		}
		
		
		//se cierra la comunicacion
		System.out.println("(SERVIDOR) La app finaliza");
		ss.close();
	}
	
	public static void main(String[] args) {
        // TODO code application logic here
        try{
            startServer();
        }catch(Exception e){
            System.out.println("error:"+e.getMessage());
        }
    }
	
	
}