
class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    public double getBonificacao() {
        return this.salario * 0.10;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}