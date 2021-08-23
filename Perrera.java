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
public class Perrera {
    //*************************************************************************
    //Declaracion de variables
    //*************************************************************************
    
    //aqui se guardan las familias que han adoptado
    private String fam[];
    //aqui se guardan los perros que no fueron adoptados
    private String perroPer[][];
    //con esta lista se comparara en el controlador si el perro es peligroso o no
    private String[] perrosPeligrosos = {"Pit bull terrier", "American Staffordshire terrier", 
    "Tosa Inu", "Dogo argentino", "Dogo Guatemalteco", "Fila brasileño", "Presa canario",
    "Doberman", "Gran perro japones", "Mastin napolitano", "Presa Mallorqui", "Dogo de burdeos",
    "Bullmastiff", "Bull terrier inglés" ,"Bulldog americano", "Rhodesiano", "Rottweiler"};
    //*************************************************************************
    //Constructores
    //*************************************************************************
   
   
    public Perrera(){
        this.fam = fam;
        this.perroPer = perroPer;
        this.perrosPeligrosos = perrosPeligrosos;
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

    
    /** 
     * @param i
     * @param j
     * @return String
     */
    public String getPerroPer(int i, int j){
        return perroPer[i][j];
    }

}
