import java.util.Scanner;

// Classe criada por Nicollas de Oliveira
// Responsável por executar as ações do Tamagotchi com base em suas vontades
public class TamagotchiDesejo {

    Scanner entrada = new Scanner(System.in); // Scanner para entrada de dados do usuário

    // Método que decide aleatoriamente o desejo do Tamagotchi e executa a ação correspondente
    public void desejo(Tamagotchi tama) {

        // Mostra o status atual do Tamagotchi antes de realizar qualquer ação
        System.out.println("\nSTATUS FINAL:");
        System.out.println("Idade: " + tama.idade);
        System.out.println("Peso: " + tama.peso);
        System.out.println("Vezes sem dormir: " + tama.vezesSemDormir);
        System.out.println("--------------------------\n");

        // Sorteia o desejo: 0 = sono, 1 = fome, 2 = tédio
        int vontade = (int) (Math.random() * 3);

        // Verifica se ele já ficou acordado 5 vezes seguidas e dorme automaticamente
        if(tama.vezesSemDormir >= 5){
            System.out.println("O Tamagotchi ficou acordado por 5 vezes e dormiu automaticamente!");
            tama.vezesSemDormir = 0;
            tama.idade++;
            return; // Encerrar o método depois de dormir automaticamente
        }

        // Verifica se atingiu o limite de idade e morre de velhice
        if (tama.idade >= 15) {
            System.out.println("O Tamagotchi está muito velho e não quer fazer nada!");
            System.exit(0);
        }

        // SONO
        if (vontade == 0) {
            System.out.println("O Tamagotchi está com SONO!");
            System.out.println("O que você quer fazer ?");
            System.out.println("1 - Colocar para dormir");
            System.out.println("2 - Deixar acordado");

            int escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("O Tamagotchi foi dormir!");
                    tama.vezesSemDormir = 0;
                    tama.idade++;
                    System.out.println("O Tamagotchi dormiu por 8 horas e acordou feliz!");
                    break;
                case 2:
                    System.out.println("O Tamagotchi não foi dormir!");
                    tama.vezesSemDormir++;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        // FOME
        } else if (vontade == 1) {
            System.out.println("O Tamagotchi sente fome!");
            System.out.println("O que você quer fazer ?");
            System.out.println("1 - Comer Muito ");
            System.out.println("2 - Comer Pouco");
            System.out.println("3 - Não comer nada");

            int escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("O Tamagotchi comeu muito!");
                    tama.peso += 5;
                    System.out.println("O Tamagotchi engordou 5kg e agora está feliz!");
                    break;
                case 2:
                    System.out.println("O Tamagotchi comeu pouco!");
                    tama.peso += 1;
                    System.out.println("O Tamagotchi engordou 1kg e agora está feliz!");
                    break;
                case 3:
                    System.out.println("O Tamagotchi não comeu nada!");
                    tama.peso -= 2;
                    System.out.println("O Tamagotchi emagreceu 2kg e agora está triste!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        // TÉDIO
        } else {
            System.out.println("O Tamagotchi está entediado!");
            System.out.println("O que você quer fazer ?");
            System.out.println("1 - Correr 10 minutos");
            System.out.println("2 - Caminhar 10 minutos");

            int escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("O Tamagotchi correu, emagreceu 4kg e agora quer comer MUITO!");
                    tama.peso -= 4;  // Emagrece com corrida
                    tama.peso += 5;  // Come muito automaticamente após correr
                    break;
                case 2:
                    System.out.println("O Tamagotchi caminhou, emagreceu 1kg e está com fome.");
                    tama.peso -= 1;  // Emagrece com caminhada
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        // Verificação de morte por peso após a ação
        if (tama.peso <= 0) {
            System.out.println("O Tamagotchi está muito magro e morre desnutrido!");
            System.exit(0);
        } else if (tama.peso >= 20) {
            System.out.println("O Tamagotchi está muito gordo e explode!");
            System.exit(0);
        }
    }
}
