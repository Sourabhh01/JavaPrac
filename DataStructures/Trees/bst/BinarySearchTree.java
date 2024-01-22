package Arraysprac.DataStructures.Trees.bst;

public class BinarySearchTree {
    Node root;
    int count=0;
    boolean flag;

    public boolean add(int k){
        flag =true;
        root = add(root,k);
        return flag;
    }
    public void add(int[]a){
        for (int i=0;i<a.length;i++){
            add(a[i]);
        }
    }
    public Node add(Node n,int k) {
        if (n == null) {
            n = new Node(k);
            count++;
            return n;
        }
        if(k<n.key){
            n.left = add(n.left,k);
        }
        else if (k>n.key) {
            n.right = add(n.right,k);
        }
        else flag =false;
        return n;
    }
    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return root == null;
    }
     public void display(){
        preOrder(root);
        postOrder(root);
        inOrder(root);
        treeFormat(root,0);
     }
     public void preOrder(Node node){
        if(node==null) return;
        System.out.print("pre order --> "+node.key);
        preOrder(node.left);
        preOrder(node.right);
     }
    public void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print("postorder --> "+node.key);
    }
    public void inOrder(Node node){
        if(node==null) return;
        inOrder(node.left);
        System.out.print("inoder --> "+node.key);
        inOrder(node.right);
    }
    public void treeFormat(Node node,int level){
        if (node == null) return;
        treeFormat(node.left,level+1);
        if (level!=0){
            for (int i = 0;i<level-1;i++){
                System.out.print("|\t");
            }
            System.out.println("|--------->" +node.key);
        }
        else System.out.print(node.key);
        treeFormat(node.left,level+1);
    }
}
