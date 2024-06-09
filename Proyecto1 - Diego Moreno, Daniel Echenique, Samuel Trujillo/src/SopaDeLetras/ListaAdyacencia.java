
package SopaDeLetras;

/**
 * Representa una lista de adyacencia para un nodo del grafo.
 * Almacena los arcos que parten de un nodo espec&iacute;fico,
 * permitiendo determinar la conectividad con otros nodos.
 */
public class ListaAdyacencia{
    Arco head;
    Arco fin; 
    
    /**
     * Constructor que crea una lista de adyacencia vac&iacute;a.
     */
    public ListaAdyacencia(){
        head = null;
        fin = null;
    }
    
    /**
     * Verifica si la lista de adyacencia est&aacute; vac&iacute;a.
     *
     * @return 'true' si la lista est&aacute; vac&iacute;a, 'false' en caso contrario.
     */
    public boolean listaVacia(){
        return head==null;
    }
    
    /**
     * Agrega un nuevo arco a la lista de adyacencia.
     *
     * @param destino El objeto que representa el nodo destino al que se
     * crea la adyacencia.
     */
    public void nuevaAdyacencia(Object destino){
        if(!adyacente(destino)){
            Arco nodo = new Arco(destino);
            inserta(nodo);
        }
    }

    /**
     * Inserta un nuevo arco en la lista de adyacencia.
     *
     * @param nodo El arco a insertar.
     */
    private void inserta(Arco nodo){
        if(listaVacia()){
            head = nodo;
            fin = nodo;
        }else{
            fin.siguiente = nodo;
            fin = nodo;
        }
    }
    
    /**
     * Comprueba si existe una adyacencia con el nodo destino especificado.
     *
     * @param dato El objeto que representa el nodo destino a verificar.
     * @return 'true' si existe una conexi&oacute;n con el nodo destino,
     * 'false' en caso contrario.
     */
    public boolean adyacente(Object dato){
        Arco actual = head;
        boolean encontrado = false;
        while(actual != null && !dato.toString().equals(actual.destino.toString())){
            actual = actual.siguiente;
        }
        if(actual != null){
            encontrado = true;
        }
        return encontrado;
    }
    /**
     * Convierte la lista de adyacencia a una cadena de texto.
     *
     * @return Una cadena de texto que contiene los destinos de
     * los arcos adyacentes.
     */
    @Override
    public String toString(){
        String cadena = "";
        Arco temp = head;
        while(temp!=null){
            cadena = cadena + temp.destino.toString() + "- ";
            temp = temp.siguiente;
        }
        return cadena;
    }
}

