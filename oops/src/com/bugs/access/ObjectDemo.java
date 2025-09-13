package com.bugs.access;

public class ObjectDemo {

    int num;
    int val;
    float gpa;
    public ObjectDemo(int num, float gpa){
        this.num = num;
        this.val = 78;
        this.gpa = gpa;
    }

    // already covered
    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable{
        super.finalize();
    }

    @Override
    public int hashCode(){
        return super.hashCode();
//        return num;
    }

    @Override
    public boolean equals(Object obj){
//        return super.equals(obj);
        return this.num == ((ObjectDemo) obj).num;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args){
        ObjectDemo obj = new ObjectDemo(23, 32.1f);
        ObjectDemo obj2 = new ObjectDemo(23, 43.2f);
//        ObjectDemo obj2 = obj;

        if (obj == obj2){
            System.out.println("obj is equal to obj2");
        }

        if (obj.equals(obj2)){
            System.out.println("obj is equal to obj2");
        }

        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getName());
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
    }

}
