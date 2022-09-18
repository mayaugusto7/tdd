package cap07_coesao.abstracao;

public class DezOuVintePorCento extends RegraDeCalculo {

    @Override
    double porcentagemAcimaDoLimite() {
        return 0.8;
    }

    @Override
    double limite() {
        return 3000;
    }

    @Override
    double porcentagemBase() {
        return 0.9;
    }
}
