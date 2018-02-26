package cap07.abstracao;

import cap07.Funcionario;

public abstract class RegraDeCalculo {

    public double calcula(Funcionario funcionario) {

        if ( funcionario.getSalario() > limite()) {
            return funcionario.getSalario() * porcentagemAcimaDoLimite();
        }

        return funcionario.getSalario() * porcentagemBase();
    }

    abstract double porcentagemAcimaDoLimite();

    abstract double limite();

    abstract double porcentagemBase();
}
