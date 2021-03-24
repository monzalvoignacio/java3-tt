
public class Main {
    public static void main(String[] args) {
        Precedable a = new Persona("Juan", 1);
        Precedable b = new Persona("Maria", 43);
        Precedable c = new Persona("Nacho", 22);
        Precedable d = new Persona("Carlos", 55);
        Precedable e = new Persona("Pedro", 34);

        Precedable ca = new Celular(1, "Juan");
        Precedable cb = new Celular(54, "Maria");
        Precedable cc = new Celular(34, "Nacho");
        Precedable cd = new Celular(67, "Carlos");
        Precedable ce = new Celular(2,"Pedro");

        Precedable personas[] = new Precedable[5];
        personas[0] = a;
        personas[1] = b;
        personas[2] = c;
        personas[3] = d;
        personas[4] = e;

        SortUtils.ordenar(personas);
        for (Precedable p:personas) {
            System.out.println(((Persona)p).getCi());
        }

    }
}
