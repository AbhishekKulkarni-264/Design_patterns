package Structural;

interface Shape{
    void draw();
}

class circle implements  Shape{

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}

class square implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing square");
    }
}

class Facade {
    circle c;
    square s;

    Facade(){
        c=new circle();
        s=new square();
    }

    void drawCircle(){
        c.draw();
    }
    void drawSquare(){
        s.draw();
    }
}

class main{
    public static void main(String[] args) {
    Facade f=new Facade();
    f.drawCircle();
    f.drawSquare();
    }
}