package Main;


public class producto {

    String nombre;
    double precio;

    public producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Main.producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public double calcular(int cantidadDeProductos){
       return (cantidadDeProductos * precio);

    }
}
