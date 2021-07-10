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
public class Cuadro {
    public int lado;
    public int no;

    public Cuadro(int no,int lado) {
        this.lado = lado;
        this.no = no;
    }
    
    public int calcularArea(){
        int area = lado * lado;
        System.out.println("Área del cuadrado: " + no + ", es: " + area);
        return area;
    }
        
    
}
