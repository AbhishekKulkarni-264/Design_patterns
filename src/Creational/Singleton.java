package Creational;

public class Singleton {
   private static Singleton instance;

   private Singleton(){}
   public static Singleton getInstance(){
       if(instance==null) instance=new Singleton();
       return instance;
   }

}

class Singleton_Test{
    public static void main(String[] args) {
        Singleton i1=Singleton.getInstance();
        Singleton i2=Singleton.getInstance();
        System.out.println(i1==i2);
    }
}
