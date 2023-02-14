public class Person
{
    private String vorname;
    private String nachname;

    public Person(String vorname, String nachname)
    {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVollenNamen()
    {
        return vorname + " " + nachname;
    }
}

public class Angestellter extends Person
{
    private int angestelltenID;
    private int gehalt;

    public Angestellter(String vorname, String nachname, int angestelltenID, int gehalt)
    {
        super(vorname, nachname); 
        this.angestelltenID = angestelltenID;
        this.gehalt = gehalt;
    }

    public void getInfo()
    {
        System.out.println("Name: " + getVollenNamen());
        System.out.println("ID: " + angestelltenID);
        System.out.println("Gehalt: " + gehalt);
    }
}
