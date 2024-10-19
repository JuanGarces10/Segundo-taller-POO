public class Computadora {
    private Procesador procesador;

    public Computadora(){
        this.procesador = new Procesador();
    }
    
    public void activo(){
        procesador.procesar();
        System.out.println("Procesando...");
    }

    public void desactivado(){
        procesador.finalizar();
        System.out.println("Finalizando...");
    }
}