import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libros> libros = new ArrayList<>();

    public void agregar(Libros libro){
        libros.add(libro);
    }
    
    public void mostrarLibro(){
        for(Libros libro : libros){
            System.out.println(libro.getNombre());
        }
    }
}