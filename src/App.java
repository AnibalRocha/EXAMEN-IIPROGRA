import java.util.ArrayList;
import java.util.Scanner;
import pkIntegrante.*;

       
 
public class App extends integrante {

    public static int menu() {
        ArrayList<integrante> lsintegrante = new ArrayList<integrante>();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\n\tNETWORKIN DE DON PACMIC\n");
        System.out.println("1. Agregar Amigo\n2. Agregar amigo de amigo\n3. Presentar amigo \n0. Salir");
        int opcion = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        if (opcion == 1)
            return 1;
        if (opcion == 2)
            return 2;
        if (opcion == 3)
            return 3;
        if (opcion == 0)
            return 0;

        return -1;
    }

    public static void agregarAmigo(ArrayList<integrante> lsintegrante) {
        Scanner sc = new Scanner(System.in);
        int id;
        String nombre;
        int edad;
        String sexo;
        

        System.out.println("\n\n\n\tAGREGAR AMIGO");
        System.out.println("Ingrese el ID de amigo: ");
        id = sc.nextInt();
        //1sc.nextInt();
        System.out.println("Ingrese el nombre de amigo: ");
        nombre = sc.nextLine();
        sc.nextLine();
        System.out.println("Ingrese la edad de amigo: ");
        edad = sc.nextInt();
        //sc.nextInt();
        System.out.println("Ingrese el sexo de la amigo F(femenino), M(masculino): ");
        sexo = sc.nextLine();
        sc.nextLine();
        


        // ingresar amigo
        integrante amig = new integrante(id, nombre, edad, sexo);
        lsintegrante.add(amig);
        System.out.println("\n\n\n" + amig.nombre + " ha sido agredado exitosamente :)");

    }

    public static void showAmigo(ArrayList<integrante> lsintegrante) {
        int numIntegrante = -1;
        System.out.println("\n\n\tListado de user-pets en TINDER-PET\n\n");
        for (integrante amig : lsintegrante) {
            numIntegrante++;
            {
                System.out.println(" #" + numIntegrante);
                System.out.println("\t ID:\t\t" + amig.id);
                System.out.println("\tNombre:\t\t" + amig.nombre);
                System.out.println("\tEdad:\t\t" + amig.edad);
                System.out.println("\tSexo:\t\t" + amig.sexo);
                System.out.println();
            }
        }
    }

    
    public static void main(String[] args) throws Exception {
        // lista de todas las mascotas de la App
        ArrayList<integrante> lsintegrante = new ArrayList<integrante>();
        
        // arreglar aca
        login();
        agregarAmigo(lsintegrante);
        tMenu(lsintegrante);
    }

    

    public static void tMenu(ArrayList<integrante> lsintegrante) {
       
        do {
            switch (menu()) {
                case 1:
                    agregarAmigo(lsintegrante);
                    break;
                case 2:
                    //agregarAmigoD(lsintegrante);
                    System.out.println("lo siento no logre cumplir su expectativa :c");
                    break;
                case 3:
                    showAmigo(lsintegrante);
                    break;
                case 0:
                    System.out.println("Adioooossss....");
                    return;

                default:
                    System.out.println("Opción inválida. Por favor seleccione una opción válida.");
                    break;
            }
        } while (true);
    }
    
    public static void login() {
        //usuarios 
        Scanner sc = new Scanner(System.in);

        String usuario1 = "luis.rocha@epn.edu.ec";
        String contraseña1 = "1756308316";
        String user = "profe";
        String contraseña2 = "1234";
        int intentos= 0;
       
        

        System.out.println("____________________________________________________________");
        System.out.println("____________________NETWORKIN DE -------____________________");
        System.out.println("____________________________________________________________");
        
        
        System.out.println(" Usuario: ");
        String nombre = sc.nextLine();
        System.out.println(" Contraseña: ");
        String Contraseña = sc.nextLine();
        
       
        if(nombre.equals(usuario1)  && Contraseña.equals(contraseña1)){
            System.out.println("Bienvenido Luis ");
            //break;


        }else if(nombre.equals(user) && Contraseña.equals(contraseña2)){ 
            System.out.println("Bienvenido Profesor");    
        
        }else{
            System.out.println("CREDENCIALES INCORRECTAS");
            
        
        }

        //if(contraseña2==Contraseña){
        //}else{
        //    System.out.println("CREDENCIALES INCORRECTAS");
        }
}
