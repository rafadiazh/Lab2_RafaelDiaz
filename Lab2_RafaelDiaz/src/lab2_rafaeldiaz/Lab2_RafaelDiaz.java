
package lab2_rafaeldiaz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Lab2_RafaelDiaz {
static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList rusos = new ArrayList();
        ArrayList alemanes = new ArrayList();
        ArrayList alumnos = new ArrayList();
        int opcion = 0;
        while(opcion!=5){
            System.out.println("*****MENU*****");
            System.out.println("1. Rusos \n2. Alemanes \n3. Alumnos de Progra 2\n4. Simulacion\n5. Salir");
            System.out.println("Ingrese una opcion");
            opcion = sc.nextInt();
            switch(opcion){
                case(1):
                    System.out.println("Ingrese su nombre");
                    String nombre = sc.next();
                    System.out.println("Ingrese su ID");
                    int ID= sc.nextInt();
                    System.out.println("Ingrese su edad");
                    int edad= sc.nextInt();
                    System.out.println("Ingrese su rango");
                    String rango = sc.next();
                    int resist= 8*edad;
                    System.out.println("Ingrese codigo de arma\n 1. AK-47\n2. Revolver Navant\n3. RPG-7");
                    int a=sc.nextInt();
                    String arma="";
                    if (a==1) {
                         arma="Ak-47";
                    }else if(a==2){
                         arma="Revolver Navant";
                    }else if(a==3){
                         arma="RPG-7";
                    }else{
                        System.out.println("El codigo no es valido");
                    }
                    rusos.add(new Rusos(nombre,rango,arma, ID, edad, resist));
                
                    break;
                case(2):
                    System.out.println("Ingrese su nombre");
                    String alias = sc.next();
                    System.out.println("Ingrese su edad");
                    int edad1= sc.nextInt();
                    System.out.println("Ingrese su rango");
                    String casta = sc.next();
                    int resist1= 8*edad1;
                    System.out.println("Ingrese codigo de arma\n 1. Subfusil MP-40\n2. Ametralladora MG42\n3. Pistolas Walther P38");
                    int a2=sc.nextInt();
                    String arma1="";
                    if (a2==1) {
                         arma1="Subfusil MP-40";
                    }else if(a2==2){
                         arma1="Ametralladora MG42";
                    }else if(a2==3){
                         arma1="Pistolas Walther P38";
                    }else{
                        System.out.println("El codigo no es valido");
                    }
                    alemanes.add(new Alemanes(alias,casta,arma1, edad1, resist1));
                    break;
                case(3):
                    System.out.println("Ingrese su nombre");
                    String apodo = sc.next();
                    System.out.println("Ingrese su ID");
                    int cuenta= sc.nextInt();
                    System.out.println("Ingrese su edad");
                    int edad2= sc.nextInt();
                    int resist2= 8*edad2;
                    System.out.println("Ingrese su rango");
                    String grado = sc.next();
                    System.out.println("Ingrese codigo de arma\n 1. Discos Duros\n2. Controles de Wii\n3. Laptops");
                    int a3=sc.nextInt();
                    String arma2="";
                    if (a3==1) {
                         arma2="Discos Duros";
                    }else if(a3==2){
                         arma2="Controles de Wii";
                    }else if(a3==3){
                         arma2="Laptops";
                    }else{
                        System.out.println("El codigo no es valido");
                    }
                    alumnos.add(new Los_Alumnos_de_Programacion_ll(apodo,grado,arma2, cuenta, edad2, resist2));
                    break;
                case(4):
                    
                    break;
                default:
                    System.out.println(">>>>>Esa no es una opcion<<<<<");
                    break;
            }
        }
    }
    
}
