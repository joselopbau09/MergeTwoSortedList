
/** 
 * Clase que se encarga de simular el comportamiento de una lista simple ligada 
 * @author: José Luis López Bautista 
 *   
 */
public class ListNode {
        
    public int val;

    public ListNode next;
    
    /** 
     * Constructor por omisión.
     */
    public ListNode() {}
    
    /** 
     * Constructor que crea una instancia y esta apunta al vacío.
     * @param val El valor a alamcenar en el nodo de la lista.
     * 
     */
    public ListNode(int val) { this.val = val; next = null; }
    
    /** 
     * Constructor que crea una instancia y esta apunta al vacío.
     * @param val El valor a alamcenar en el nodo de la lista.
     * @param next Nodo al que apuntara el nodo creado.
     * 
     */
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }  

    /** 
     * Se encarga de imprimir en la terminal el contenido de nuestra lista.  
     * 
     */
    public void printList()
    {
        ListNode node = this;
        System.out.print("[");
        while (node != null)
        {
            System.out.print(node.val+" ");
            node = node.next;
        }
        System.out.print("]");
        System.out.println();
    }

}
