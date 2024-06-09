
package SopaDeLetras;

/**
 * Representa una cola.
 * Implementa una cola utilizando nodos para almacenar elementos.
 *
 * @param <T> El tipo de objeto que representa los elementos almacenados en
 * la cola.
 */
public class Queue<T> {
    private NodoQ<T> head;
    private NodoQ<T> tail;
    
    /**
     * Verifica si la cola está vacía.
     *
     * @return 'true' si la cola no contiene elementos, 'false' en caso
     * contrario.
     */
    public boolean isEmpty() {
        return head == null;
    }
    
    /**
     * Inserta un nuevo elemento a la cola.
     *
     * @param data El elemento a insertar en la cola.
     */
    public void enqueue(T data) {
        NodoQ<T> newNode = new NodoQ<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    /**
     * Elimina el elemento frontal de la cola.
     *
     * @return El elemento eliminado de la cola, o 'null' si la cola 
     * est&aacute; vac&iacute;a.
     */
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }

        T data = head.dato;
        head = head.next;
        if (head == null) {
            tail = null;
        }

        return data;
    }
}
