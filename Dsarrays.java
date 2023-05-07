import java.util.Scanner;
class Dsarrays {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Whats your size of Array ?");
        int size=obj.nextInt();
        System.out.println("Now input your array elements");
        int[] array=new int[size];
        
        
       for(int i=0; i<size; i++){
         array[i]=  obj.nextInt();
       }
    System.out.println("which arrays index do you want ?");
    int x=obj.nextInt();
    for(int i=0; i<array.length; i++) {
        if(array[i]==x){

            System.out.println("The value of index is :"+i);
        }

    }
    
    }
}