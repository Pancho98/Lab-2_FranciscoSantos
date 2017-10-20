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
        ArrayList<String> secciones = new ArrayList();
        ArrayList<String> seccionesAl = new ArrayList();
        while (resp.equals("s") || resp.equals("S")) {
            System.out.println("1. Administracion\n"
                    + "2. Log in\n"
                    + "3. Matricula\n"
                    + "4. Salir");
            int opc = sc.nextInt();

            switch (opc) {
                case 1:
                    String resp2 = "s";
                    while (resp2.equals("s") || resp2.equals("S")) {
                        System.out.println("a. Crear Clase\n"
                                + "b. Resgistrar Maestro\n"
                                + "c. Salir");
                        String opc2 = sc.next();

                        switch (opc2) {
                            case "a":
                                System.out.println("Ingrese nombre de la Clase");
                                String nombrec = sc.next();
                                System.out.println("Ingresar seccion de la clase");
                                String seccion = sc.next();
                                System.out.println("Ingresar cantidad maxima de alumnos");
                                int max = sc.nextInt();
                                System.out.println("Ingrese nombre del docente que impartira la clase");
                                String maestro = sc.next();
                                String mae = null;
                                for (int i = 0; i < maestros.size(); i++) {
                                    if (maestros.get(i).getNombre().equals(maestro)) {
                                        mae = maestro;
                                    }
                                }
                                System.out.println("Ingresar Unidades Valorativas");
                                int uv = sc.nextInt();
                                System.out.println("Ingrese precio de la clase ");
                                int precio = sc.nextInt();
                                Clase cl = new Clase(nombrec, seccion, max, mae, uv, precio);
                                clases.add(cl);
                                secciones.add(resp);
                                break;
                            case "b":
                                System.out.println("Ingrese nombre del docente");
                                String nombrem = sc.next();
                                System.out.println("Ingresar su titulo");
                                String titulo = sc.next();
                                System.out.println("Ingresar Maestria");
                                String meastria = sc.next();
                                System.out.println("Ingrese sueldo del docente");
                                int salario = sc.nextInt();
                                System.out.println("Ingresar nombre de Usuario");
                                String user = sc.next();
                                System.out.println("Ingrese la contraseña ");
                                String contra = sc.next();
                                Maestro maes = new Maestro(nombrem, titulo, meastria, salario, user, contra);
                                maestros.add(maes);

                                break;

                            case "c":
                                resp2 = "n";
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ingrese nombre del alumno");
                    String nombrea = sc.next();
                    System.out.println("Ingresar numero de cuenta");
                    int cuenta = sc.nextInt();
                    System.out.println("Ingresar carrera");
                    String carrera = sc.next();
                    System.out.println("Ingrese edad");
                    int edad = sc.nextInt();
                    System.out.println("Ingresar dinero disponible");
                    int dinero = sc.nextInt();
                    System.out.println("Ingrese el usuario ");
                    String user2 = sc.next();
                    System.out.println("Ingrese Contraseña");
                    String contra2 = sc.next();
                    Alumno al = new Alumno(nombrea, cuenta, carrera, edad, dinero, user2, contra2);
                    alumnos.add(al);
                    for (int i = 0; i < clases.size(); i++) {
                        System.out.println(i + "-" + clases.get(i).toString());
                    }
                    String des = "s";
                    for (int i = 0; i < alumnos.size(); i++) {
                        if (alumnos.get(i).getNombre().equals(nombrea)) {
                            while (des.equals("s")) {
                                System.out.println("Ingrese seccion de la clase");
                                String secc = sc.next();
                                if (secciones.get(i).equals(secc)) {
                                    seccionesAl.add(secc);
                                }
                                System.out.println("Desea Matricular otra [s/n]");
                                des=sc.next();
                            }
                        }
                        alumnos.get(i).setLista(seccionesAl);
                    }

                    break;
                case 3:
                    String resp3 = "s";
                    while (resp3.equals("s") || resp3.equals("S")) {
                        System.out.println("a. Log in Maestro\n"
                                + "b. Log in Alumno\n"
                                + "c. Salir");
                        String opc3 = sc.next();
                        switch (opc3) {
                            case "a":
                                System.out.println("Ingrese Usuario");
                                String us1 = sc.next();
                                System.out.println("Ingrese Contraseña");
                                String contra01 = sc.next();
                                for (int i = 0; i < maestros.size(); i++) {
                                    if (maestros.get(i).getUsuario().equals(us1) && maestros.get(i).getContraseña().equals(contra01)) {
                                        System.out.println("a. Modificar datos\n"
                                                + "b. Listar ");
                                        String opcm = sc.next();
                                        switch (opcm) {
                                            case "a":
                                                System.out.println("Ingrese nombre del docente");
                                                String nombrem = sc.next();
                                                System.out.println("Ingresar su titulo");
                                                String titulo = sc.next();
                                                System.out.println("Ingresar Maestria");
                                                String meastria = sc.next();
                                                System.out.println("Ingrese sueldo del docente");
                                                int salario = sc.nextInt();
                                                System.out.println("Ingresar nombre de Usuario");
                                                String user = sc.next();
                                                System.out.println("Ingrese la contraseña ");
                                                String contra = sc.next();
                                                maestros.get(i).setNombre(nombrem);
                                                maestros.get(i).setTitulo(titulo);
                                                maestros.get(i).setMaestria(meastria);
                                                maestros.get(i).setSalario(salario);
                                                maestros.get(i).setUsuario(user);
                                                maestros.get(i).setContraseña(contra);

                                                break;
                                            case "b":

                                                break;
                                        }
                                    } else {
                                        System.out.println("No existe el usuario");
                                    }
                                }
                                break;
                            case "b":
                                System.out.println("Ingrese Usuario");
                                String us2 = sc.next();
                                System.out.println("Ingrese Contraseña");
                                String contra02 = sc.next();
                                for (Alumno t : alumnos) {
                                    if (t.getUsuario().equals(us2) && t.getContraseña().equals(contra02)) {

                                    }
                                }
                                break;
                            case "c":
                                resp3 = "n";
                                break;

                        }
                    }
                    break;
                case 4:
                    resp = "n";
                    break;
            }
        }
    }

}
