public class Perro extends Animal {

    private String codigoPerro;

    public Perro(String nombre, int edad, String codigoPerro) {
        super(nombre, edad);
        this.codigoPerro = codigoPerro;
    }

    @Override
    public void moverse(){
        System.out.println("El perro" +getNombre() + " se mueve");
    }

    @Override
    public void comunicarse(){
        System.out.println("Guau!");
    }


}
