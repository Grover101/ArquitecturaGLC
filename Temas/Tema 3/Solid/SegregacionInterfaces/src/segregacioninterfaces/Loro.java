package segregacioninterfaces;

public class Loro implements IAve, IAveVoladora {

    @Override
    public void comer() {
        System.out.println("Esta comiendo");
    }

    @Override
    public void volar() {
        System.out.println("Esta volando");
    }

}
