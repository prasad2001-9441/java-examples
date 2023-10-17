import java.util.*;
public class main{
    public static void main(String[] args){
     Integer[] res = {1,2,3,4,5,6,7};   
     List<Integer> resList = Arrays.asList(res);
     Collections.shuffle(resList);
     System.out.println("Shuffled array" + resList);
    }
}