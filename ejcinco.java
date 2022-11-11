public class ejcinco {
    int[] a = new int[10];

    public int mediaIndicepar(){
        int suma = 0;
        for (int i = 0; i < a.length; i = i + 2) {
            suma = suma + a[i];
        }
        return suma;
    }

    public int mediaIndiceImpar(){
        int suma = 0;
        for (int i = 1; i < a.length; i = i + 2) {
            suma = suma + a[i];
        }
        return suma;
    }

    public void mostrarArray(){
        for (int i = 0; i < a.length; i++) {
            System.out.print("[" + a[i] + "]");
        }
    }

    public void setNumerosdelarray(int num, int pos){
        a[pos] = num;
    }

    
}
