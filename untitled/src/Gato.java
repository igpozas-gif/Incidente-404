public class Gato extends Animal {

    private String codigoGato;

    public Gato(String nombre, int edad, String codigoGato) {
        super(nombre, edad);
        this.codigoGato = codigoGato;
    }

    @Override
    public void moverse(){
        System.out.println("El gato" + getNombre() + " se mueve");
    }

    @Override
    public void comunicarse(){
        System.out.println("Miau!");
    }

}
