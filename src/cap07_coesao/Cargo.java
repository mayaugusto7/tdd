package cap07_coesao;

import cap07_coesao.abstracao.DezOuVintePorCento;
import cap07_coesao.abstracao.QuinzeOuVinteCincoPorCento;
import cap07_coesao.abstracao.RegraDeCalculo;

public enum Cargo {
    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new QuinzeOuVinteCincoPorCento()),
    TESTADOR(new QuinzeOuVinteCincoPorCento());

    private final RegraDeCalculo regraDeCalculo;

    Cargo(RegraDeCalculo regraDeCalculo) {
        this.regraDeCalculo = regraDeCalculo;
    }

    public RegraDeCalculo getRegraDeCalculo() {
        return regraDeCalculo;
    }
}
