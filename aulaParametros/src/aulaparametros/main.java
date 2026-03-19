/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaparametros;

/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        
        System.out.println("A media e: " + a1.CalcularMedia(5, 10));
        System.out.println("Faltas restantes: " + a1.CalcularFaltasRestantes(100, 40));
        System.out.println("Nota necessaria; " + a1.CalcularNotaNecessaria(7, 3));
        System.out.println("Presenca (%): " + a1.CalcularPresença(70, 100));
        
        
        
        
    }
    
}
