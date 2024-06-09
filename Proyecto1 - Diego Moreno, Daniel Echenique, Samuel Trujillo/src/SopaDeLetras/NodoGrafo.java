package SopaDeLetras;

/**
 * Representa un nodo en un grafo.
 * Contiene informaci&oacute;n sobre el dato asociado al nodo, la lista de adyacencia,
 * un enlace al siguiente nodo en la lista de nodos del grafo, un
 * &iacute;ndice &uacute;nico y un indicador para saber si el nodo ha sido
 * visitado (a la hora de hacer una b&uacute;squeda).
 */
public class NodoGrafo {
    Object dato;
    ListaAdyacencia lista;
    NodoGrafo siguiente;
    int indice;
    boolean visitado;
    
    /**
     * Constructor que crea un nuevo nodo grafo con el dato especificado
     * y un &iacute;ndice &uacute;nico.
     *
     * @param x La letra asociada al nodo.
     * @param i El &iacute;ndice del nodo.
     */
    public NodoGrafo(Object x, int i){
        dato = x;
        lista = new ListaAdyacencia();
        siguiente = null;
        indice = i;
        this.visitado = false;   
    } 
}
