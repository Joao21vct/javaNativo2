public class Frutas extends Alimentos {
    private String paisOrigem;
    private String tamanho;
    private String cor;

    public Frutas(String nome, double preco, double peso, String paisOrigem, String tamanho, String cor) {
        super(nome, preco, peso);
        this.paisOrigem = paisOrigem;
        this.tamanho = tamanho;
        this.cor = cor;
    }
    public Frutas(String nome, double preco, double peso, String paisOrigem, String cor) {
        super(nome, preco, peso);
        this.paisOrigem = paisOrigem;
        this.cor = cor;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }
    public String getTamanho() {
        return tamanho;
    }
    public String getCor() {
        return cor;
    }

    public void calcularPreco(double pesoKg){
        if (cor == "verde"){
            setPreco(pesoKg * 2.1);
        }
        else{
            setPreco(pesoKg * 2.3);
        }
    }
    public String toString(){
        return "Nome: " + getNome() + " Preço: " + getPreco() + " Peso: " + getPeso() + " Pais: " + getPaisOrigem() + " Tamanho: " + getTamanho() + " Cor: " + getCor();
    }
}
