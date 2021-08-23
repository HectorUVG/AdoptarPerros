/**
 * @author Hector de Leon
 * @version 22/08/21
 * 
 *  */  

//*****************************************************************************
//Imports
//*****************************************************************************

//*****************************************************************************
//Clase
//*****************************************************************************
public class Perro {
    //*************************************************************************
    //Declaracion de variables
    //*************************************************************************
    private String nombrePerro;
    private String raza;
    private String edad;
    private String tamanio;
    private String color;
    private String salud;
    //*************************************************************************
    //Constructores
    //*************************************************************************
    /**
     * 
     * @param nombrePerro
     * @param tamanio
     * @param raza
     * @param edad
     * @param color
     * @param salud
     */
    public Perro(String nombrePerro, String tamanio, String raza, String edad, String color, String salud){
        this.nombrePerro = nombrePerro;
        this.tamanio = tamanio;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.salud = salud;
    }
    
    
    /** 
     * @return String
     */
    //*************************************************************************
    //Metodos
    //*************************************************************************
    
    //#####################No estoy seguro si el colocar los nombres de los
    // returns en los getters me va a causar algun error, ya que puede que 
    // devuelva this.raza en lugar del String asignado#####################
    public String getnombrePerro(){
        return nombrePerro;
    }

    
    /** 
     * @return String
     */
    public String getRaza(){
        return raza;
    }

    
    /** 
     * @return String
     */
    public String getEdad(){
        return edad;
    }

    
    /** 
     * @return String
     */
    public String getTamanio(){
        return tamanio;
    }

    
    /** 
     * @return String
     */
    public String getColor(){
        return color;
    }

    
    /** 
     * @return String
     */
    public String getSalud(){
        return salud;
    }
    
    
}

