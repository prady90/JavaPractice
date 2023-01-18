
class sumofTwenty{

public static void main(String args[]){
//2,8,5,15,12
  
    int[] temp = {2,8,5,15,12};
    int sum = 0;
    int count = 0;
    for(int i=0; i<temp.length; i++){
        for(int j=i+1; j<temp.length; j++){
            sum=temp[i]+temp[j];
            if(sum==20){
              count++;
              System.out.println(temp[i]+","+temp[j]);  
            }

        }


    }
    System.out.println(count);

}
}



