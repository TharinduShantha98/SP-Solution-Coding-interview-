import java.util.ArrayList;

public class Problem02 {

    public void combineTwoList(){
        String[] cc = {"a","b","c"};
        String[] dd = {"1","2","3"};


        ArrayList<String> newArray = new ArrayList<>();

        for(int i =0; i < cc.length;i++){

            newArray.add(cc[i]);
            newArray.add(dd[i]);

        }

        System.out.println(newArray);



    }
}
