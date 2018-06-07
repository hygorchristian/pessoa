import java.io.Serializable;

public class Pessoa implements Serializable{

    private static final long serialVersionUID = 1L;

    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }

    //Método que checa se todos os atributos estão preenchidos
    public boolean isPreenchido(){
        return this.altura != 0 && this.idade != 0 && this.peso != 0 && this.nome != null;
    }
}
