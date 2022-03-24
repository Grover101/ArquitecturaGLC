package segregacioninterfaces;

public class Pinguino implements IAve,IAveNadadora  {
    private int estatura;

    public Pinguino(int estatura) {
        this.estatura = estatura;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }
    
    @Override
    public void comer() {
               System.out.println("Esta comiendo");

    }

    @Override
    public void nadar() {
              System.out.println("Esta nadando");

    }
}
