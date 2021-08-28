public class Atleta {
    //variables de clase
    private static int contadora=0;

    //variables de instancia
    private int id;
    private String nombre;

    public Atleta(String nombre) {
        contadora++;
        this.id = contadora;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
