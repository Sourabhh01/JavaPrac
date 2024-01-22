package Arraysprac.DataStructures;

public class ArrayList {
    Object [] a = new Object[10];
    int count = 0;
    public void add (Object ele){
        if(count == a.length) increase();
        a[count] = ele;
        count++;
    }
    public void increase(){
        Object [] obj = new Object[a.length+5];
        for (int i=0;i<size();i++){
            obj[i] = a[i];
        }
        a=obj;
    }
    public int size(){
        return count;
    }
    public Object get(int index){
        if(index<0 || index>size()) throw new IndexOutOfBoundsException();
        return a[index];
    }
    public void set(Object ele,int index){
        if(index<0 || index>size()) throw new IndexOutOfBoundsException();
        a[index] = ele;
    }
    public int indexOf(Object ele){
        for (int i=0;i<size();i++){
            if (a[i] == ele) return i;
        }
        return -1;
    }
    public void addPos(Object ele,int index){
        if(index<0 || index>size()) throw new IndexOutOfBoundsException();
        for (int i=size(); i>index;i--){
            a[i]=a[i-1];
        }
        a[index]=ele;
        count++;
    }
    public void remove(int index){
        if(index<0 || index>size()) throw new IndexOutOfBoundsException();
        for (int i=index;i<size();i++){
            a[i-1]=a[i];
        }
        count--;
    }
}
