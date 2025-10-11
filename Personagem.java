import java.util.Scanner;

public class Personagem { /*
    * Ranking dos ninjas
    * Genin
    * Chuunin
    * Jonin
    * 
    * *Solicitar os dados do primeiro ninja (Personagem - Naruto)
    *nome
    *nível de poder
    *número de missões
    * *Condições
    *
    *Repete o processo para o segundo ninja (Personagem - Rock Lee)
    *Exibir resultado final - Comparando o nível dos ninjas
    *fechar o Scanner
    *
    * Onjetivo: Criar classe e criar condições utilizando o nivelPoder e numeroDeMissoes
    */

    public static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in);

        // Ninja 1

        System.out.println(" *** Cadastro do Ninja 1 *** \n");
        System.out.println("Nome do Ninja: ");
        String nome1 = caixaDeTexto.nextLine();

        System.out.println("Idade do Ninja: ");
        int idade1 = caixaDeTexto.nextInt();

        System.out.println("Nível de Poder: ");
        int nivelPoder1 = caixaDeTexto.nextInt();

        System.out.println("Número de Missões: ");
        int missoes1 = caixaDeTexto.nextInt();

        String ranking1;

        if (missoes1 == 10 && nivelPoder1 > 15) {
            ranking1 = "Chuunin";
        } else if (missoes1 >= 20) {
            ranking1 = "Jonin";
        } else {
            ranking1 = "Genin";
        }

        System.out.println("\n *** Resultado do Ninja 1 *** \n");

        System.out.println("Nome: " + nome1);
        System.out.println("Idade: " + idade1);
        System.out.println("Nível de Poder: " + nivelPoder1);
        System.out.println("Missões: " + missoes1);
        System.out.println("Ranking: " + ranking1);
        System.out.println("\n-----------------------\n");
            
        caixaDeTexto.nextLine(); // Consumir a quebra de linha pendente

        // Ninja 2

        System.out.println(" *** Cadastro do Ninja 2 *** \n");
        System.out.println("Nome do Ninja: ");
        String nome2 = caixaDeTexto.nextLine();

        System.out.println("Idade do Ninja: ");
        int idade2 = caixaDeTexto.nextInt();

        System.out.println("Nível de Poder: ");
        int nivelPoder2 = caixaDeTexto.nextInt();

        System.out.println("Número de Missões: ");
        int missoes2 = caixaDeTexto.nextInt();

        String ranking2;

        if (missoes2 == 10 && nivelPoder2 > 15) {
            ranking2 = "Chuunin";
        } else if (missoes2 >= 20) {
            ranking2 = "Jonin";
        } else {
            ranking2 = "Genin";
        }   

        System.out.println("\n *** Resultado do Ninja 2 *** \n");

        System.out.println("Nome: " + nome2);
        System.out.println("Idade: " + idade2);
        System.out.println("Nível de Poder: " + nivelPoder2);
        System.out.println("Missões: " + missoes2);
        System.out.println("Ranking: " + ranking2);
        System.out.println("\n-----------------------\n");

        // Comparação entre os ninjas

        System.out.println(" *** Comparação entre os Ninjas *** \n");

        if (nivelPoder1 > nivelPoder2) {
            System.out.println("O ninja " + nome1 + " é mais forte que o ninja " + nome2);
        } else if (nivelPoder2 > nivelPoder1) {
            System.out.println("O ninja " + nome2 + " é mais forte que o ninja " + nome1);
        } else {
            System.out.println("Os ninjas " + nome1 + " e " + nome2 + " possuem o mesmo nível de poder");
        }

        System.out.println("\n-----------------------\n");

        caixaDeTexto.close();
    }    
}

