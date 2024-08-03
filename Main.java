import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        //Kullanicidan aldigimiz sayiyi while dongusu ile yazdirdik.
        out.print("Kac Tane Sayi Gireceksiniz :");
        int n = inp.nextInt();

        int k = 0;
        while (k < n ) {
            k++;

            out.print(k + ".sayi :");
            int i = inp.nextInt();

        // En buyuk ve en kucun olanlari belirledik.

        if(i > largest) {
            largest = i;
        }
        if(i < smallest){
            smallest = i;
        }
        }
        out.println("En Buyuk Sayi :" + largest);
        out.println("En Kucuk Sayi :" + smallest);
    }
}


