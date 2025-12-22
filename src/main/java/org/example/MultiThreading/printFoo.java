package org.example.MultiThreading;

public class printFoo {
    private boolean flag=false;
    public void printFoo(){
        System.out.println("Foo");
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
