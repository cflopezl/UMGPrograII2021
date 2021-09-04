import utils.Bitacora;
import utils.Correo;
import utils.VariablesGlobales;
import chain.*;

public class Main {

    private static ManejoErrores manejoError = new ChainStderr(VariablesGlobales.INFO)
                                            .setNext(new ChainLog(VariablesGlobales.MEDIUM)
                                                    .setNext(new ChainEmail(VariablesGlobales.DANGER))
                                            );





    public static void main(String[] args) {

        try{
            //int i = 5/0;
            int arreglo[] = new int[5];
            //arreglo[10]=20;
            Atleta atleta2 = new Atleta("Grijalva");
            atleta2=null;
            atleta2.setNombre("Juan Carlos");

        }catch (ArithmeticException ex){
            manejoError.execute("Ocurrio un error de aritmetica " + ex.getMessage(),
                    VariablesGlobales.INFO);
        }catch(IndexOutOfBoundsException ex){
            manejoError.execute("Ocurrió un error de de desborde de arreglo: " + ex.getMessage(), VariablesGlobales.MEDIUM);
        }catch(NullPointerException ex){
            manejoError.execute("Ocurrió un error de asignación de memoria a una instancia: " + ex.getMessage(), VariablesGlobales.DANGER);
        }

/*
        Bitacora.getInstance().info("Creando instancias");
        Atleta atleta1 = new Atleta("Kevin Cordón");
        Atleta atleta2 = new Atleta("Grijalva");
        Atleta atleta3 = new Atleta("Scarlet");
        Bitacora.getInstance().info("Mostrando valores");
        System.out.println("atleta1 = " + atleta1);
        System.out.println("atleta2 = " + atleta2);
        System.out.println("atleta3 = " + atleta3);*/

        //Correo.sendFromGMail("Saludo", "Prueba de envío de correo electrónico");


    }
}

