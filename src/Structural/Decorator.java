package Structural;

abstract class BasePizza{
   abstract int getCost();
}

class FarmHouse extends BasePizza{

    @Override
    int getCost() {
        return 200;
    }
}

class VegDelight extends BasePizza{

    @Override
    int getCost() {
        return 100;
    }
}


class Chesse extends BasePizza{

     BasePizza bp;
     Chesse(BasePizza bp){
         this.bp=bp;
     }
    @Override
    int getCost() {
        return this.bp.getCost()+10;
    }
}

class Mushroom extends BasePizza{
    BasePizza bp;
    Mushroom(BasePizza bp){
        this.bp=bp;
    }
    @Override
    int getCost() {
        return this.bp.getCost()+10;
    }
}

public class Decorator {
    public static void main(String[] args) {
        BasePizza bp=new Mushroom(new Chesse(new FarmHouse()));
        System.out.println(bp.getCost());
    }
}
