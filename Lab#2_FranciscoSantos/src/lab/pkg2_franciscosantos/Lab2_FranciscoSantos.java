
package lab.pkg2_franciscosantos;

import java.util.ArrayList;
import java.util.Scanner;


public class Lab2_FranciscoSantos {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        String resp = "s";
        ArrayList<Maestro> maestros = new ArrayList();
        ArrayList<Alumno> alumnos = new ArrayList();
        ArrayList<Clase> clases = new ArrayList();
        ArrayList<String>secciones= new ArrayList();
        while (resp.equals("s") || resp.equals("S")) {            
            System.out.println("1. Administracion\n"
                    + "2. Matricula\n"
                    + "3. Log in\n"
                    + "4. Salir");
            int opc = sc.nextInt();
            
            switch(opc){
                case 1:
                    String resp2="s";
                    while (resp.equals("s") || resp.equals("S")) { 
                    System.out.println("a. Crear Clase\n"
                            + "b. Resgistrar Maestro\n+"
                            + "c. Registar Alumno\n"
                            + "d. Salir");
                    String opc2=sc.next();
                    
                    switch(opc2){
                        case "a":
                            System.out.println("Ingrese nombre de la Clase");
                            String nombrec=sc.next();
                            System.out.println("Ingresar seccion de la clase");
                            String seccion=sc.next();
                            System.out.println("Ingresar cantidad maxima de alumnos");
                            int max=sc.nextInt();
                            System.out.println("Ingrese nombre del docente que impartira la clase");
                            String maestro=sc.next();
                            System.out.println("Ingresar Unidades Valorativas");
                            int uv=sc.nextInt();
                            System.out.println("Ingrese precio de la clase ");
                            int precio=sc.nextInt();
                            Clase cl=new Clase(nombrec, seccion, max, maestro, uv, precio);
                            clases.add(cl);
                            secciones.add(seccion);
                            break;
                        case "b":
                            System.out.println("Ingrese nombre del docente");
                            String nombrem=sc.next();
                            System.out.println("Ingresar su titulo");
                            String titulo=sc.next();
                            System.out.println("Ingresar Maestria");
                            String meastria=sc.next();
                            System.out.println("Ingrese sueldo del docente");
                            int salario=sc.nextInt();
                            System.out.println("Ingresar nombre de Usuario");
                            String user=sc.next();
                            System.out.println("Ingrese la contraseña ");
                            String contra=sc.next();
                            Maestro mae = new Maestro(nombrem, titulo, meastria, salario, user, contra);
                            maestros.add(mae);
                            break;
                        case "c":
                            
                            break;
                        case "d":
                            resp2="n";
                            break;
                        
                    }
                    }
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    resp="n";
                    break;
            }
        }
    }
    
}
