/*
 Diseñe un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] /altura2 [m]) 
 e indique el estado en el que se encuentra esa persona en función del valor de IMC:
Valor de IMC Diagnóstico
< 16 Criterio de ingreso en hospital
de 16 a 17 infra peso
de 17 a 18 bajo peso
de 18 a 25 peso normal (saludable)
de 25 a 30 sobrepeso (obesidad de grado I)
de 30 a 35 sobrepeso crónico (obesidad de grado II)
 */
package javaapplication1;
import javax.swing.JOptionPane;

public class Ejercicio11 {

    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "**PROGRAMA PARA CALCULAR EL IMC DE UNA PERSONA**");
      
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso: "));
        double estatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su estatura: "));
        
        double imc = Math.round(peso / (estatura * estatura)) ;
        
        if(imc < 16){
            JOptionPane.showMessageDialog(null,"Su IMC es de " + imc + ", debe ser remitido al hospital");
        }
        else if(imc >= 16 && imc < 17){
            JOptionPane.showMessageDialog(null,"Su IMC es de " + imc + ", tiene infra peso");
        }
        else if(imc >= 17 && imc <18){
            JOptionPane.showMessageDialog(null,"Su IMC es de " + imc + ", está bajo de peso");
        }
        else if(imc >= 18 && imc < 25){
            JOptionPane.showMessageDialog(null,"Su IMC es de " + imc + ", tiene un peso normal (saludable)");
        }
        else if(imc >= 25 && imc < 30){
            JOptionPane.showMessageDialog(null,"Su IMC es de " + imc + ", tiene sobrepeso (obesidad grado I)");
        }
        else if(imc >= 30){
            JOptionPane.showMessageDialog(null,"Su IMC es de " + imc + ", tiene sobrepeso crónico (obesidad grado II)");
        }
        
    }
    
}
