public abstract class Duck {
  // Declare two reference variables that implement behaviour interfaces
  // These variables are not objects, but rather pointers to objects that use those behaviour interfaces
  FlyBehaviour flyBehaviour;
  QuackBehaviour quackBehaviour;

  // What is this?
  public Duck(){} 

  public abstract void display ();

  public void performFly(){
    flyBehaviour.fly();
  }

  public void performQuack(){
    quackBehaviour.quack();
  }

  public void swim(){
    System.out.println("All ducks float, even decoys!");
  }

  public void setFlyBehaviour(FlyBehaviour fb){
    flyBehaviour = fb;
  }

  public void setQuackBehaviour(QuackBehaviour qb){
    quackBehaviour = qb;
  }
  
}