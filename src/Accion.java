public class Accion {
    private final int id;
    private final String descripcion;

    public Accion(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Accion(id=" + id + ", descripcion='" + descripcion + "')";
    }
}
