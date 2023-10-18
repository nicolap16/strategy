public class MallardDuck extends Duck {

  public MallardDuck(){
    // These instance variables are inherited from Duck
    // When performQuack() is called, the responsibility for the quack is delegated to the Quack object
    quackBehaviour = new Quack();
    flyBehaviour = new FlyWithWings();
  }

  public void display(){
    System.out.println("I'm a real Mallard duck");
  }

}
