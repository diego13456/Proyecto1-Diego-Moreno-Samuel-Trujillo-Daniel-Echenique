
package SopaDeLetras;

/**
 * Representa un grafo.
 * Contiene m&eacute;todos para crear y manipular la estructura del grafo,
 * recorrerlo utilizando algoritmos de b&uacute;squeda (DFS y BFS) y
 * encontrar palabras a partir de un conjunto de letras.
 *
 */
public class Grafo {

    protected NodoGrafo head;
    protected NodoGrafo fin;
    public String palabrasE = "";
    public boolean recursividad = true;
    public String palabrasBFS = "";
    public int contadorIteraciones = 0;
    private static final int LIMITE_ITERACIONES = 50000;
    
    /**
     * Constructor de un grafo vac&iacute;o.
     */
    public Grafo(){
        head = null;
        fin = null;
    }
    
    /**
     * Verifica si el grafo est&aacute; vac&iacute;o.
     *
     * @return 'true' si el grafo no contiene nodos, 'false' en caso contrario.
     */
    public boolean grafoVacio(){
        return head==null;
    }
    
    /**
     * Comprueba si existe un nodo con el dato especificado en el grafo.
     *
     * @param dato El dato a buscar en el nodo.
     * @return 'true' si el nodo existe en el grafo, 'false' en caso contrario.
     */
    public boolean existeVertice(Object dato){
        boolean existe = false;
        if(!grafoVacio()){
            NodoGrafo temp = head;
            while(temp!=null && !existe){
                if(temp.dato.toString().equals(dato.toString())){
                    existe = true;
                }
                temp = temp.siguiente;
            }
        }
        return existe;
    }
    
    
    /**
     * Agrega una nueva arista al grafo.
     *
     * @param origen El dato del nodo origen.
     * @param destino El dato del nodo destino.
     * @throws RuntimeException Si no se encuentran los nodos origen o
     * destino en el grafo.
     */
    public void nuevaArista(Object origen, Object destino){
        if(existeVertice(origen) && existeVertice(destino)){
            NodoGrafo posicion = head;
            while(!posicion.dato.equals(origen.toString())){
                posicion = posicion.siguiente;
            }
            posicion.lista.nuevaAdyacencia(destino);
        }
    }

   
    /**
     * Agrega un nuevo nodo al grafo con el dato y el &iacute;ndice especificados.
     *
     * @param dato El dato del nuevo nodo.
     * @param i El &iacute;ndice del nuevo nodo.
     */
    public void nuevoNodo(Object dato, int i){
        NodoGrafo nodo = new NodoGrafo(dato, i);
        if(grafoVacio()){
            head = nodo;
            fin = nodo;
        }else{
            fin.siguiente = nodo;
            fin = fin.siguiente;
        }
    }
    
    /**
     * Obtiene el dato del nodo con el &iacute;ndice especificado.
     *
     * @param j El &iacute;ndice del nodo.
     * @return El dato del nodo, o 'null' si el &iacute;ndice no existe.
     */
    public String recorrerDatos(int j) {
        NodoGrafo aux = head;
        while(aux.indice != j){
            aux = aux.siguiente;
        }
        return aux.dato.toString();
    }
    
    /**
     * Obtiene el nodo con el &iacute;ndice especificado.
     *
     * @param j El &iacute;ndice del nodo.
     * @return El nodo correspondiente al &iacute;ndice, o 'null' si el &iacute;ndice
     * no existe.
     */
    public NodoGrafo recorrerNodos(int j) {
        NodoGrafo aux = head;
        while(aux.indice != j){
            aux = aux.siguiente;
        }
        return aux;
    }
    
    /**
     * Obtiene el nodo con el dato especificado.
     *
     * @param j El dato del nodo a buscar.
     * @return El nodo correspondiente al dato, o 'null' si el dato no existe.
     */
    public NodoGrafo recorrerNodos(Object j) {
        NodoGrafo aux = head;
        while (aux != j) {
            aux.dato = aux.siguiente;
        }
        return aux;
    }
    
    /**
     * Recorre los nodos del grafo hasta encontrar el nodo con el dato
     * especificado.
     *
     * @param dato El dato del nodo a buscar.
     * @return El nodo con el dato especificado, o 'null' si el dato no existe.
     */
    public NodoGrafo recorrerLetras(Object dato){
            NodoGrafo temp = head;
            while(!temp.dato.toString().equals(dato)){
                temp = temp.siguiente;
            }
            
            return temp;
            
    }


