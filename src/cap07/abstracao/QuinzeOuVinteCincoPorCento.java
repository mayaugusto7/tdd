package cap07.abstracao;

import cap07.Funcionario;

public class QuinzeOuVinteCincoPorCento extends RegraDeCalculo {

    @Override
    double porcentagemAcimaDoLimite() {
        return 0.85;
    }

    @Override
    double limite() {
        return 2500;
    }

    @Override
    double porcentagemBase() {
        return 0.75;
    }
}
