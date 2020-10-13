import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        //Read file
        try {
            Scanner read = new Scanner(new File("input.txt"));
            do {
                //Read each line
                BigInteger line = read.nextBigInteger();
                given.add(line);
            } while (read.hasNext());
            read.close();
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found");
        }
         */
        BigInteger input = in.nextBigInteger();
        while (!input.equals(BigInteger.valueOf(0))){
            int n = 0;
            BigInteger decimal = BigInteger.valueOf(0);
            while (!input.equals(BigInteger.valueOf(0))){
                BigInteger mod = input.mod(BigInteger.valueOf(10));
                decimal = decimal.add(mod.multiply((BigInteger.valueOf(2).pow(n+1)).subtract(BigInteger.valueOf(1))));
                n++;
                input = input.divide(BigInteger.valueOf(10));
            }
            System.out.println( decimal );
            input = in.nextBigInteger();
        }

        /*
        for (int i = 0; i < given.size() - 1; i++){
            BigInteger number = given.get(i);
            BigInteger decimal = BigInteger.valueOf(0);
            int j = 1;
            while (number.compareTo(BigInteger.valueOf(0)) != 0 ){
                BigInteger mod = number.mod(BigInteger.valueOf(10));
                decimal = decimal.add(mod.multiply((BigInteger.valueOf(2).pow(j)).subtract(BigInteger.valueOf(1))));
                number = number.divide(BigInteger.valueOf(10));
                j++;
            }
            System.out.println( decimal );
        }
         */

    }
}
