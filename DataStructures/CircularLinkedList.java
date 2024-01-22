package Arraysprac.DataStructures;

import java.util.NoSuchElementException;

public class CircularLinkedList {
        NodeCL head;
        int count = 0;
        NodeCL tail;

        public void insert(Object ele) {
            NodeCL node = new NodeCL(ele);
            if (head == null) {
                head = node;
                tail = node;
                count++;
                return;
            }
            node.next = head;
            tail.next = node;
            tail = node;
            count++;
        }

        public int size() {
            return count;
        }

        public void delete(Object ele) {
            if (head == null) {
                throw new NoSuchElementException();
            }
            if (head.ele == ele) {
                head = head.next;
                tail.next = head;
                count--;
                return;
            }
            NodeCL temp = head;
            do {
                NodeCL n = temp.next;
                if (n.ele == ele) {
                    temp.next = n.next;
                    count--;
                    break;
                }
                temp = temp.next;

            } while (temp != head);

        }

        public void display() {
            NodeCL temp = head;
            do {
                if (temp != null)
                    System.out.print(temp.ele + "->");
                temp = temp.next;

            } while (temp != head);
            System.out.println("START");
        }

    }

