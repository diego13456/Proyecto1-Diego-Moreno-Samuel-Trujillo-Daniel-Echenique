
package SopaDeLetras;
/**
 * Representa un nodo en una cola.
 * Contiene informaci&oacute;n sobre el dato almacenado en el nodo y
 * un apuntador al siguiente nodo en la cola.
 *
 * @param <T> El tipo de objeto que representa el dato almacenado en el nodo.
 */
public class NodoQ<T> {
    T dato;
    NodoQ<T> next;
    /**
     * Constructor que crea un nuevo nodo cola.
     *
     * @param dato El dato que va almacenar en el nodo.
     */
    public NodoQ(T dato){
        this.dato = dato;
        this.next = null;
    }
}
