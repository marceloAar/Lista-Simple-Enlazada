//Marcelo Aceiituno R
//Full Stack JAVA 0034
//Lista Simple Enlazada (Singly Linked List - SLL)
package ListAssigment;

public class SinglyLinkedList {
    
	public Node head;
    
	//Crear un método constructor para establecer head en null para los objetos de su SinglyLinkedList.
	public SinglyLinkedList() {
		head = null;
        // su codigo aqui
    }
    
	//Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar nodos a la lista.
    public void add(int value) {
    	
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    } 
    
    //Crear un método remove() que removerá un nodo del final de su lista.
    public void remove() {    	
        
        head.next.next.next.next = null;
    }    	
    
    //Crear un método printValues() que mostrará en pantalla todos los valores 
    //de cada nodo de la lista en el mismo orden que fue creada.
    public void printValues() {
    	
    	System.out.println( "Valores de los nodos: " );   	
    	 while( head != null){
    		 System.out.print( "["+head.value+"] " );
    		 
             head = head.next;
         }    	
    }
    
}