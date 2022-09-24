
public class Prueba {
    
    /**
     * Metodo que se encarga de crear una lista ordenadas de menor a mayor, mediante el uso de dos con el mismo orden. 
     * 
     * @param list1 Lista a unir ordenada de menor a mayor.
     * @param list2 Lista a unir ordenada de menor a mayor.
     * @return La lista ordenada de menor a mayor.
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listaOrdenada = new ListNode();

        if(list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val <= list2.val) {
            listaOrdenada.val = list1.val;
            listaOrdenada.next = mergeTwoLists(list1.next, list2);
        } else {
            listaOrdenada.val = list2.val;
            listaOrdenada.next = mergeTwoLists(list1, list2.next);
        }

        return listaOrdenada;
    }

    public static void main(String[] args) {

        System.out.println("Ejemplos 1:");
        ListNode list1 = new ListNode(1,new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1,new ListNode(3, new ListNode(4)));

        ListNode listaOrdenada = mergeTwoLists(list1, list2);

        list1.printList();
        list2.printList();
        listaOrdenada.printList();

        System.out.println("Ejemplos 2:");

        list1 = new ListNode(1,new ListNode(2, new ListNode(4, new ListNode(9, new ListNode(10)))));
        list2 = new ListNode(1,new ListNode(3, new ListNode(4, new ListNode(7))));

        listaOrdenada = mergeTwoLists(list1, list2);

        list1.printList();
        list2.printList();
        listaOrdenada.printList();

    }
}
