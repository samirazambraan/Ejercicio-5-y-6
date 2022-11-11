import java.util.ArrayList;
import java.util.Scanner;

public class mainejseis {
    public static void main(String[] args) {
        ejseis ej6 = new ejseis();
        ArrayList<Double> alturas = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);

        do {
            boolean salir = false;
            System.out.println("Que desea? \n [1]. Numero de almunos \n [2]. leer alturas \n [3]. Calcular medias \n [4]. Mostrar resultados \n [5]. salir");
            int accion = sc.nextInt();
            switch (accion) {
                case 1:
                    System.out.println("nro de alumnos: " + ej6.numeroAlumnos(alturas));    
                break;
                case 2:
                    System.out.println("ingrese altura");
                    Double alt = sc.nextDouble();
                    ej6.leerAlturas(alturas, alt);
                break;
                case 3:
                    System.out.println("la media es: " + ej6.calcularMedias(alturas));
                break;
                case 4:
                    Double mediaAlt = ej6.media;
                    ej6.mostrarResultados(alturas, mediaAlt);
                break;
                case 5:
                    salir = true;
                break;
                default:
                    break;
            }


            if(salir){
                break;
            }
        } while (true);
    }
}
