package Main;
 public class NoPerecedero {
    String tipo;

    public NoPerecedero(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Main.NoPerecedero{" +
                "tipo='" + tipo + '\'' +
                '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    public double calcular(int cantidadDeProductos){

        return (cantidadDeProductos * precio);

    }



   }

