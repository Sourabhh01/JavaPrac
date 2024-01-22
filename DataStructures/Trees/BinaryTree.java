package Arraysprac.DataStructures.Trees;

import java.util.Scanner;

public class BinaryTree {
    Node root;
    Scanner sc = new Scanner(System.in);
    public void populate(){
        System.out.println("Enter root element");
        int n = sc.nextInt();
        root = new Node(n);
        populate(root);
    }
    public void populate(Node node){
        System.out.println("You want to add element on the left " + node.ele);
        char left = sc.next().charAt(0);
        if(left=='y'){
            node.left = new Node(sc.nextInt());
            populate(node.left);
        }
        System.out.println("You want to add element on the right " + node.ele);
        char right = sc.next().charAt(0);
        if (right=='y'){
            node.right = new Node(sc.nextInt());
            populate(node.right);
        }
    }
    public void display(){
//        display(root);
        formatDisplay(root,0);
    }
    public void display(Node node){
        System.out.println(node.ele);
        display(node.left);
        display(node.right);
    }
    public void formatDisplay(Node node,int level){
    if (node==null) return;
    formatDisplay(node.right,level+1);
    if (level!=0){
        for (int i=0;i<level-1;i++){
            System.out.print("|\t");
        }
        System.out.println("|--------->" +node.ele);
    }
    else System.out.println(node.ele);
    formatDisplay(node.left,level+1);
    }
}
