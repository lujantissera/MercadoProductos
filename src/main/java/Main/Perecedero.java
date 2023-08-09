package Main;

public class Perecedero extends producto {

    public Perecedero(String nombre, double precio, int diasPorcaducar) {
        super(nombre, precio);
        this.diasPorcaducar = diasPorcaducar;
    }

    @Override
    public double calcular(int cantidadDeProductos) {
        double precioBase = super.calcular(cantidadDeProductos);
        switch (diasPorcaducar) {
            case 1:
                precioBase = (precio - 4);
                break;
            case 2:
                precioBase = (precio - 3);
                break;
            case 3:
                precioBase = (precio / 2 );
                break;

        }
        return precioBase;
    }

    int diasPorcaducar;


    @Override
    public String toString() {
        return "Main.Perecedero{" +
                "diasPorcaducar=" + diasPorcaducar +
                '}';
    }

    public int getDiasPorcaducar() {
        return diasPorcaducar;
    }

    public void setDiasPorcaducar(int diasPorcaducar) {
        this.diasPorcaducar = diasPorcaducar;
    }


}
