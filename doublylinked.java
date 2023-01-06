class DoublyLinkedList {
    // A node class for doubly linked list
    class Node {
    int item;
    Node previous;
    Node next;
    public Node(int item) {
    this.item = item;
    }
    }
    // Initially, heade and tail is set to null
    Node head, tail = null;
    // add a node to the list
    public void addNode(int item) {
    // Create a new node
    Node newNode = new Node(item);
    // if list is empty, head and tail points to newNode
    if (head == null) {
    head = tail = newNode;
    // head's previous will be null
    head.previous = null;
    // tail's next will be null
    tail.next = null;
    } else {
    // add newNode to the end of list. tail->next set to newNode
    tail.next = newNode;
    // newNode->previous set to tail
    newNode.previous = tail;
    // newNode becomes new tail
    tail = newNode;
    // tail's next point to null
    tail.next = null;
    }
    }
    public void deleteNode(int item) {
    Node current = head;
    int flag = 0;
    if (head == null) {
    System.out.println("Empty!");
    return;
    } else {
    while (current != null) {
    if (current.item == item) {
    flag = 1;
    break;
    }
    current = current.next;
    }
    if (flag == 0) {
    System.out.println("Item not found!");
    return;
    } else if (current == head) {
    System.out.println("Deleted element is " + current.item);
    head = current.next;
    head.previous = null;
    current = null;
    } else if (current == tail) {
    System.out.println("Deleted element is " + current.item);
    tail = current.previous;
    tail.next = null;
    } else {
    System.out.println("\nDeleted element is " + current.item);
    (current.previous).next = current.next;
    (current.next).previous = current.previous;
    current = null;
    }
    }
    }
    // print all the nodes of doubly linked list
    public void printNodes() {
    // Node current will point to head
    Node current = head;
    if (head == null) {
    System.out.println("Doubly linked list is empty");
    return;
    }
    System.out.println("Nodes of doubly linked list: ");
    while (current != null) {
    // Print each node and then go to next.
    System.out.print(current.item + " ");
    current = current.next;
    }
    }
   }
   class Main {
    public static void main(String[] args) {
    // create a DoublyLinkedList object
    DoublyLinkedList dl_List = new DoublyLinkedList();
    // Add nodes to the list
    dl_List.addNode(10);
    dl_List.addNode(20);
    dl_List.addNode(30);
    dl_List.addNode(40);
    dl_List.addNode(50);
    // print the nodes of DoublyLinkedList
    dl_List.printNodes();
    dl_List.deleteNode(30);
    dl_List.deleteNode(10);
    dl_List.deleteNode(50);
    dl_List.printNodes();
    }
   }