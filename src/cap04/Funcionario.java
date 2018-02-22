package cap04;

public class Funcionario {

    private String nome;

    private double salario;

    private Cargo cargo;

    public Funcionario(String nome, double salario, Cargo cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public static class CalculadoraDeSalario {


        public double calculaSalario(Funcionario funcionario) {

            if ( funcionario.getCargo().equals(Cargo.DESENVOLVEDOR )) {

                if ( funcionario.getSalario() > 3000) return 3200.0;

                return 1350.0;
            }

            return 425.0;
        }
    }
}
