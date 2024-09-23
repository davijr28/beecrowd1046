import java.util.Scanner;

public class Beecrowd1046 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        int start, end;
        String sequencia;
        String[] partes;

        //ler a sequência
        sequencia = leitor.nextLine();
        partes = sequencia.split(" ");

        //atribuir valor às variáveis
        start = Integer.parseInt(partes[0]);
        end = Integer.parseInt(partes[1]);

        //verificar valores e mostrar resultado no console
        if (start > end) {
            System.out.printf("O JOGO DUROU %d HORA(S)%n", 24 - start + end);
        } else if (start < end) {
            System.out.printf("O JOGO DUROU %d HORA(S)%n", end - start);
        } else {
            System.out.printf("O JOGO DUROU 24 HORA(S)%n");
        }
    }
}
