package proxypila;

/**
 *
 * @author grover
 */
public class Pila{
    private int []array;
    private int tope;
    
    public Pila(){
        this.tope = 0;
        this.array = new int[10];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }
}