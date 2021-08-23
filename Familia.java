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
public class Familia {
    //*************************************************************************
    //Declaracion de variables
    //*************************************************************************
    /*aqui se guardan los perros y sus caracteristicas. La idea es que en el 
    primer [] se encuentra el eje y y en el segundo el eje x. cada fila(x) sera
    un perro con cada una de sus caracteristicas, y la siguiente fila 
    representa otro perro.
    */
    private String perroFam[][];
    //*************************************************************************
    //Constructores
    //*************************************************************************

    //con este constructor es posible colocar a cada perro con sus caracteristicas dentro
    //de un arreglo
    /**
     * 
     * @param y
     * @param nombre
     * @param tamanio
     * @param raza
     * @param edad
     * @param color
     * @param salud
     */
    public Familia(int y, String nombre, String tamanio, String raza, String edad, String color, String salud){
        this.perroFam[0][y] = nombre;
        this.perroFam[1][y] = tamanio;
        this.perroFam[2][y] = raza;
        this.perroFam[3][y] = edad;
        this.perroFam[4][y] = color;
        this.perroFam[5][y] = salud;

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
