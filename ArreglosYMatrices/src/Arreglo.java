import java.util.Arrays;

public class Arreglo {

    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5};
        int[][] lista2 = {{7, 2, 5}, {3, 1, 6}, {10, 4, 4}};
        sumarLista(lista);
        System.out.println("El mayor elemento de la matriz es: " + buscarMayor(lista2));
        System.out.println("La cantidad de vocales en la palabra es: " + cuentaVocales("Pedrito"));
        System.out.println("La cantidad de veces que se repite el caracter en la palabra es: " + cuentaCaracter("Pelele", 'e'));
    }


    public static void sumarLista(int[] lista) {
        int suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma += lista[i];
        }
        int promedio = suma / lista.length;
        System.out.println("El promedio de los elementos del arreglo es: " + promedio);
    }


    public static int buscarMayor(int[][] lista) {
        int mayor= lista[0][0];
        for (int i=0 ; i < lista.length ; i++){
            for(int j=0 ; j < lista[i].length ; j++){
                if (lista[i][j] > mayor){
                    mayor = lista[i][j];
                }
        }
    }
        return mayor;
    }

    public static int cuentaVocales(String unaPalabra){
        int contador=0;
        for(int i=0;i<unaPalabra.length();i++){
            contador+=contieneVocal(unaPalabra.charAt(i))?1:0;
        }
        return contador;
    }

    public static int cuentaCaracter (String unaPalabra, char unCaracter){
        int contador=0;
        for(int i=0; i<unaPalabra.length(); i++){
            contador+=(unaPalabra.charAt(i)==unCaracter)?1:0;
        }
        return contador;
    }

    public static boolean contieneVocal(char unCaracter){
        return unCaracter=='a' || unCaracter=='e' || unCaracter=='i' || unCaracter=='o' || unCaracter=='u' ||
               unCaracter=='A' || unCaracter=='E' || unCaracter=='I' || unCaracter=='O' || unCaracter=='U';
    }

}




