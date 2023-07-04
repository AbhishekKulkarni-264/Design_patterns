package Creational;


interface Logistics{
    void Trasport();
}

class LandLogistics implements Logistics{

    @Override
    public void Trasport() {
        System.out.println("Transporting via Truck");
    }
}

class waterLogistics implements Logistics{

    @Override
    public void Trasport() {
        System.out.println("Transporting via Ship");
    }
}

class AirLogistics implements  Logistics{

    @Override
    public void Trasport() {
        System.out.println("Transporting via plane");
    }
}

public class Factory {

    public Logistics createLogistics(String type){
        if(type.equals("Land")){
            return new LandLogistics();
        }
        else if(type.equals("Air")){
            return  new AirLogistics();
        } else if (type.equals("Water")) {
            return new AirLogistics();

        }
        return null;
    }
}


class Factory_Test{
    public static void main(String[] args) {
        Factory factory=new Factory();
        Logistics logistics=factory.createLogistics("Land");
        logistics.Trasport();
    }
}