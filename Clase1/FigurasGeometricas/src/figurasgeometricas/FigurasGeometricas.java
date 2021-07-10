/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author chris
 */
public class FigurasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO crear la información de un cuadrado y calcular el área
        Cuadro cuadrado1 = new Cuadro(1, 5);
        cuadrado1.calcularArea();

        Cuadro cuadrado2 = new Cuadro(2, 3);
        cuadrado2.calcularArea();
                
    }    
    
}
