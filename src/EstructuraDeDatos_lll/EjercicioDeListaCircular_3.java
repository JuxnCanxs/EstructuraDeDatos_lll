package EstructuraDeDatos_lll;

public class EjercicioDeListaCircular_3 {
    public static void main(String[] args) {
        CircularDoublyLinkedList listaCircular = new CircularDoublyLinkedList();
        listaCircular.add(1);
        listaCircular.add(2);
        listaCircular.add(3);
        listaCircular.print();
        listaCircular.remove(2);
        listaCircular.print();
    }

    public static class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    public static class CircularDoublyLinkedList {
        private Node head;
        private Node tail;
        private int size;

        public CircularDoublyLinkedList() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public void add(int value) {
            Node newNode = new Node(value);

            if (size == 0) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
            }

            tail.next = head;
            head.prev = tail;
            size++;
        }

        public void remove(int value) {
            boolean found = false;

            if (size == 0) {
                return;
            }

            Node current = head;

            do {
                if (current.value == value) {
                    if (current == head) {
                        head = current.next;
                    } else {
                        current.prev.next = current.next;
                    }

                    if (current == tail) {
                        tail = current.prev;
                    } else {
                        current.next.prev = current.prev;
                    }

                    size--;
                    found = true;
                    break;
                }

                current = current.next;
            } while (current != head);

            if (!found) {
                System.out.println("El valor no se encuentra en la lista.");
            }
        }

        public void print() {
            if (size == 0) {
                return;
            }

            Node current = head;
            String output = "";

            do {
                output += current.value + " ";
                current = current.next;
            } while (current != head);

            System.out.println(output);
        }
    }
}
