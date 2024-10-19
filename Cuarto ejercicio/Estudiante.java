public class Estudiante {

    private Aula estudiante_1;
    private Aula estudiante_2;

    public Estudiante( Aula estudiante_1, Aula estudiante_2){
        this.estudiante_1 = estudiante_1;
        this.estudiante_2 = estudiante_2;
    }

    public void clase(){
        estudiante_1.leer();
        estudiante_2.leer();
        System.out.println("Estudiantes leyendo");
    }
    
}