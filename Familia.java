//*****************************************************************************
//Imports
//*****************************************************************************

//*****************************************************************************
//Clase
//*****************************************************************************
public class Familia {
    //*************************************************************************
    //Declaracion de variables
    //*************************************************************************
    /*aqui se guardan los perros y sus caracteristicas. La idea es que en el 
    primer [] se encuentra el eje y y en el segundo el eje x. cada fila sera
    un perro con cada una de sus caracteristicas, y la siguiente fila 
    representa otro perro.
    */
    private String perroFam[][];
    //*************************************************************************
    //Constructores
    //*************************************************************************
    public Familia(){
        this.perroFam = perroFam;
    }
    //*************************************************************************
    //Metodos
    //*************************************************************************
    
    /*Este getter me permite retornar cualquier dato agragado en la matriz de 2 
    dimensiones perroFam
    */
    public String getPerroFam(int i, int j){
        return perroFam[i][j];
    }

}
