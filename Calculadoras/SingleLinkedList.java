package Calculadoras;

/**
 * Esta es la clase implementa la interfaz de la lista
 * Universidad del Valle de Guatemala
 * @author Mark Albrand
 * @author Jimena Hernandez
 * @author Emily Perez
 * @version 2-mar-22
 */

public class SingleLinkedList<T> implements IList<T> {
    private int count;
    private Node<T> start;
    private Node<T> end;

    /**
     *
     * @param value
     */
	@Override
	public void InsertAtStart(T value) {
		Node<T> newNode = new Node<T>(value);

        if (IsEmpty()){
            start = newNode;
            end = newNode;
        }
        else{
            newNode.setNext(start);
            start = newNode;
        }
        count++;
	}

    /**
     *
     * @param value
     */
	@Override
	public void InsertAtEnd(T value) {
		Node<T> newNode = new Node<T>(value);

        if (IsEmpty()){
            start = newNode;
            end = newNode;
        }
        else {
            end.setNext(newNode);
            end = newNode;
        }
        count++;
	}

    /**
     *
     * @param value
     * @param index
     */
	@Override
	public void Insert(T value, int index){
		//if the list is empty then insert at start
		if (IsEmpty()) {
            InsertAtStart(value);
        }
        else {
            //if the index is equal or greater than count then insert at end
            if (index >= Count()) {
                InsertAtEnd(value);
            } 
            //If the index to insert is 0 and the list is not empty
            else if (index == 0) {
                InsertAtStart(value);
            }
            //Index between 1 (second element) and Count() - 1 previous the last one
            else if ((index > 0) && (index < Count())){
                Node<T> newNode = new Node<T>(value);
                Node<T> pretemp = start;
                Node<T> temp = start.getNext();
                int i = 1;

                //Search the position where the node will be inserted
                while ((temp != null) && (i < index)) {
                    pretemp = temp;
                    temp = temp.getNext();
                    i++;
                }

                //doing the insertion
                newNode.setNext(temp);
                pretemp.setNext(newNode);
                count++;
            }
        }
	}

    /**
     *
     * @param index
     * @return
     */
	@Override
	public T Delete(int index) {
		
		if (index == 0){
            return DeleteAtStart();
        }
        else if (index == (Count() - 1)){
            return DeleteAtEnd();
        }
        else if ((index > 0) && (index < (Count() - 1))){
            Node<T> pretemp = start;
            Node<T> temp = start.getNext();
            int i = 1;

            //Search the position where the node will be inserted
            while ((temp != null) && (i < (Count() - 1))){
                pretemp = temp;
                temp = temp.getNext();
                i++;
            }

            //Delete the node
            pretemp.setNext(temp.getNext());
            count--;
            return temp.getValue();
        }
        else{
            return null;
        }
	}

    /**
     *
     * @return
     */
	@Override
	public T DeleteAtStart() {
		
		if (!IsEmpty()) {
            Node<T> temp = start;
            start = start.getNext();
            count--;
            return temp.getValue();
        }
        return null;
	}

    /**
     *
     * @return
     */
	@Override
	public T DeleteAtEnd() {
		if (!IsEmpty()) {

            //Only one node then delete
            if (Count() == 1) {
                Node<T> temp = start;
                start = null;
                end = null;
                count--;
                return temp.getValue();
            }
            else{
                Node<T> pretemp = start;
                Node<T> temp = start.getNext();

                //Search the position where the node will be inserted
                while (temp != null){
                    pretemp = temp;
                    temp = temp.getNext();
                }
                //Delete the node
                end = pretemp;
                end.setNext(null);
                count--;
                return temp.getValue();
            }
        }
        return null;
	}

    /**
     *
     * @param index
     * @return
     */
	@Override
	public T Get(int index) {
		
	    if (!IsEmpty()){
            if (index == 0){
                return start.getValue();
            }
            else if (index == (Count() - 1)){
                return end.getValue();
            }
            else if ((index > 0) && (index < (Count() - 1))){
                Node<T> temp = start;
                int i = 0;
                while ((temp != null) && (i != index)){
                    temp = temp.getNext();
                    i++;
                }

                if (temp != null){
                    return temp.getValue();
                }
                else{
                    return null;
                }
            }
            else{
                return null;
            }
        }
        return null;
	}

    /**
     *
     * @return
     */
	@Override
	public boolean IsEmpty() {
		return count == 0;
	}

    /**
     *
     * @return
     */
	@Override
	public int Count() {
		return count;
	}
}
