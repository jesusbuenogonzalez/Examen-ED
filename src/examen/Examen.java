/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author DAM105
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("Elija una opcion:\n1-Cambio de unidades horas a segundos\n2-Cambio de unidades kilometros a metros\n3-Conversion de km/h a m/s\n4-Salir");
            opc=teclado.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Horas?: ");
                    double horas=teclado.nextDouble();
                    System.out.println(horas+" horas son "+horas*3600+" segundos");
                    break;
                case 2:
                    System.out.println("Kilometros?: ");
                    double kilometros=teclado.nextDouble();
                    System.out.println(kilometros+" kilometros son "+kilometros*1000+" metros");
                    break;
                case 3:
                    System.out.println("Km/h?:");
                    double kmh=teclado.nextDouble();
                    System.out.println(kmh+" km/h son "+kmh/3.6+" m/s");
                default: 
                    System.out.println("Saliste delprograma");
            }
        }while(opc!=4);
    }
    
}
