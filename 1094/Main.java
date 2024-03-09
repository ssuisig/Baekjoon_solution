import java.util.*;

public class Main{
    public static void main(String argc[]){
        Scanner sc = new Scanner(System.in);
        
        int stick = 64;
        int count = 0;
        int x = sc.nextInt();
        
        while(x > 0){
            if(stick > x){
                stick /= 2;
            }
            else{
                x -= stick;
                count++;
            }
        }
        System.out.println(count);
    }
}