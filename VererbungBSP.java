public class Animal //oberklasse 
{
  private String name; //private Variablen koennen nur aus der eigenen Klasse veraendert werden.
  private int age;  //diese variablen sind in der ganzen klasse zugreifbar
  private int weight;
 
  public void setName(String name) //die variablen, die hinter einer methode in den klammern stehen sind nur innerhalb der Methode verfuegbar
  {
    this.name = name;
  }
  public void setAge(int age) 
  {
    this.age = age;
  }
  public void setWeight(int weight) 
  {
    this.weight = weight;
  } 

  public void kaka() //jedes tier muss mal auf klo also ist diese funktion allgemein
  {
    System.out.println("kaka");
    this.weight -= 3;
  }
 
}

public class Dog extends Animal //unterklasse
{
  public void bark() //nur der hund bellt, weswegen diese methode nur in der Hundeklasse spezifiziert wird
  {
    System.out.println("wuff");
  }
}

public class Cat extends Animal 
{

  public Cat(String name) //Konstruktor wird bei jedem erstellen eines neuen Objekts der Klasse Cat automatisch augerufen.
  {
    setName(name);
  }

  public void purr() {
    System.out.println("purr");
  }
}

public class LittleDog extends Dog //der kleine Hund kann was der hund kann allerdings ist sein belen nerviger wesewegen diese methode ueberschrieben wird
{
  @Override //ueberschreibt die bark methode von der Dog klasse kann aber auch auf alle methoden der Animal klasse zugreifen.
  public void bark() {
    System.out.println("nervigeres wuff");
  }
}

public class Main 
{
  public static void main(String[] args) {
    Dog dog = new Dog(); //neues objekt der klasse dog wird erstellt

    //so wird auf methoden eines objektes/klasse zugegriffen.
    dog.setName("Doggo");    

    dog.bark();
    dog.kaka();
    dog.setAge(3);
  }
}
 
