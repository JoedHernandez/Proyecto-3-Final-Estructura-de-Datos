/*
 * Clase TDACola. Se implementa mediante el uso de una lista implmentada. No necesita un argumento para
 * inicializarse
 */
package project3;

/**
 *
 * @author Horacio Galdamez
 */

/*
 * Ésta clase es nuestra propia implementación de la clase COLA.
 */
public class Cola {
    Lista l;
    int pos;
    
    public Cola(){//ctor de la clase
        pos=-1;
        l=new Lista();
        l.init();//inicializamos la lista atributo de la cola
    }//fin del constructor
    
    public int size(){//metodo accesor del tamaño de la lista que pertenece a ésta clase
        return l.size()-1;
    }//fin del metodo size
    
    public boolean queue(Object o){//metodo que agrega a la cola
        if(l.insert(o)==true){
            return true;
        }
        return false;
    }//fin del metodo agregar a la cola
    
    public Object dequeue(){//metodo que saca de la cola
        return l.remove(0);
    }//fin del metodo dequeue
    
    public Object peek(){//mira el elemento en el tope de la cola sin sacarlo
        return l.get(0);
    }//fin el metodo peek
    
    public Object last(){//retorn el ultimo elemento de la cola
        return l.get(l.size()-1);
    }//fin del metodo last
    
    public Cola duplicate(){//metodo que duplica la cola
        Cola q=new Cola();
        
        for(int i=0;i<l.size();i++)
            q.queue(l.get(i));
        
        return q;//retorn la lista que fue duplicada
    }//fin del método duplicate
    
}//fin de la clase Cola
