public class Persona implements Precedable<Persona> {
    private String nombre;
    private int ci;

    public Persona(String nombre, int ci) {
        this.nombre = nombre;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    @Override
    public int precedeA(Persona persona) {
        if((this.ci - persona.getCi()) <= 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
