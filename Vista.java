//*****************************************************************************
//Imports
//*****************************************************************************
import java.util.Scanner;
//*****************************************************************************
//Clase
//*****************************************************************************
public class Vista {
    //*************************************************************************
    //Declaracion de variables
    //*************************************************************************
    private Scanner scan;

    //*************************************************************************
    //Constructores
    //*************************************************************************
    public Vista(){
        scan = new Scanner(System.in);
    }
    //*************************************************************************
    //Metodos
    //*************************************************************************
    
    public void bienvenida(){
        System.out.println("Bienvenido! miembro de la perrera, al programa de adopcion de perros de la perrera.\n");
    }

    public int Menu(){
        int me = 0;
        System.out.print("Que desea hacer?\n" + "1.ingresar una familia\n" + "2.salir\n" );
        me = scan.nextLine();
        return me;
    }

    public void Menuerr(){
        System.out.println("Por favor escriba el numero 1 o 2 dependiendo de su eleccion");
    }

    public String apellido(){
        String ap = "";
        System.out.println("Ingrese el apellido que identifica a la familia qu quiere adoptar:\n");
        ap = scan.nextLine();
        return ap;
    }

    public int numHijos(){
        int nu = 0;
        System.out.println("Tienen hijos? 1.Si 2.No \n");
        nu = scan.nextInt();
        return nu;
    }


    public void siHijos(){
        System.out.println("se le asignaran perros no peligrosos para el cuidado de sus hijos.\n");
    }

    public void noHijos(){
        System.Out.print("Esta familia puede adoptar cualquier perro que se le asigne.\n");
    }

    public void cuatroPerros(){
        System.out.println("Cada familia puede adoptar como maximo 4 perros.\n");
    }

    public int cuantosQuiere(){
        int a = 0;
        System.out.println("Cuantos perros desea adoptar la familia?\n");
        a = scan.nextInt();
        return a;
    }
    
    public void soloCuatro(){
        System.out.println("por favor ingrese un numero no mayor de 4.\n");
    }
    
    public String tamanio(){
        String ta = "";
        System.out.println("Ingrese el tamanio del perro(chiquito, mediano, grande):\n");
        ta = scan.nextLine();
        return ta;
    }

    public String raza(){
        String ra = "";
        System.out.println("Ingrese la raza del perro:\n");
        ra = scan.nextLine();
        return ra;
    }

    public String edadPerro(){
        String ed = "";
        System.out.println("Ingrese la edad aproximadad el perro\n");
        ed = scan.nextLine();
        return ed;
    }

    public String colorPerro(){
        String co = "";
        System.out.println("Ingrese el color del perro:\n");
        co= scan.nextLine();
        return co;
    }

    public String nomPerro(){
        String no = "";
        System.out.println("Ingrese el nombre del perro:\n");
        no = scan.nextLine();
        return no;
    }

    public void puedeAdoptPerro(string nombre){
        System.out.println("La familia " +  nombre + " cumple con los requisitos para adoptar a este perro\n");
    }

    public void seVaAPerrera(string nombre){
        System.out.println("Por la seguridad de los hijos, a familia " +  nombre + " no puede adoptar a este perro\n");
    }


}
