public class Problem01 {
    int[] numbers  = {1,4,2,4,9,10};
    int j =0;
    int y =0;
    public  void calSumUsingForLoop(){
        for(int i =0; i < numbers.length;i++){
            j = j+ numbers[i];
        }
        System.out.println("sum of using for Loop  :" + j);
    }

    public void calSumUsingWhileLoop(){
        int i= 0;
        while (i > numbers.length){
            i++;
            y = y+ numbers[i];
        }

        System.out.println("sum of using while Loop  :" + y);
    }


}