    /**
     * Obtiene la lista de adyacencia del nodo especificado.
     * 
     * @param nodo El nodo al cual se le quiere buscar la lista de adyacencia.
     * @return La lista de adyacencia del nodo.
     */
    public ListaAdyacencia obtenerAdyacentes(NodoGrafo nodo) {
        return nodo.lista; 
        }
    
    
    /**
     * Obtiene la cantidad de nodos en el grafo.
     *
     * @return La cantidad de nodos en el grafo.
     */
    public int cantidadNodos() {
    int contador = 0;
    NodoGrafo temp = head;
    while (temp != null) {
        contador++;
        temp = temp.siguiente;
    }
    return contador;
}
    /**
    * Realiza una b&uacute;squeda en profundidad DFS en el grafo.
    *
    * @param grafo El grafo en el que se realizar&aacute; la b&uacute;squeda.
    * @param nodoInicial El nodo desde el que comenzar&aacute; la b&uacute;squeda.
    * @param palabras Las palabras que se buscar&aacute;n.
    */
    public static void dfs(Grafo grafo, NodoGrafo nodoInicial, String palabras) {

        String palabraActual = "";
        dfsRecursivo(grafo, nodoInicial, palabraActual, palabras);
    }
    /**
     * Realiza una b&uacute;squeda en profundidad (DFS) en el grafo.
     * Recorre de forma recursiva al grafo
     *
     * @param grafo El grafo en el que se realizar&aacute; la b&uacute;squeda.
     * @param nodoInicial El nodo desde el que comenzar&aacute; la b&uacute;squeda.
     * @param palabraActual La palabra actual en la b&uacute;squeda.
     * @param palabras Las palabras que se buscar&aacute;n.
     */
    private static void dfsRecursivo(Grafo grafo, NodoGrafo nodoActual, String palabraActual, String palabras) {
        palabraActual += nodoActual.dato;
        
        if (esPalabraValida(palabraActual, palabras)) {
            String regex = "[0-9]";

            String palabraE = palabraActual.replaceAll(regex, "");
            grafo.palabrasE += palabraE + ", ";
        }

        nodoActual.visitado = true;
        
        
        for (Arco actual = nodoActual.lista.head; actual != null; actual = actual.siguiente) {
            NodoGrafo nodoAdyacente = grafo.recorrerLetras(actual.destino);
            if (!nodoAdyacente.visitado) {

                dfsRecursivo(grafo, nodoAdyacente, palabraActual, palabras);
            }
        }

        nodoActual.visitado = false;
    }
    
    /**
     * Realiza una b&uacute;squeda en profundidad (DFS) en el grafo.
     * 
     * @param letra La letra de la palabra
     * @param palabras Las palabras que se van a buscar
     * @param palabraActual La palabra actual de la b&uacute;squeda
     */
    public void bfsRecursivo(String letra, String palabras, String palabraActual) {
        
            NodoGrafo aux = head;
            while (aux != null) {
                aux.visitado = false;
                aux = aux.siguiente;
            }

            NodoGrafo nodoInicial = recorrerLetras(letra);
            if (nodoInicial != null) {
                bfsRecursivoAux(nodoInicial, letra, palabras, palabraActual);
            } 
    }
    
    /**
     * Recorre de forma recursiva al grafo.
     * 
     * 
     * @param nodoActual El nodo que se est&aacute; revisando
     * @param letra La letra de la palabra
     * @param palabras Las palabras que se van a buscar
     * @param palabraActual La palabra actual de la b&uacute;squeda
     */
    private void bfsRecursivoAux(NodoGrafo nodoActual, String letra, String palabras, String palabraActual) {
        
        if (nodoActual == null) {
            return;
       }
        
        palabraActual += nodoActual.dato.toString().charAt(0);
        
        if (nodoActual.siguiente != null && !nodoActual.dato.equals(nodoActual.siguiente.dato)) {
                
                palabrasE += palabraActual;
                if(esPalabraValidaBFS(palabrasE, palabras)) {
                    String[] listaPalabras = palabras.split("\\s");
                    String inverso = "";

                    for (int i = palabrasE.length() - 1; i >= 0; i--) {
                        inverso += palabrasE.charAt(i);
                    }

                    for (String palabraDicc : listaPalabras) {
                        if (palabrasE.contains(palabraDicc)) {
                            if(!palabrasBFS.contains(palabraDicc)){
                            palabrasBFS += palabraDicc + ", ";
                            }
                       }
                        else if(inverso.contains(palabraDicc)){
                            if(!palabrasBFS.contains(palabraDicc)){
                            palabrasBFS += palabraDicc + ", ";
                            }
                    }
               }
                
                palabraActual = "";
                
                nodoActual.visitado = true;
                
                for (Arco actual = nodoActual.lista.head; actual != null; actual = actual.siguiente) {
                    contadorIteraciones++;
                    if (contadorIteraciones > LIMITE_ITERACIONES) {
                        continue;
                    }
                    NodoGrafo nodoAdyacente = recorrerLetras(actual.destino);
                    if (nodoAdyacente != null && !nodoAdyacente.visitado) {
                        bfsRecursivoAux(nodoAdyacente, letra, palabras, palabraActual);
                    }
                }
                
                nodoActual.visitado = false; 
            }
        }

    }
    
    /**
     * Verifica si una palabra es v&aacute;lida.
     *
     * @param palabra La palabra a verificar.
     * @param palabras El conjunto de palabras con las que se comparar&aacute;
     * la palabra.
     * @return 'true' si la palabra es v&aacute;lida, 'false' en caso contrario.
     */
    private static boolean esPalabraValida(String palabra, String palabras){
        String regex = "[0-9]";

        String palabraE = palabra.replaceAll(regex, "");
        
        String[] listaPalabras = palabras.split("\\s");
        for (String palabraDicc : listaPalabras) {
            if (palabraE.equals(palabraDicc)) {
                return true;
        
    }
        }
        return false;
    }
    
    private static boolean esPalabraValidaBFS(String palabra, String palabras) {

        String[] listaPalabras = palabras.split("\\s");
        for (String palabraDicc : listaPalabras) {
            if (palabra.contains(palabraDicc)) {
                return true;

            }
        }
        return false;
    }

    

    /**
     * Obtiene las palabras encontradas durante las b&uacute;squedas en el grafo.
     *
     * @return Las palabras encontradas.
     */
    public String getPalabrasE(){
        return palabrasE;
    }
    
    /**
     * Crea un string del grafo.
     *
     * @return Una representaci&oacute;n en forma de string del grafo.
     */
    @Override
    public String toString(){
        String cadena = "";
        NodoGrafo temp = head;
        while(temp!=null){
            cadena = cadena + temp.dato.toString() + "-->" + temp.lista.toString() + "\n";
            temp = temp.siguiente;
        }
        return cadena;
    }
}



