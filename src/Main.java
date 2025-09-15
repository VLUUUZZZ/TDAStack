public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();

        System.out.println("--- Agregando acciones ---");
        editor.agregarAccion(new Accion(1, "Escribir título"));
        editor.agregarAccion(new Accion(2, "Escribir párrafo"));
        editor.agregarAccion(new Accion(3, "Borrar párrafo"));

        System.out.println("\n--- Deshacer acción ---");
        editor.deshacerUltimaAccion();

        System.out.println("\n--- Revisar próxima acción ---");
        editor.mostrarProximaAccion();

        System.out.println("\n--- Mostrar historial ---");
        editor.mostrarHistorial();
    }
}
