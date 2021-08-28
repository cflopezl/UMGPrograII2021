import utils.Bitacora;

public class Main {
    public static void main(String[] args) {

        try{
            int i = 5/0;
        }catch (Exception ex){
            Bitacora.getInstance().error("Ocurrio un error en la clase Main, metodo main:"+ex.getMessage());
        }


        Bitacora.getInstance().info("Creando instancias");
        Atleta atleta1 = new Atleta("Kevin Cordón");
        Atleta atleta2 = new Atleta("Grijalva");
        Atleta atleta3 = new Atleta("Scarlet");
        Bitacora.getInstance().info("Mostrando valores");
        System.out.println("atleta1 = " + atleta1);
        System.out.println("atleta2 = " + atleta2);
        System.out.println("atleta3 = " + atleta3);


    }
}

