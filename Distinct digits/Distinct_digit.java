import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by kaorihirata on 2017-04-14.
 */
public class Distinct_digit {


    public static void main(String[] args) {
        int y; // starting year
        String stringYear;
        //String[] arrayYear;

//        int y= 1987;
        Scanner in = new Scanner(System.in);
        y = in.nextInt();


        // HashSetのクラスを持ったオブジェクト生成
        Set<String> hashYear = new HashSet<String>();

        for(int j=y+1; j<= 10000; j++) {
            // int型からstring型に変換
            stringYear = String.valueOf(j);
            // string型noのアレイに変換
//        String[] arrayYear = new String[stringYear.length()];
            String[] arrayYear = new String[stringYear.length()];
            for (int i = 0; i < arrayYear.length; i++) {
                // 各アレイの列に値を入れる。
                arrayYear[i] = String.valueOf(stringYear.charAt(i));
                // 各HashSetの列に値を入れる。
                hashYear.add(arrayYear[i]);
            }
            if (hashYear.size() == arrayYear.length) {
                for(int k = 0; k <arrayYear.length;k++) {
                    System.out.print(arrayYear[k]);
                }
                break;
            }
            else{
                hashYear.clear();
            }
        }
    }
}

