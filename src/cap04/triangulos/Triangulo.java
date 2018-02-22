package cap04.triangulos;

public class Triangulo {

    private double ladoX;

    private double ladoY;

    private double ladoZ;

    public Triangulo(double ladoX, double ladoY, double ladoZ) {
        this.ladoX = ladoX;
        this.ladoY = ladoY;
        this.ladoZ = ladoZ;
    }

    public double getLadoX() {
        return ladoX;
    }

    public double getLadoY() {
        return ladoY;
    }

    public double getLadoZ() {
        return ladoZ;
    }
}
