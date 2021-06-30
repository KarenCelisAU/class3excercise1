public class main {

    public static void main(String[] args) {
        Persona persona = new Persona("dario", 345);
        Persona personas1 = new Persona("lucas", 3);
        Persona personas2 = new Persona("maria", 3445);


        Precedable<Persona>[] personas = new Precedable[]{persona, personas1, personas2};

        SortUtil.ordenar(personas);
        SortUtil.print(personas);
        Celular c = new Celular(234, "z");
        Celular c1 = new Celular(245, "b");
        Celular c2 = new Celular(24444, "a");

//        Celular[] c = {new Celular(234, "z"), new Celular(245, "b"), new Celular(24444, "a")};
        Precedable<Celular>[] celulare = new Precedable[]{c, c1, c2};

        SortUtil.ordenar(celulare);
        SortUtil.print(celulare);

    }
}
