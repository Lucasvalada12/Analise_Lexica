public class UnaCompSciList<T> {
    // Hold the reference to the first node of this List.
    private Node<T> firstNode;
    private int totalElements;

    public void insertAtBeginning(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.setNext(firstNode);
        firstNode = newNode;
        totalElements++;
    }

    public Node<T> removeAtBeginning() {
        Node<T> aux = firstNode;
        firstNode = firstNode.getNext();
        totalElements--;
        return aux;
    }
    
    public void insertAtEnd(T value) {
        Node<T> newNode = new Node<>(value);
        if (firstNode == null) {
        	firstNode = newNode;
        }else {
        	Node<T> lastNode = firstNode;
        	while (lastNode.getNext() != null) {
        		lastNode = lastNode.getNext();
        	}
        lastNode.setNext(newNode);
        }
        
        totalElements++;
    }

    public Node<T> removeAtEnding() {
       if (firstNode == null) {
    	   return null;
       }
       if (firstNode.getNext() == null) {
    	   Node<T> removedNode = firstNode;
    	   firstNode = null;
    	   totalElements --;
    	   return removedNode;
       }
       Node<T> lastNode = firstNode;
       while (lastNode.getNext().getNext() != null) {
    	   lastNode = lastNode.getNext();
       }
       Node<T> removedNode = lastNode.getNext();
       lastNode.setNext(null);
       totalElements --;
       return removedNode;
    }

    @Override
    public String toString() {
        if(this.totalElements == 0) {
            return "[ ]";
        }

        Node<T> currentNode = firstNode;
        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < totalElements; i++) {
            builder.append(currentNode.getValue());
            builder.append(", ");

            currentNode = currentNode.getNext();

        }

        builder.append("]");

        return  builder.toString();
    }

    // Design the other list methods.
//    Insert at the end, in order, remove at the end,
//    remove elements by value, search an element.
}