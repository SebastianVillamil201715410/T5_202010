package model.data_structures;

/**
 * Interfaz que presenta una cola
 * @author bernal
 *
 * @param <T>
 */
public interface IQueue<T> {
	
	public void enqueue(T pItem);	//Inserta un nuevo elemento a la cola

	public T dequeue();				// Elimina/saca el primer elemento de la cola (orden de llegada)

	public int getSize();			// Retorna el tama�o de la cola

	public boolean isEmpty();		// Retorna si la cola est� vac�a

	public T getFirst();			// Retorna el primer elemento sin eliminarlo
}
