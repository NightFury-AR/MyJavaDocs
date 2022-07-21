package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class MyArrayList<E> {
    Object[] listData;
    int capacity;
    int size;

    public MyArrayList(){
        this.capacity = 3;
        this.listData = new Object[capacity];
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    private void increaseCapacity(){
        //Object[] newObj = new Object[this.size+3];
        System.out.println("before increase"+this.listData.length);
        this.listData = Arrays.copyOf(this.listData,this.size+3);

        //this.listData = newObj;
        System.out.println("after increase"+this.listData.length);
    }

    public void add(E e){
        if(this.size==0){
            this.listData[0] = e;
            this.size++;
        }
        else {
            if(size<this.listData.length){
                this.listData[this.size++]=e;
            }
            else{
                increaseCapacity();
                this.listData[this.size++]=e;
            }
        }
    }

    public E getLast() {
        if(this.listData.length>0){
            return (E) this.listData[this.size-1];
        }
        return null;
    }

    public E get(int index){
        if(this.size<=index){
            return (E) this.listData[index-1];
        }
        else {
            return null;
        }
    }

}



public class Java001CustomArrayList {
    public static void main(String[] args) {
        MyArrayList<String> l = new MyArrayList<>();
        l.add("hrllo");
        l.add("fdfdf");
        l.add("dfg");
        l.add("fddgdgfdf");
        System.out.println(l.getLast());
        System.out.println(l.getSize());
        System.out.println(l.isEmpty());
    }
}
