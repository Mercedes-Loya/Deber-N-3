/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author MARIA LOYA
 */
public class EjerciciosDeber {
    
    public static void Ejercicio1(){
        JOptionPane.showMessageDialog(null,"Este es el Ejercicio1");
       //Estos dos códigos producen resultados equivalentes
       //1
        for(int i = 1; i <= 100; i++){
            if(i%5==0&& i%25==0)
                JOptionPane.showMessageDialog(null, "el resultado es"+ ( i )+","  );
             //System.out.print(i+",");
        }
         //2
        for(int i = 1; i < 100; i++) {
                if(i%75==0)
           JOptionPane.showMessageDialog(null, "el resultado es"+ ( i )+","  );
              //System.out.print(i+",");
                 }
      }
    public static void Ejercicio2(){
        JOptionPane.showMessageDialog(null,"Este es el Ejercicio2");
       // ¿Cuál es el resultado de este código?
       int total=0;
        for (int i = 0; i <= 5; i++) {
            total += 2;
          }
        JOptionPane.showMessageDialog(null, "el resultado es"+ ( total )  );
        //System.out.print(total);
    }
    public static void Ejercicio3(){
        JOptionPane.showMessageDialog(null,"Este es el Ejercicio3");
        //¿Cuál es el resultado de este código?
        for (int i = 1; i < 6; i+=2) {
            for (int j = 0; j < 3; j++) {
                if(i+j>4)
                    break;
        JOptionPane.showMessageDialog(null, "el resultado es"+ ( i*j )  );
                //System.out.print(i*j);   
            }   
        }
    }
    public static void Ejercicio4(){
         JOptionPane.showMessageDialog(null,"Este es el Ejercicio4");
        //¿Cuál es el resultado de este código?
        int[]primes={1,3,6};
        int suma=0;
        for(int t:primes){
            suma+=t;    
        }
        JOptionPane.showMessageDialog(null, "el resultado es"+ ( suma++ )  );
        //System.out.print(sum++);
    }
    public static void Ejercicio5(){
        JOptionPane.showMessageDialog(null,"Este es el Ejercicio5");
        //Es esto un ciclo infinito
        int x=0;
        do{
         JOptionPane.showMessageDialog(null, "el resultado es"+ ( x )  );
            //System.out.print(x);
            x++;
        }while(x>0);
    }
    public static void Ejercicio6(){
        JOptionPane.showMessageDialog(null,"Este es el Ejercicio6");
       //¿Cuál es el resultado de este código?
       int[]n={0,1,0,-1};
        for (int i = 1; i < n.length; i++) 
           if(n[i]==0&& n[i-1]!=0){
               int x=n[i-1];
               n[i-1]=n[i];
               n[i]=x;   
        }
      JOptionPane.showMessageDialog(null, "el resultado es"+ ( n[2] )  );
        //System.out.println(n[2]);
    }
    public static void menu(){
        int op;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(""
                  + "1.- Ejercicio1\n"
                  + "2.- Ejercicio2\n"
                  + "3.- Ejercicio3\n"
                  + "4.- Ejercicio4\n"
                  + "5.- Ejercicio5\n"
                  + "6.- Salir Ingrese Opcion \n"));
            switch(op){
                case 1:
                    Ejercicio1();
                    break;
                case 2:
                    Ejercicio2();
                    break;
                case 3:
                    Ejercicio3();
                    break;
                case 4:
                    Ejercicio4();
                    break;
                case 5:
                    Ejercicio5();
                    break;
                case 6:
                    Ejercicio6();
                    break;
            }
        }while (op!=6);
    }
}

