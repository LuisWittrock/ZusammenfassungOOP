public class Stack
{
    private int size;
    private int[] array;

    public Stack()
    {
        size = 0;
        array = new int[1];
    }
    public boolean isEmpty()
    {
        if(size == 0) return true;
        return false;
    }

    public int peek()
    {
        if(isEmpty()) return -1;
        return array[size - 1]; 
    }

    public void push(int value)
    {
        if(size == array.length) resizeArray();

        size++;
        array[size] = value;
    }

    public void resizeArray()
    {
        int[] newArray = new int[array.length * 2]; // neuer Array wird erstellt mit doppelter laenge
        for(int i = 0; i < array.length; i++) //alle werte des alten arrays werden in den neuen gespeichert
        {
            newArray[i] = array[i];
        }
        array = newArray; //alter array wird gleich dem neuen gesetzt, da array eine globale und newArray eine lokale variable ist
    }

    public void pop()
    {
        if(!isEmpty()) size--; 
    }
}