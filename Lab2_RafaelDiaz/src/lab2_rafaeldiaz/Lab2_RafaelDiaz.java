package lab2_rafaeldiaz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Lab2_RafaelDiaz {
static int edad1, resist1,cuenta, edad2, resist2, ID, edad, resist;
static String alias, casta, arma1,apodo, grado, arma2,nombre, rango, arma;
 
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList rusos = new ArrayList();
        ArrayList alemanes = new ArrayList();
        ArrayList alumnos = new ArrayList();
        ArrayList caidos = new ArrayList();
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("*****MENU*****");
            System.out.println("1. Rusos \n2. Alemanes \n3. Alumnos de Progra 2\n4. Simulacion\n5. Salir");
            System.out.println("Ingrese una opcion");
            opcion = sc.nextInt();
            switch (opcion) {
                case (1):
                    System.out.println("1. Agregar\n 2. Modificar\n3. Eliminar");
                    int opcion2 = sc.nextInt();
                    if (opcion2 == 1) {
                        System.out.println("Ingrese su nombre");
                        String nombre = sc.next();
                        System.out.println("Ingrese su ID");
                        int ID = sc.nextInt();
                        System.out.println("Ingrese su edad");
                        int edad = sc.nextInt();
                        if (edad <= 18) {

                        } else {
                            System.out.println("Ingrese su rango");
                            String rango = sc.next();
                            int resist = 8 * edad;
                            System.out.println("Ingrese codigo de arma\n 1. AK-47\n2. Revolver Navant\n3. RPG-7");
                            int a = sc.nextInt();
                            String arma = "";
                            if (a == 1) {
                                arma = "Ak-47";
                            } else if (a == 2) {
                                arma = "Revolver Navant";
                            } else if (a == 3) {
                                arma = "RPG-7";
                            } else {
                                System.out.println("El codigo no es valido");
                            }
                            rusos.add(new Rusos(nombre, rango, arma, ID, edad, resist));
                        }
                    } else if (opcion2 == 2) {
                        for (int i = 0; i < rusos.size(); i++) {
                            System.out.println(i + " " + rusos.get(i));
                        }
                        System.out.println("Que soldado desea modificar? 0,1,2...");
                        int posicion = sc.nextInt();
                        System.out.println("Ingrese su nombre");
                        String nombre = sc.next();
                        System.out.println("Ingrese su ID");
                        int ID = sc.nextInt();
                        System.out.println("Ingrese su edad");
                        int edad = sc.nextInt();
                        if (edad <= 18) {

                        } else {
                            System.out.println("Ingrese su rango");
                            String rango = sc.next();
                            int resist = 8 * edad;
                            System.out.println("Ingrese codigo de arma\n 1. AK-47\n2. Revolver Navant\n3. RPG-7");
                            int a = sc.nextInt();
                            if(a==3&&edad>25){
                            String arma = "";
                            if (a == 1) {
                                arma = "Ak-47";
                            } else if (a == 2) {
                                arma = "Revolver Navant";
                            } else if (a == 3) {
                                arma = "RPG-7";
                            } else {
                                System.out.println("El codigo no es valido");
                            }
                            rusos.set(posicion, (new Rusos(nombre, rango, arma, ID, edad, resist)));
                            }else{
                                System.out.println("No puede usar la RPG-7 si es menor que 25, se le asiganara un Ak-47");
                               String arma="Ak-47";
                               rusos.set(posicion, (new Rusos(nombre, rango, arma, ID, edad, resist)));
                            }
                        }

                    } else if (opcion == 3) {
                        System.out.println("Que soldado desea borrar? 0,1,2...");
                        int posicion = sc.nextInt();
                        rusos.remove(posicion);
                    } else {
                        System.out.println("La opcion no es valida");
                    }

                    break;
                case (2):
                    System.out.println("1. Agregar\n 2. Modificar\n3. Eliminar");
                    int opcion3 = sc.nextInt();
                    if(opcion3==1){
                    System.out.println("Ingrese su nombre");
                    String alias = sc.next();
                    System.out.println("Ingrese su edad");
                    int edad1 = sc.nextInt();
                    System.out.println("Ingrese su rango");
                    String casta = sc.next();
                    int resist1 = 8 * edad1;
                    System.out.println("Ingrese codigo de arma\n 1. Subfusil MP-40\n2. Ametralladora MG42\n3. Pistolas Walther P38");
                    int a2 = sc.nextInt();
                    String arma1 = "";
                    if (a2 == 1) {
                        arma1 = "Subfusil MP-40";
                    } else if (a2 == 2) {
                        arma1 = "Ametralladora MG42";
                    } else if (a2 == 3) {
                        arma1 = "Pistolas Walther P38";
                    } else {
                        System.out.println("El codigo no es valido");
                    }
                    alemanes.add(new Alemanes(alias, casta, arma1, edad1, resist1));
                    }else if(opcion3==2){
                        for (int i = 0; i < alemanes.size(); i++) {
                            System.out.println(i + " " + alemanes.get(i));
                        }
                        System.out.println("Que soldado desea modificar? 0,1,2...");
                        int posicion = sc.nextInt();
                    System.out.println("Ingrese su nombre");
                    String alias = sc.next();
                    System.out.println("Ingrese su edad");
                    int edad1 = sc.nextInt();
                    System.out.println("Ingrese su rango");
                    String casta = sc.next();
                    int resist1 = 8 * edad1;
                    System.out.println("Ingrese codigo de arma\n 1. Subfusil MP-40\n2. Ametralladora MG42\n3. Pistolas Walther P38");
                    int a2 = sc.nextInt();
                    String arma1 = "";
                    if (a2 == 1) {
                        arma1 = "Subfusil MP-40";
                    } else if (a2 == 2) {
                        arma1 = "Ametralladora MG42";
                    } else if (a2 == 3) {
                        arma1 = "Pistolas Walther P38";
                    } else {
                        System.out.println("El codigo no es valido");
                    }
                          alemanes.set(posicion,new Alemanes(alias, casta, arma1, edad1, resist1));  
                    }else if(opcion3==3){
                        System.out.println("Que soldado desea eliminar?");
                        int posicion= sc.nextInt();
                        alemanes.remove(posicion);
                    }else{
                        System.out.println("La opcion no es valida");
                    }
                    break;
                case (3):
                    System.out.println("1. Agregar\n 2. Modificar\n3. Eliminar");
                    int opcion4 = sc.nextInt();
                    if(opcion4==1){
                    System.out.println("Ingrese su nombre");
                    String apodo = sc.next();
                    System.out.println("Ingrese su ID");
                    int cuenta = sc.nextInt();
                    System.out.println("Ingrese su edad");
                    int edad2 = sc.nextInt();
                    if (edad2 <= 16) {
                        System.out.println("Usted es menor de la edad permitida");
                    } else {
                        int resist2 = 8 * edad2;
                        System.out.println("Ingrese su rango");
                        String grado = sc.next();
                        System.out.println("Ingrese codigo de arma\n 1. Discos Duros\n2. Controles de Wii\n3. Laptops");
                        int a3 = sc.nextInt();
                        String arma2 = "";
                        if (a3 == 1) {
                            arma2 = "Discos Duros";
                        } else if (a3 == 2) {
                            arma2 = "Controles de Wii";
                        } else if (a3 == 3) {
                            arma2 = "Laptops";
                        } else {
                            System.out.println("El codigo no es valido");
                        }
                        alumnos.add(new Los_Alumnos_de_Programacion_ll(apodo, grado, arma2, cuenta, edad2, resist2));
                    }
                    }else if(opcion4==2){
                        //////
                        for (int i = 0; i < alumnos.size(); i++) {
                            System.out.println(i + " " + alumnos.get(i));
                        }
                        System.out.println("Que alumno desea modificar? 0,1,2...");
                        int posicion = sc.nextInt();
                        System.out.println("Ingrese su nombre");
                    String apodo = sc.next();
                    System.out.println("Ingrese su ID");
                    int cuenta = sc.nextInt();
                    System.out.println("Ingrese su edad");
                    int edad2 = sc.nextInt();
                    if (edad2 <= 16) {
                        System.out.println("Usted es menor de la edad permitida");
                    } else {
                        int resist2 = 8 * edad2;
                        System.out.println("Ingrese su rango");
                        String grado = sc.next();
                        System.out.println("Ingrese codigo de arma\n 1. Discos Duros\n2. Controles de Wii\n3. Laptops");
                        int a3 = sc.nextInt();
                        String arma2 = "";
                        if (a3 == 1) {
                            arma2 = "Discos Duros";
                        } else if (a3 == 2) {
                            arma2 = "Controles de Wii";
                        } else if (a3 == 3) {
                            arma2 = "Laptops";
                        } else {
                            System.out.println("El codigo no es valido");
                        }
                        alumnos.set(posicion, new Los_Alumnos_de_Programacion_ll(apodo, grado, arma2, cuenta, edad2, resist2));
                    }
                        //////
                    }else if(opcion4==3){
                        System.out.println("Que alumno desea eliminar? 0,1,2...");
                        int posicion= sc.nextInt();
                        alumnos.remove(posicion);
                    }else{
                        
                    }
                    break;
                case (4):
                    int contador = 3;
                    int turno=1;
                    while(contador!=1){
                    
                        if (turno==1) {
                            for (int i = 0; i < rusos.size(); i++) {
                                if (i>=alemanes.size()) {
                                    if (arma.equals("Ak-47")) {
                                        alemanes.set(alemanes.size(),new Alemanes(alias, casta, arma1, edad1, resist1-27) );
                                        if(resist1<=0){
                                            caidos.add(alemanes.get(i));
                                            alemanes.remove(alemanes.size());
                                        }
                                    }else if(arma.equals("Revolver Navant")){
                                        alemanes.set(alemanes.size(),new Alemanes(alias, casta, arma1, edad1, resist1-13) );
                                        if(resist1<=0){
                                            caidos.add(alemanes.get(i));
                                            alemanes.remove(alemanes.size());
                                        }
                                    }else if(arma.equals("RPG-7")){
                                        alemanes.set(alemanes.size(),new Alemanes(alias, casta, arma1, edad1, resist1-57) );
                                        if(resist1<=0){
                                            caidos.add(alemanes.get(i));
                                            alemanes.remove(alemanes.size());
                                        }
                                    }
                                } else {
                                    if (arma.equals("Ak-47")) {
                                        alemanes.set(i,new Alemanes(alias, casta, arma1, edad1, resist1-27) );
                                        if(resist1<=0){
                                            caidos.add(alemanes.get(i));
                                            alemanes.remove(i);
                                        }
                                    }else if(arma.equals("Revolver Navant")){
                                        alemanes.set(i,new Alemanes(alias, casta, arma1, edad1, resist1-13) );
                                        if(resist1<=0){
                                            caidos.add(alemanes.get(i));
                                            alemanes.remove(i);
                                        }
                                    }else if(arma.equals("RPG-7")){
                                        alemanes.set(i,new Alemanes(alias, casta, arma1, edad1, resist1-57) );
                                        if(resist1<=0){
                                            caidos.add(alemanes.get(i));
                                            alemanes.remove(i);
                                        }
                                    }
                                    
                                }
                            }
                            for (int i = 0; i < rusos.size(); i++) {
                                if (i>=alumnos.size()) {
                                    if (arma.equals("Ak-47")) {
                                        alumnos.set(alumnos.size(),new Los_Alumnos_de_Programacion_ll(apodo, grado, arma2, cuenta, edad2, resist2-27) );
                                        if(resist1<=0){
                                            caidos.add(alumnos.get(i));
                                            alumnos.remove(alumnos.size());
                                        }
                                    }else if(arma.equals("Revolver Navant")){
                                        alumnos.set(alumnos.size(),new Los_Alumnos_de_Programacion_ll(apodo, grado, arma2, cuenta, edad2, resist2-13) );
                                        if(resist1<=0){
                                            caidos.add(alumnos.get(i));
                                            alumnos.remove(alumnos.size());
                                        }
                                    }else if(arma.equals("RPG-7")){
                                        alumnos.set(alumnos.size(),new Los_Alumnos_de_Programacion_ll(apodo, grado, arma2, cuenta, edad2, resist2-57) );
                                        if(resist1<=0){
                                            caidos.add(alumnos.get(i));
                                            alumnos.remove(alumnos.size());
                                        }
                                    }
                                } else {
                                    if (arma.equals("Ak-47")) {
                                        alumnos.set(i,new Los_Alumnos_de_Programacion_ll(apodo, grado, arma2, cuenta, edad2, resist2-27) );
                                        if(resist1<=0){
                                            caidos.add(alumnos.get(i));
                                            alumnos.remove(i);
                                        }
                                    }else if(arma.equals("Revolver Navant")){
                                        alumnos.set(i,new Los_Alumnos_de_Programacion_ll(apodo, grado, arma2, cuenta, edad2, resist2-13) );
                                        if(resist1<=0){
                                            caidos.add(alumnos.get(i));
                                            alumnos.remove(i);
                                        }
                                    }else if(arma.equals("RPG-7")){
                                        alumnos.set(i,new Los_Alumnos_de_Programacion_ll(apodo, grado, arma2, cuenta, edad2, resist2-57) );
                                        if(resist1<=0){
                                            caidos.add(alumnos.get(i));
                                            alumnos.remove(i);
                                        }
                                    }
                                }
                            }
                            
                            turno=2;
                        }else if(turno==2){
                            
                            
                            for (int i = 0; i < alemanes.size(); i++) {
                                if (i>=rusos.size()) {
                                    if (arma1.equals("Subfusiles MP 40")) {
                                        rusos.set(rusos.size(),new Rusos(nombre, rango, arma, ID, edad, resist-25) );
                                        if(resist1<=0){
                                            caidos.add(rusos.get(i));
                                            rusos.remove(rusos.size());
                                        }
                                    }else if(arma1.equals("Ametralladora MG42")){
                                        rusos.set(rusos.size(),new Rusos(nombre, rango, arma, ID, edad, resist-32) );
                                        if(resist1<=0){
                                            caidos.add(rusos.get(i));
                                           rusos.remove(rusos.size());
                                        }
                                    }else if(arma1.equals("RPG-7")){
                                        rusos.set(rusos.size(),new Rusos(nombre, rango, arma, ID, edad, resist-11) );
                                        if(resist1<=0){
                                            caidos.add(rusos.get(i));
                                            rusos.remove(rusos.size());
                                        }
                                    }
                                } else {
                                    if (arma1.equals("Subfusiles MP 40")) {
                                        rusos.set(i,new Rusos(nombre, rango, arma, ID, edad, resist-25) );
                                        if(resist1<=0){
                                            caidos.add(rusos.get(i));
                                            rusos.remove(i);
                                        }
                                    }else if(arma1.equals("Ametralladora MG42")){
                                        rusos.set(i,new Rusos(nombre, rango, arma, ID, edad, resist-32) );
                                        if(resist1<=0){
                                            caidos.add(rusos.get(i));
                                           rusos.remove(i);
                                        }
                                    }else if(arma1.equals("RPG-7")){
                                        rusos.set(i,new Rusos(nombre, rango, arma, ID, edad, resist-11) );
                                        if(resist1<=0){
                                            caidos.add(rusos.get(i));
                                            rusos.remove(i);
                                        }
                                    }
                                    
                                }
                            }
                            for (int i = 0; i < alemanes.size(); i++) {
                                if (i>=alumnos.size()) {
                                    if (arma1.equals("Ak-47")) {
                                        alumnos.set(alumnos.size(),new Los_Alumnos_de_Programacion_ll(apodo, grado, arma2, cuenta, edad2, resist2-27) );
                                        if(resist1<=0){
                                            caidos.add(alumnos.get(i));
                                            alumnos.remove(alumnos.size());
                                        }
                                    }else if(arma1.equals("Revolver Navant")){
                                        alumnos.set(alumnos.size(),new Los_Alumnos_de_Programacion_ll(apodo, grado, arma2, cuenta, edad2, resist2-13) );
                                        if(resist1<=0){
                                            caidos.add(alumnos.get(i));
                                            alumnos.remove(alumnos.size());
                                        }
                                    }else if(arma1.equals("RPG-7")){
                                        alumnos.set(alumnos.size(),new Los_Alumnos_de_Programacion_ll(apodo, grado, arma2, cuenta, edad2, resist2-57) );
                                        if(resist1<=0){
                                            caidos.add(alumnos.get(i));
                                            alumnos.remove(alumnos.size());
                                        }
                                    }
                                } else {
                                    if (arma1.equals("Ak-47")) {
                                        alumnos.set(i,new Los_Alumnos_de_Programacion_ll(apodo, grado, arma2, cuenta, edad2, resist2-27) );
                                        if(resist1<=0){
                                            caidos.add(alumnos.get(i));
                                            alumnos.remove(i);
                                        }
                                    }else if(arma1.equals("Revolver Navant")){
                                        alumnos.set(i,new Los_Alumnos_de_Programacion_ll(apodo, grado, arma2, cuenta, edad2, resist2-13) );
                                        if(resist1<=0){
                                            caidos.add(alumnos.get(i));
                                            alumnos.remove(i);
                                        }
                                    }else if(arma1.equals("RPG-7")){
                                        alumnos.set(i,new Los_Alumnos_de_Programacion_ll(apodo, grado, arma2, cuenta, edad2, resist2-57) );
                                        if(resist1<=0){
                                            caidos.add(alumnos.get(i));
                                            alumnos.remove(i);
                                        }
                                    }
                                }
                            }
                            
                            
                            
                            
                            
                            
                            
                            turno=3;
                        }else{
                            
                            
                            turno=1;
                        }
                        
                    }
                    break;
                default:
                    System.out.println(">>>>>Esa no es una opcion<<<<<");
                    break;
            }
        }
    }

}
