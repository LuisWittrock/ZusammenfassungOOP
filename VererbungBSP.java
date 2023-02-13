class Animal {
  protected String name;
 
  public Animal(String name) {
    this.name = name;
  }
 
  public void makeSound() {
    System.out.println("Some animal sound");
  }
}
 
class Dog extends Animal {
  public Dog(String name) {
    super(name);
  }
 
  @Override
  public void makeSound() {
    System.out.println("Woof");
  }
}
