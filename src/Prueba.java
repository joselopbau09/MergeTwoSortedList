package src;
public class Prueba {
    
    /**
     * 
     * @param list1 
     * @param list2 
     * @return La lista ordenada de menor a mayor.
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listaOrder = new ListNode();

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
            listaOrder.val = list1.val;
            listaOrder.next = mergeTwoLists(list1.next, list2);
        } else {
            listaOrder.val = list2.val;
            listaOrder.next = mergeTwoLists(list1, list2.next);
        }

        return listaOrder;
    }

    public static void main(String[] args) {

        System.out.println("Ejemplos 1:");
        ListNode list1 = new ListNode(1,new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1,new ListNode(3, new ListNode(4)));

        ListNode listaOrder = mergeTwoLists(list1, list2);

        list1.printList();
        list2.printList();
        listaOrder.printList();

        System.out.println("Ejemplos 2:");

        list1 = new ListNode(1,new ListNode(2, new ListNode(4, new ListNode(9, new ListNode(10)))));
        list2 = new ListNode(1,new ListNode(3, new ListNode(4, new ListNode(7))));

        listaOrder = mergeTwoLists(list1, list2);

        list1.printList();
        list2.printList();
        listaOrder.printList();

    }
}
