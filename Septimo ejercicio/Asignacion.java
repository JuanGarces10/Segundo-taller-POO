public class Asignacion {
    private Empleado empleado;
    private Proyecto proyecto;

    public Asignacion(Empleado empleado,Proyecto proyecto){
        this.empleado = empleado;
        this.proyecto = proyecto;
    }

    public void mostrarAsignacion(){
        System.out.println(empleado.getNombre() + "Es usuario esta asignado a este proyecto: " + proyecto.getNombre() );
    }
}
