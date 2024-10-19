public class Perro extends Animal{
    @Override
    public void nacer(){
        System.out.println("El perro nace");
    }

    public void crecer(){
        System.out.println("El perro crece");
    }

    public void reproducirse(){
        System.out.println("El perro se reproduce");
    }

    public void mueren(){
        System.out.println("El perro muere");
    }
}
