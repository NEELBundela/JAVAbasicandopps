package opps.Generics;

public class Player <T>{
    T item;

    public void setItem(T item){
        this.item = item;
    }
    public T getItem(){
        return this.item;
    }
}
