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
    public Perro(String nombrePerro, String raza, String edad){
        this.nombrePerro = nombrePerro;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.color = color;
        this.salud = salud;
    }
    
    //*************************************************************************
    //Metodos
    //*************************************************************************
    
    //#####################No estoy seguro si el colocar los nombres de los
    // returns en los getters me va a causar algun error, ya que puede que 
    // devuelva this.raza en lugar del String asignado#####################
    public String getnombrePerro(){
        return nombrePerro;
    }

    public String getRaza(){
        return raza;
    }

    public String getEdad(){
        return edad;
    }

    public String getTamanio(){
        return tamanio;
    }

    public String getColor(){
        return color;
    }

    public String getSalud(){
        return salud;
    }
    
    
}

