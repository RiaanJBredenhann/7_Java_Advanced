package lesson7.exercises.Generics.generics;

public class CacheAny <T>{
      
    private T t;
  
    public void add(T t){
        this.t = t;
    }
  
    public T get(){
        return this.t;
    }  
}
