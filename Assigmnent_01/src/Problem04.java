import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Problem04 {

    public void largePossibleArray(){


        System.out.println("+++++++++");

        List<Integer> numbers = new ArrayList<>();
        String[] aa = {"50","2","1","9"};
        for(int i =0; i <aa.length;i++){
            char[] charArray = aa[i].toCharArray();
            for(int j =0 ; j< charArray.length;j++){
                numbers.add(Integer.parseInt(String.valueOf(charArray[j])));
                System.out.println(charArray[j]);
            }
        }

        int[] sort = new int[5];

        for(int i=0; i< numbers.size();i++){
            Integer i1 = numbers.get(i);
            sort[i] = i1;
        }

        for(int i=0; i< sort.length-1;i++){
            for(int j =0; j < sort.length-1;j++){
                if(sort[j]> sort[j+1]){
                    int temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
            }


        }
        for(int i=sort.length-1; i>=0;i--){
            System.out.print(sort[i]);

        }



    }
}
