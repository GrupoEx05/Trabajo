/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab03;

import javax.swing.JOptionPane;

/**
 *
 * @author Yadrick
 */
public class LAB03 {
       
    public static void Salario(){ // AL PONERLA ESTATIC ES PERTENECIENTE  DE LA CLASE Y SE PUEDE ENVOCAR SIN NECESIDAD DE UN CONSTRUTOR
        String nombre;
        float salario;
        float plus = 0;
        float aumento = 0;
        float salarioN = 0;
        
        nombre = JOptionPane.showInputDialog("Digite el nombre del empleado");
        salario = Float.parseFloat(JOptionPane.showInputDialog("Digite el salario del empleado"));
        plus = Float.parseFloat(JOptionPane.showInputDialog("Digite los años trajados"));
        
        aumento = salario * (float)0.01;
        plus *= 10000;
        salarioN = salario + aumento + plus;
        
        JOptionPane.showInputDialog("Empleado: "+nombre+"\nSalario: "+salario+"\nAumento: "+aumento+"\nPlus salarial: "+plus+"\nNuevo Salario: "+salarioN);
    }
    public static void Beca(String nombre,int creditos,float promedio,String grado){
        if(creditos >= 12){
            if(creditos >= 85 && grado == "Bachillerato"){
                JOptionPane.showMessageDialog(null, nombre+" Usted si cumple los requisitos para la beca || Bachillerato");
            }
                else if(creditos >= 90 && grado == "Licenciatura"){
                 JOptionPane.showMessageDialog(null, nombre+" Usted si cumple los requisitos para la beca || Licenciatura");
                }
                else
                   JOptionPane.showMessageDialog(null, nombre+" Usted no cumple los requisitos para la beca"); 
        }
        else
        JOptionPane.showMessageDialog(null, nombre+" Usted no cumple los requisitos para la beca");
    }
    public static float Promedio(){
        char seguir = 's';
        float promedio, calculoP = 0;
        String nombre;
        int cant = 0;
        while(seguir == 's' || seguir == 'S'){
            cant = + 1;
            nombre = JOptionPane.showInputDialog("Digite el nombre del Alumno:");
            promedio = Float.parseFloat(JOptionPane.showInputDialog("Digite el promedio"));
            
            calculoP = (calculoP + promedio)/cant;
            seguir = JOptionPane.showInputDialog("Desea seguir").charAt(0);
        }
        return calculoP;
      
    }
    public static void main(String[] args) {
         //Salario();
        // Beca("Yadrick",17,(float)95.3,"Bachillerato");
           System.out.println("El promedio es:"+Promedio());
    }
}
