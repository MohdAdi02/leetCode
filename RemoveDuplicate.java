public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] a = {1,1,2,2,3,4,4,5};
        removeDuplicate(a);

    }
    public static void removeDuplicate(int []num){
        int index = 1;
        for(int i = 1; i< num.length; i++){
            if(num[i] != num[i-1]){
                num[index] = num[i];
                index++;
            }
        }
        System.out.println(index);

    }
}
