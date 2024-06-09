
package SopaDeLetras;


/**
 * Representa un arco en un grafo.
 * Contiene la informaci&oacute;n sobre el destino del arco y un apuntador al
 * siguiente arco en la lista de adyacencia.
 */
public class Arco {
    Object destino;
    Arco siguiente;
    
    /**
     * Constructor que crea un nuevo arco con un destino especificado.
     *
     * @param d El objeto destino al que va a apuntar el arco.
     */
    public Arco(Object d){
        destino = d;
        siguiente = null;
    }
}