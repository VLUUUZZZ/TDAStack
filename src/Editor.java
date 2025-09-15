import java.util.Stack;

public class Editor {
    private final Stack<Accion> historial;

    public Editor() {
        this.historial = new Stack<>();
    }

    public void agregarAccion(Accion accion) {
        historial.push(accion);
        System.out.println("Acción agregada: " + accion);
    }

    public void deshacerUltimaAccion() {
        if (historial.isEmpty()) {
            System.out.println("No hay acciones para deshacer.");
            return;
        }
        Accion accionDeshecha = historial.pop();
        System.out.println("Acción deshecha: " + accionDeshecha);
    }

    public void mostrarProximaAccion() {
        if (historial.isEmpty()) {
            System.out.println("No hay más acciones en la pila.");
            return;
        }
        System.out.println("Próxima acción a deshacer: " + historial.peek());
    }

    public void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("El historial está vacío.");
            return;
        }
        System.out.println("Historial de acciones: " + historial);
    }
}
