public class Carnes extends Alimentos {
    private String marca;
    private String tipoCarne;
    private double desconto;


    public Carnes(String nome, double preco, double peso, String marca, String tipoCarne, double desconto) {
        super(nome, preco, peso);
        this.marca = marca;
        this.tipoCarne = tipoCarne;
        this.desconto = desconto;
    }
    public Carnes(String nome, double preco, double peso, String marca, String tipoCarne) {
        super(nome, preco, peso);
        this.marca = marca;
        this.tipoCarne = tipoCarne;
    }

    public String getMarca() {
        return marca;
    }
    public String getTipoCarne() {
        return tipoCarne;
    }
    public double getDesconto() {
        return desconto;
    }

    public void calcularPreco(double pesoKg){
        if (tipoCarne == "ave"){
            setPreco(pesoKg * 2.3);
        }
        else if(tipoCarne == "bovino"){
            setPreco(pesoKg * 2.5);
        }
        else{
            setPreco(pesoKg * 2.1);
        }
    }
    public void calcularPreco(double pesoKg, double desconto){
        if (tipoCarne == "ave"){
            setPreco(pesoKg * 2.3 - desconto);
        }
        else if(tipoCarne == "bovino"){
            setPreco(pesoKg * 2.5 - desconto);
        }
        else{
            setPreco(pesoKg * 2.1 - desconto);
        }
    }
    public String toString(){
        return "Nome: " + getNome() + " Preço: " + getPreco() + " Peso: " + getPeso() + " Marca: " + getMarca() + " Tipo da carne: " + getTipoCarne() + " Desconto: " + getDesconto();
    }
}
