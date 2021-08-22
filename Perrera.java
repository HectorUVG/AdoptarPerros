//*****************************************************************************
//Imports
//*****************************************************************************

//*****************************************************************************
//Clase
//*****************************************************************************
public class Perrera {
    //*************************************************************************
    //Declaracion de variables
    //*************************************************************************
    
    //aqui se guardan las familias que han adoptado
    private String fam[];
    //aqui se guardan los perros que no fueron adoptados
    private String perroPer[][];
    //*************************************************************************
    //Constructores
    //*************************************************************************
    public Perrera(){
        this.fam = fam;
        this.perroPer = perroPer;
    }
    //*************************************************************************
    //Metodos
    //*************************************************************************
    
    /*
    retornan datos guardados en los arreglos fam y perroPer, respectivamente
    */
    public String getFam(int i){
        return fam[i];
    }

    public String getPerroPer(int i, int j){
        return perroPer[i][j];
    }

}
