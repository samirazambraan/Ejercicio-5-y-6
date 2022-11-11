import java.util.Scanner;
public class mainejcinco{
    public static void main(String[] args) {
        ejcinco ej5 = new ejcinco();
        Scanner sc = new Scanner(System.in);
        System.out.println("inrgese numeroosososososo");
        for (int i = 0; i < 10; i++) {
            ej5.setNumerosdelarray(sc.nextInt() , i);
        }
        System.out.print("ARRAY: ");
        ej5.mostrarArray();
        System.out.println("\n");
        System.out.println("media de indices pares: " + ej5.mediaIndicepar());
        System.out.println("Media indice impar: " + ej5.mediaIndiceImpar());
    }
}
