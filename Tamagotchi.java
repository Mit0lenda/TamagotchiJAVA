// Classe criada por Nicollas de Oliveira
// Representa um Tamagotchi com atributos de nome, idade, peso e controle de sono
class Tamagotchi {

    // Atributos principais do Tamagotchi
    String nome;
    int idade;
    int peso;
    int vezesSemDormir;

    // Construtor da classe que inicializa os atributos do Tamagotchi
    public Tamagotchi(String nome, int idade, int peso, int vezesSemDormir) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.vezesSemDormir = vezesSemDormir;
    }

    // Método que exibe os dados atuais do Tamagotchi no console
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " dias");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Vezes sem dormir: " + vezesSemDormir);
    }

    // Método que retorna o humor atual do Tamagotchi com base no peso, idade e cansaço
    public String definirHumor() {
        if (peso <= 2 || vezesSemDormir >= 4) {
            return "triste";
        } else if (peso >= 18 || idade >= 13) {
            return "bravo";
        } else {
            return "feliz";
        }
    }
}
