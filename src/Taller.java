import java.util.ArrayList;

public class Taller {

    private String nombreTaller;
    private String nombreContacto;
    private int telefono;
    private ArrayList<String> servicios;

    public Taller() {
    }

    public Taller(String nombreTaller, String nombreContacto, int telefono, ArrayList servicios) {
        this.nombreTaller = nombreTaller;
        this.nombreContacto = nombreContacto;
        this.telefono = telefono;
        this.servicios = servicios;
    }

    public String getNombreTaller() {
        return nombreTaller;
    }
    public void setNombreTaller(String nombreTaller) {
        this.nombreTaller = nombreTaller;
    }
    public String getNombreContacto() {
        return nombreContacto;}
    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;}
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public ArrayList getServicios() {
        return servicios;
    }
    public void setServicios(ArrayList servicios) {
        this.servicios = servicios;
    }

    @Override
    public String toString() {
        return  "Nombre del taller:: " + nombreTaller +
                "\nNombre de contacto " + nombreContacto +
                "\nTelefono: " + telefono +
                "\nServicios del taller: " + servicios ;
    }

    public void nombrePrecio (){
        for (int i = 1; i < servicios.size(); i++){
            System.out.println("\nTaller " + i + ": " + getNombreTaller() + " " + getTelefono());
        }
    }
}
