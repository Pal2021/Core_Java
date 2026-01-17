package org.example.Practice;

public class Outerclass<T> {
    T value;
    public T getPrintValue(){
        return value;
    }

    public void setPrintValue(T value){
        this.value=value;
    }

}
