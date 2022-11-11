import java.util.ArrayList;

public class ejseis {
     
    public void leerAlturas(ArrayList<Double> array, double alt){ //metodo para recibir alturas y guardarlas en el arraylist
        array.add(alt);
    }

    public int numeroAlumnos(ArrayList<Double> array){
        int n;
        n = array.size();
        return n;
    }

    Double media;

    public Double calcularMedias(ArrayList<Double> array){
        
        Double suma = 0.0;
        for (int i = 0; i < array.size(); i++) {
            suma += array.get(i);
        }
        media = suma / array.size();
        return media;
    }

    public void mostrarResultados(ArrayList<Double> array, Double media){
        int superioes = 0;
        int inferiores = 0;
        System.err.println("alturas: ");
        for (int i = 0; i < array.size(); i++) {
            System.out.print("[" + array.get(i) + "]");
            if (array.get(i) > media) {
                superioes++;
            }else{
                inferiores++;
            }
        }
        System.out.println("\n");
        System.out.println("superiores a la media: " + superioes);
        System.err.println("inferiores a la media: " + inferiores);

    }

}
