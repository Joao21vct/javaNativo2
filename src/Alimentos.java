public class Alimentos {
    private String nome;
    private double preco;
    private double peso;

    public Alimentos(String nome, double preco, double peso) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
    }
    public Alimentos(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public double getPeso() {
        return peso;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void calcularPreco(double pesoKg){
        this.preco = pesoKg * 2.1;
    }
    public String toString(){
        return "Nome: " + getNome() + " Preço: " + getPreco() + " Peso: " + getPeso();
    }
}
