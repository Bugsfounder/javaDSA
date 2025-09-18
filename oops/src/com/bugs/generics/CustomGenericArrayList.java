
package com.bugs.generics;

import com.bugs.properties.polymorphism.Numbers;

public class CustomGenericArrayList<T extends Numbers> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];

    }

    public void add(T num){
        if(this.isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];

        // copy the current array into temp
        for (int i = 0; i < data.length; i++) {
            temp[i] = (T)(data[i]);
        }
        data =  temp;
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
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

        CustomGenericArrayList list = new CustomGenericArrayList();
        list.add(3);
        list.add(5);
        list.add(9);

        list.remove();

        for (int i = 0; i < 14; i++) {
            list.add(2* i);
        }


        CustomGenericArrayList<Integer> list3 = new CustomGenericArrayList<>();
        list3.add(43);
        CustomGenericArrayList<String> list4 = new CustomGenericArrayList<>();
        list4.add("Manisha");
        System.out.println(list3);
        System.out.println(list4);

    }
}
