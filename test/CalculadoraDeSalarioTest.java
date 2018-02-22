import cap04.Cargo;
import cap04.Funcionario;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraDeSalarioTest {

    @Test
    public void deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite() {

        Funcionario.CalculadoraDeSalario calculadora = new Funcionario.CalculadoraDeSalario();

        Funcionario desenvolvedor = new Funcionario("Mauricio", 1500.0, Cargo.DESENVOLVEDOR);

        double salario = calculadora.calculaSalario(desenvolvedor);

        assertEquals(1500.0 * 0.9, salario, 0.00001 );
    }


    @Test
    public void deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite() {

        Funcionario.CalculadoraDeSalario calculadora = new Funcionario.CalculadoraDeSalario();

        Funcionario desenvolvedor = new Funcionario("Mauricio", 4000.0, Cargo.DESENVOLVEDOR);

        double salario = calculadora.calculaSalario(desenvolvedor);

        assertEquals(4000.0 * 0.8, salario, 0.00001 );
    }

    @Test
    public void deveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite() {

        Funcionario.CalculadoraDeSalario calculadora = new Funcionario.CalculadoraDeSalario();

        Funcionario dba = new Funcionario("Mauricio", 500.0, Cargo.DBA);

        double salario = calculadora.calculaSalario(dba);

        assertEquals(500.0 * 0.85, salario, 0.00001 );
    }
}
