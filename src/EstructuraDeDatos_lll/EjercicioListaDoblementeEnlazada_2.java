package EstructuraDeDatos_lll;

public class EjercicioListaDoblementeEnlazada_2 {
    //representa una lista doblemente enlazada.
    public static class DoublyLinkedList {
        private Node head;
        private Node tail;
        private int size;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        private class Node {
            private int data;
            private Node next;
            private Node prev;

            public Node(int data) {
                this.data = data;
                this.next = null;
                this.prev = null;
            }
        }

        //me agrega un nuevo nodo al principio de la lista.
        public void addFirst(int data) {
            Node nuevoNodo = new Node(data);
            if (estaVacia()) {
                head = nuevoNodo;
                tail = nuevoNodo;
            } else {
                nuevoNodo.next = head;
                head.prev = nuevoNodo;
                head = nuevoNodo;
            }
            size++;
        }

        //agrega un nuevo nodo al final de la lista.
        public void addLast(int data) {
            Node nuevoNodo = new Node(data);
            if (estaVacia()) {
                head = nuevoNodo;
            } else {
                nuevoNodo.prev = tail;
                tail.next = nuevoNodo;
            }
            tail = nuevoNodo;
            size++;
        }

        //elimina el primer nodo de la lista.
        public void removeFirst() {
            if (estaVacia()) {
                throw new RuntimeException("Lista vacía");
            }
            if (size() == 1) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
        }

        //elimina el último nodo de la lista.
        public void removeLast() {
            if (estaVacia()) {
                throw new RuntimeException("Lista vacía");
            }
            if (size() == 1) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        }

        public boolean estaVacia() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        //me devuelve una representación de cadena de la lista.
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            Node actual = head;
            while (actual != null) {
                sb.append(actual.data);
                if (actual.next != null) {
                    sb.append(", ");
                }
                actual = actual.next;
            }
            sb.append("]");
            return sb.toString();
        }

        public static void main(String[] args) {
            DoublyLinkedList lista = new DoublyLinkedList();
            lista.addFirst(1);
            lista.addLast(2);
            lista.addLast(3);
            System.out.println(lista); // [1, 2, 3]
            lista.removeFirst();
            System.out.println(lista); // [2, 3]
            lista.removeLast();
            System.out.println(lista); // [2]
        }
    }
}
