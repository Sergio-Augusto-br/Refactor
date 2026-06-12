public class Carro {
    public String modelo;
    public int ano;
    public double preco;

    // 1. Construtor Padrão (sem parâmetros)
    public Carro() {
        this.modelo = "Desconhecido";
        this.ano = 2026;
        this.preco = 0.0;
    }

    // 2. Construtor com Parâmetros
    public Carro(String modelo, int ano, double preco) {
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    // 3. Construtor reaproveitando outro (Encadeamento)
    public Carro(String modelo) {
        this(modelo, 2026, 30000.0); // Chama o construtor com 3 parâmetros
    }

    public static void main(String[] args) {
        // Instanciação usando os diferentes construtores
        Carro carro1 = new Carro(); 
        Carro carro2 = new Carro("Sedan", 2025, 85000.00);
        Carro carro3 = new Carro("SUV"); 

        System.out.println("Carro 1: " + carro1.modelo + " - " + carro1.ano);
        System.out.println("Carro 2: " + carro2.modelo + " - " + carro2.ano);
        System.out.println("Carro 3: " + carro3.modelo + " - " + carro3.preco);
    }
}
