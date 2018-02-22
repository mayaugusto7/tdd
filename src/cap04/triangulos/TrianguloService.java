package cap04.triangulos;

public class TrianguloService {

    public String validarTriangulo(Triangulo triangulo) {

        if (isTriangulo(triangulo)) {

            if (isEquilatero(triangulo))
                return TipoTriangulo.EQUILATERO.name();
            else if (isIsoceles(triangulo))
                return TipoTriangulo.ISOCELES.name();
            else
                return TipoTriangulo.ESCALENO.name();

        }

        return "Nao e triangulo";
    }

    private boolean isTriangulo(Triangulo triangulo) {
       return (triangulo.getLadoX() < triangulo.getLadoY() + triangulo.getLadoZ()) &&
                (triangulo.getLadoY() < triangulo.getLadoX() + triangulo.getLadoZ()) &&
                (triangulo.getLadoZ() < triangulo.getLadoX() + triangulo.getLadoY());
    }

    private boolean isIsoceles(Triangulo triangulo) {
        return  triangulo.getLadoX() == triangulo.getLadoY() || triangulo.getLadoX() == triangulo.getLadoZ() ||
                triangulo.getLadoY() == triangulo.getLadoZ();
    }

    private boolean isEquilatero(Triangulo triangulo) {
        return triangulo.getLadoX() == triangulo.getLadoY()
                && triangulo.getLadoX() == triangulo.getLadoZ();
    }
}
