/*
 * Esta es la clase lista. Utiliza la clase de Node a traves de composición para
 * formar listas, enlazandolos. La clase lista tiene varios metodos que se 
 * definen acontinuación.
 */
package project3;

/**
 *
 * @author Horacio Galdamez
 */

/*
 * clase que representa una lista enlazada de datos contenidos dentro de nodos
 * 
 * A continuación, nuestra implmentación de las listas enlazadas
 */

public class Lista {
    private Nodo head,actual;
    private int capacity,size;

    public Lista() {
    }
    
    void init(){//éste es basicamente un método que inicializa los todos los atributos de la lista.
        this.capacity=0;//número de elementos que pueden ser agregados a éste objeto. Al añadirse más elementos, 
                        //éste atributo aumenta
        this.size=0;//tamaño inicial de la lista, el cual aumenta cuando se agregan elementos
        this.head=new Nodo();//se le asigna como "cabeza" a un nuevo nodo en nulo.
        actual=head;//nodo actual es asignado a head
    }//fin del metodo init
    
    boolean insert(Object o){//método de inserción a la lista, retorna true si la inserción fue exitosa
        actual=head;
        
        for(int i=0;i<capacity;i++)//recorremos toda la lista
            actual=actual.next;//nos movemos hasta el último nodo
        
        actual.next=new Nodo();//creamos un nuevo nodo, el que estamos insertando
        actual.o=o;//ingresamos la informacion a ése nodo
        size++;//aumentamos el tamaño de la lista
        capacity++;//aumentamos la capacidad de la lista
        return true;
        
    }//fin del metodo insert
    
    Object remove(int pos){//metodo que elimina un nodo en la posicion pos
        if (isEmpty()==true){//si la lista esta vacia...
            return -1;//retirn -1, no se elimina nada
        }
        
        if(pos>=size)//si la posicion no es valida...
            return -1;//retorn a-1, no se elimina nada
        
        if(pos<0)//si la posicion es menor a 0 
            return -1;//retorna -1, no se elimina nada
        
        actual=head;//aigna el actual a head
        
        for(int i=0;i<pos-1;i++)//recorremos hasta la posicion-1 dada por el usuario
            actual=actual.next;//desplazamos actual una posicion mas a la derecha
        
        Nodo temp;
        if(pos==0){//si se inserta al principio...
            head=actual.next;//asignamos el segundo nodo como cabeza, pues la cabeza actual es la que se eliminará
            temp=actual;//el nodo que se va a eliminar
        }else{
            temp=actual;//se obtiene el nodo que será eliminado
            temp=temp.next;//se obtiene el siguiente nodo
            actual.next=actual.next.next;//elimina el nodo enlazando el nodo previo y el que sigue al que sera eliminado
        }//fin if else
        
        actual=head;//asigna actual a la cabeza
        for(int i=0;i<capacity-1;i++){
            actual=actual.next;
        }
        
        actual.next=new Nodo();
        actual=actual.next;
        size--;
        return temp.o;//retorna el objeto eliminado
        
    }//fin del metodo remove
    
    boolean isEmpty(){//revisa si la lista está vacia
        if(this.head.next == null)
            return true;//la lista está vacia
        else
            return false;//retorna false si la lista no esta vacia
    }//fin del metodo isEmpty;
    
    boolean isFull(){
        if(size==capacity)
            return true;
        else
            return false;
    }//fin del metodo isFull
    
    int size(){//metodo accesor al tamaño de la lista
        return size;
    }//fin del metodo size
    
    int capacity(){//metodo accesor a la capacidad de la lista
        return capacity;
    }//fin del metodo capacity
    
    void clear(){
        for(int i=0;i<capacity;i++)
            remove(0);//se eliminan todos los nodos de la lista
        head.next=null;//hace la cabeza nula, ya que no existen mas nodos en la lista
    }//fin del metodo clear
    
    Object get(int pos){//retorna la informacion en el nodo numero pos
        if(isEmpty()==true)
            return -1;//retorna 1, indicando que la lista está vacía
        if(pos>=capacity)//si la posición no es válida...
            return -1;
        if(pos<0)//si la posición no es válida...
            return -1;
        actual=head;
        for(int i=0;i<pos;i++)//recorremos la lista, y nos desplazamos una posición más a la derecha por cada iteración
            actual=actual.next;
        
        return actual.o;//retornamos la información guardada dentro del nodo que el cliente especifica
    }//fin del metodo get
    
    int indexOf(Object o){//retorna el indice del nodo en el que está la informacion parametro
        if(isEmpty()==true)
            return -1;
        
        actual=head;
        for(int i=0;i<capacity;i++){
            if(o.equals(actual.o)){//comparamos las datas dentro de ambos nodos
                return i;//retorna la posicion del nodo en la que esta ésa informacion
            }//fin if
        actual=actual.next;
        }//fin for
        return -1;
        
    }//fin del metodo indexOf
    
}//fin de la clase
