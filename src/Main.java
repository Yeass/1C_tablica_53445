import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] tab = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int licznik = 0;

        System.out.println("Przed: ");
        System.out.println(Arrays.toString(tab));
        for (int j = 1; j < tab.length; j++) {
            for (int i = 0; i < tab.length - j; i++) {
                if (tab[i] > tab[i + 1]) {
                    int wieksza = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = wieksza;
                    licznik++;
                }
                licznik++;
            }
            licznik++;
        }
        System.out.println("Po: ");
        System.out.println(Arrays.toString(tab));
        System.out.println("Liczba operacji: " + licznik);
    }
}