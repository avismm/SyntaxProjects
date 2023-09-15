package Class22Interfaces;

//multiple inheritance, easier abstraction. Apply contracts across multiple classes
public interface MoveAble {
    void move();
    void method1();
}

interface WashAble {
    //interface methods have nobody.
    void wash();
    void method1();

}
class Dog implements MoveAble, WashAble {
    public void move(){
        System.out.println("Dogs can jump, run and can move");
    }

    @Override
    public void wash() {

    }

    @Override
    public void method1() {

    }
}
class Car implements MoveAble {

    @Override
    public void move() {
        System.out.println("Dogs can jump, run and can move");
    }

   @Override
   public void method1() {

    }
}