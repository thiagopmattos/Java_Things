import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("12345",5674,2000,true);
        Conta conta2 = new Conta("12098",1627,2500,false);

        conta1.mostrarAtributos();
        conta2.mostrarAtributos();

    }


}

