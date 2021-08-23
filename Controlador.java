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
public class Controlador {
    public static void main(String[] args){
    

        Vista vis = new Vista();//genera nueva vista
        //bienvenida al usuario
        vis.bienvenida();
        // variable opcion para el menu de opciones
        int opc = 0;
        //bucle while para que no pare el programa a menos que el usuario quiera
        while(opc != 2){
            opc = vis.menuOpciones();

            switch (opc) {
                case 1:
                //si escoge 1, el programa continua
                    
                    vis.apellido();
                    //vis.numHijos();
                    switch (vis.numHijos()) {
                        //si no tiene  hijos entonces pueden adoptar cualquier perro
                        case 1:
                            vis.siHijos();//se pide edad del menor para saber el tamanio
                            //que pueden adoptar
                            vis.cuatroPerros();
                            vis.cuantosQuiere();
                            if (vis.cuantosQuiere() > 4){
                                vis.soloCuatro();
                            }
                            else{
                                //aqui comienza desde que escogio cuantos perros quiere
                                //
                            }
                            break;

                        case 2:
                            //Si no tiene hijos, continua aqui
                            vis.noHijos();
                            vis.cuatroPerros();
                            int cuantos = vis.cuantosQuiere();
                            if(cuantos > 4){//progra defensiva
                                vis.soloCuatro();
                            }
                            else{
                                for (int i = 0; i < cuantos; i++){
                                    int j = i + 1;
                                    vis.numPe(j);
                                    vis.nomPerro();
                                    vis.tamanio();
                                    vis.raza();
                                    vis.edadPerro();
                                    vis.colorPerro();
                                    vis.salud();
                                    
                                    Perro per = new Perro(vis.nomPerro(), vis.tamanio(), vis.raza(), vis.edadPerro(), vis.colorPerro(),  vis.salud());
                                    Familia fam = new Familia(i, vis.nomPerro(), vis.tamanio(), vis.raza(), vis.edadPerro(), vis.colorPerro(),  vis.salud() );
                                }    
                            }
                            break;
                    
                        default:
                            break;
                    }
                    
                    break;
                   
                case 2:
                //no se si me va a imprimir esto ya que es el limite del bucle while
                    vis.fin();
                    break;
            
                default:
                    vis.menuerr();
                    break;
            }


        }

    }
    
}
