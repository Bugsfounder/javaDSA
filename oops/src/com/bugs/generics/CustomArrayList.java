package com.bugs.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];

    }

    public void add(int num){
        if(this.isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }

    public int remove(){
        System.out.println(data.length);
        int removed = data[--size];
        System.out.println(data.length);
        return removed;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];

        // copy the current array into temp
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString(){

//        return Arrays.toString(data) + " size: " + size;
        String res = "";
        res += "[";
        for (int i = 0; i < size; i++) {
            res += data[i];
            if (i != size-1){
                res  += ", ";
            }
        }
        res += "]";
        return res;

    }

    public static void  main(String[] args){
//        ArrayList list = new ArrayList();
//        list.add(40);
//        list.remove(0);
//        list.get(0);
//        list.set(0,32);
//        list.size();

        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(5);
        list.add(9);

        list.remove();

        for (int i = 0; i < 14; i++) {
            list.add(2* i);
        }


        System.out.println(list);
    }
}
