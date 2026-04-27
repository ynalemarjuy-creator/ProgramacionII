import java.util.ArrayList;

public class Pelicula {

    private String nombre;
    private int duracion; 
    private String categoria;
    ArrayList<String> actores = new ArrayList<>();

    public Pelicula(String nombre, int duracion, String categoria) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.categoria = categoria;
    }
    public Pelicula(){

    }
    public void addActor(String x){
        this.actores.add(x);
    }
    

    public String getCategoria(){
        return categoria;
    }
    public void cambiarCategoria(String nuevaCategoria) {
        categoria = nuevaCategoria;
    }

    public void mostrarDuracion() {
        int h = 0;
        int m = 0;
        h = this.duracion/60;
        m= this.duracion%60;
        System.out.println("Duración: " + h + " horas y " + m + " minutos");
    }

}

