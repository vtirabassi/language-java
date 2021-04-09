package comparators;

public class Estudante implements Comparable<Estudante>{

    public Estudante(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    private String nome;
    private Integer idade;

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(Estudante estudante) {
        return this.getIdade() - estudante.getIdade();
    }
}
