import java.util.Scanner;

public class Pizzaria {

    public void diaDeHoje() {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Que dia é hoje?");
        int diaDehj = prompt.nextInt();

        // Verificação para os dias pares
        if (diaDehj % 2 == 0) {
            if (diaDehj <= 10) {
                System.out.println("Hoje tem calabresa");
            } else if (diaDehj <= 20) {
                System.out.println("Hoje tem peperoni");
            } else if (diaDehj <= 30) {
                System.out.println("Acabou minha motivação de fazer pizza");
            }
        }
        // Verificação para os dias ímpares
        else {
            if (diaDehj <= 10) {
                System.out.println("Hoje tem banana");
            } else if (diaDehj <= 20) {
                System.out.println("Hoje tem Nutella");
            } else if (diaDehj <= 30) {
                System.out.println("Hoje é dia de pizza de chocolate");
            }
        }
    }
}
