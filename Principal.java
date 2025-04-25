// Classe criada por Nicollas de Oliveira
// Classe principal responsável por simular a vida do Tamagotchi em loop contínuo
public class Principal {
    public static void main(String[] args){

        // Cria um novo Tamagotchi com nome, idade inicial 0, peso inicial 1, e 0 vezes sem dormir
        Tamagotchi tamagotchiNico = new Tamagotchi("Nicollas", 0, 1, 0);

        // Exibe os dados iniciais do Tamagotchi
        tamagotchiNico.mostrarDados();

        // Instancia o controlador de desejos do Tamagotchi
        TamagotchiDesejo desejoNico = new TamagotchiDesejo();

        // Executa a primeira ação antes do loop (opcional)
        desejoNico.desejo(tamagotchiNico);

        // Loop infinito que simula a vida contínua do Tamagotchi
        while (true) {
            // Sorteia e executa o desejo atual do Tamagotchi (sono, fome ou tédio)
            desejoNico.desejo(tamagotchiNico);

            // Exibe o humor atual com base nos atributos reais (idade, peso, cansaço)
            System.out.println("Humor atual: " + tamagotchiNico.definirHumor());

            // Pausa de 1.5 segundos entre os ciclos, para facilitar a leitura no console
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println("Erro de pausa ");
            }
        }
    }
}
