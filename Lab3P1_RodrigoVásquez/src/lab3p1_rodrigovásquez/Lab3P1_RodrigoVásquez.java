
package lab3p1_rodrigovásquez;

import java.util.Scanner;

public class Lab3P1_RodrigoVásquez {

    public static void main(String[] args) {
        Scanner undead = new Scanner(System.in); 
        int ejercicio = 0;
        do{
            System.out.println("1. Cadena repetida");
            System.out.println("2. Sumatoria");
            System.out.println("3. Reloj");
            System.out.print("¿A cuál ejercicio desea ingresar? ");
            ejercicio = undead.nextInt(); 
            switch(ejercicio){
                
                case 1: System.out.print("Ingrese una cadena: ");
                        String cadena = undead.next(); 
                        int largo = cadena.length(); 
                        String acum1 = "";
                        int acum2 = 0;
                        int index = cadena.indexOf(".", 0); 
                        for(int i = 0; i < index; i++){
                            acum1 += cadena.charAt(i); 
                            
                        }
                        System.out.println(acum1);
                        break;

                     /*   
                case 2: System.out.print("Ingrese un número: ");
                        int k = undead.nextInt(); 
                        break;
                      
                
                case 3: System.out.print("Ingrese un número entero positivo impar: ");
                        int numReloj = undead.nextInt(); 
                        if(numReloj%2!=0){
                            int altura = (numReloj * 2) - 1;
                            int resta = altura - 2;
                            if(numReloj>3){
                                for(int i = 1; i <= altura; i++){
                                    for(int j = 1; j <= numReloj; j++){
                                        System.out.print("*");
                                        for(int k = (altura - altura) + 2; k < altura; k+=(altura-3)){
                                            System.out.print("*");
                                        }
                                        System.out.println("");
                                    }
                                }
                            }   
                        }else{
                            System.out.println("No es un número entero positivo impar");
                        }*/
           }
       }while(ejercicio==1&&ejercicio==2&&ejercicio==3);
    }
    
}
