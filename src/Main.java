public class Main {
    public static void main(String[] args) {
        System.out.println("Classe Alimentos");
        Alimentos alimento1 = new Alimentos("Pepino", 2.0, 0.8);
        System.out.println(alimento1.toString());
        Alimentos alimento2 = new Alimentos("Abobrinha", 0.6);
        alimento2.calcularPreco(0.6);
        System.out.println(alimento2.toString());

        System.out.println("Classe Carnes");
        Carnes carne1 = new Carnes("Picanha", 10.0, 2, "Swift", "Bovino", 4);
        System.out.println(carne1.toString());
        Carnes carne2 = new Carnes("Frango", 20.0, 2.7, "Friboi", "ave");
        carne2.calcularPreco(2.7, 4.0);
        System.out.println(carne2.toString());

        System.out.println("Classe frutas");
        Frutas fruta1 = new Frutas("Tomate", 10, 2.2, "EUA", "Pequeno", "Verde");
        System.out.println(fruta1.toString());          
        Frutas fruta2 = new Frutas("Melancia", 12, 13.4, "Brasil", "Grande");
        fruta2.calcularPreco(13.4);
        System.out.println(fruta2.toString());
    }
}