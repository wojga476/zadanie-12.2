import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Kolejki {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<> ();
        Scanner scanner = new Scanner (System.in);
        int suma =0;
        System.out.println ("Podaj 10 liczb:" );
        for (int i =0; i<10;i++) {
            int b = scanner.nextInt ();
            numbers.offer (b);
            suma+=b;
        }
        int i =0;
        Iterator<Integer> iterator = numbers.iterator ( );
        while (iterator.hasNext ()){
            i++;
            if (i!=numbers.size ()){
                int b =iterator.next ();
                System.out.print (b+"+");
            }else {
                int b = iterator.next ();
                System.out.print(b);
            }
        }
        System.out.print ("="+suma );
    }
}