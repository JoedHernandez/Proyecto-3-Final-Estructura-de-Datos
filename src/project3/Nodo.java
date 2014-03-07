/*
 * Esta es la clase Node. Es la estructura base de la lista. Tiene como atributos
 * un objeto y un nodo. El objeto es lo que se desea salvar en el nodo. El nodo
 * solo es un "referencia" al siguiente nodo que sigue.
 */
package project3;

/**
 *
 * @author Horacio Galdamez
 */

/*
 * clase nodo de los que serán utilizados en la clase list, la cual es una lista de nodos
 */

public class Nodo {
    public Object o;//la información almacenada dentro de éste nodo
    public Nodo next;//el nodo siguiente a éste nodo
    
    public Nodo(){//ctor de la clase Nodo
        this.o=null;
        this.next=null;
    }//fin el constructor 
}//fin de la clase
