//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro ("Black", 1, "002");
        perro.moverse();
        perro.comunicarse();

        Gato gato = new Gato ("Teodoro", 6,"001");
        gato.moverse();
        gato.comunicarse();

    }
}