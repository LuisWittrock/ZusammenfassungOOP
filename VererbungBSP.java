public class Animal {
  private String name;
  private int age;
  private int weight;
 
  public void setName(String name) {
    this.name = name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setWeight(int weight) {
    this.weight = weight;
  } 

  public void kaka() {
    System.out.println("kaka");
    this.weight -= 3;
  }
 
}

public class Dog extends Animal {
  

  public void bark() {
    System.out.println("wuff");
  }
}

public class Cat extends Animal {


  public void purr() {
    System.out.println("purr");
  }
}

public class LittleDog extends Dog {

  @Override //ueberschreibt die bark methode von der Dog klasse kann aber auch auf alle methoden der Animal klasse zugreifen.
  public void bark() {
    System.out.println("nervigeres wuff");
  }
}

public class Main {

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.setName("Hund");
  }
}
 
