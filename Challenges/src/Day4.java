import java.util.*;

public class Day4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";


        if( n%2 == 1 || (n > 5 && n < 21)){
            ans = "Weird";
        }
        else{
            ans = "Not Weird";
        }

        System.out.println(ans);
    }

}
