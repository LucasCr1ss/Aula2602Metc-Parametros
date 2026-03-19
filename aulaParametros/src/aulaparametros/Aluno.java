/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaparametros;

/**
 *
 * @author Admin
 */
public class Aluno {
    
    public int CalcularMedia (int nota1, int nota2){
        return (nota1 + nota2)/2;
    }
    public int CalcularFaltasRestantes (int totalAulas, int faltas){
        return totalAulas - faltas;
    }
    public int CalcularNotaNecessaria (int mediaDesejada, int notaAtual){
        return mediaDesejada - notaAtual;
    }
    public int CalcularPresença (int aulasAssistidas, int totalAulas){
        return aulasAssistidas * 100 / totalAulas;
    }
}
