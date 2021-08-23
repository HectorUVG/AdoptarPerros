/**
 * @author Hector de Leon
 * @version 22/08/21
 * 
 *  */  

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

    
    /** 
     * @return int
     */
    public int menuOpciones(){
        int me = 0;
        System.out.print("Que desea hacer?\n" + "1.ingresar una familia\n" + "2.salir\n" );
        me = scan.nextInt();
        return me;
    }

    public void menuerr(){
        System.out.println("Por favor escriba el numero 1 o 2 dependiendo de su eleccion");
    }

    
    /** 
     * @return String
     */
    public String apellido(){
        String ap = "";
        System.out.println("Ingrese el apellido que identifica a la familia que quiere adoptar:\n");
        ap = scan.nextLine();
        return ap;
    }

    
    /** 
     * @return int
     */
    public int numHijos(){
        int nu = 0;
        System.out.println("Tienen hijos? 1.Si 2.No \n");
        nu = scan.nextInt();
        return nu;
    }


    
    /** 
     * @return int
     */
    public int siHijos(){
        int si = 0;
        System.out.println("que edad(anios) tiene el/la menor?\n");
        si=scan.nextInt();
        return si;
    }

    public void noHijos(){
        System.out.print("Esta familia puede adoptar cualquier perro que se le asigne.\n");
    }

    public void cuatroPerros(){
        System.out.println("Cada familia puede adoptar como maximo 4 perros.\n");
    }

    
    /** 
     * @return int
     */
    public int cuantosQuiere(){
        int a = 0;
        System.out.println("Cuantos perros desea adoptar la familia?\n");
        a = scan.nextInt();
        return a;
    }
    
    public void soloCuatro(){
        System.out.println("por favor ingrese un numero no mayor de 4.\n");
    }

    
    /** 
     * @param numero
     */
    public void numPe(int numero){
        System.out.println("Perro numero " + numero);

    }

    
    
    /** 
     * @return String
     */
    public String tamanio(){
        String ta = "";
        System.out.println("Ingrese el tamanio del perro(chiquito, mediano, grande):\n");
        ta = scan.nextLine();
        return ta;
    }

    
    /** 
     * @return String
     */
    public String raza(){
        String ra = "";
        System.out.println("Ingrese la raza del perro:\n");
        ra = scan.nextLine();
        return ra;
    }

    
    /** 
     * @return String
     */
    public String edadPerro(){
        String ed = "";
        System.out.println("Ingrese la edad aproximadad el perro\n");
        ed = scan.nextLine();
        return ed;
    }

    
    /** 
     * @return String
     */
    public String colorPerro(){
        String co = "";
        System.out.println("Ingrese el color del perro:\n");
        co= scan.nextLine();
        return co;
    }

    
    /** 
     * @return String
     */
    public String salud(){
        String co = "";
        System.out.println("Ingrese el estado de salud(0 a 100) del perro:\n");
        co= scan.nextLine();
        return co;
    }

    
    /** 
     * @return String
     */
    public String nomPerro(){
        String no = "";
        System.out.println("Ingrese el nombre del perro:\n");
        no = scan.nextLine();
        return no;
    }

    
    /** 
     * @param nombre
     */
    public void puedeAdoptPerro(String nombre){
        System.out.println("La familia " +  nombre + " cumple con los requisitos para adoptar a este perro\n");
    }

    
    /** 
     * @param nombre
     */
    public void seVaAPerrera(String nombre){
        System.out.println("Por la seguridad de los hijos, a familia " +  nombre + " no puede adoptar a este perro\n");
    }

    public void fin(){
        System.out.println("Tenga un buen dia \n");
    }


}
