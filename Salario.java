
public class Salario {

    @SuppressWarnings("unused")
	private int senha;
    private double salario;

    // Constructor to initialize the fields
    public Salario(int senha, double salario) {
        this.senha = senha;
        this.salario = salario;
    }

    // Method to get the bonus
    public double getBonificacao() {
        return this.salario * 0.15;
    }

    // Method to set the password
    public void setSenha(int senha) {
        this.senha = senha;
    }
}