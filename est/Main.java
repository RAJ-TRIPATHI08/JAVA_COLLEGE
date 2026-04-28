public class Main {

    public static void main(String[] args) {
        try{
            int arr[] = {1,2,3};
            System.out.println(arr[6]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array out of bound exception");
        }
        finally{
            System.out.println("The ty-catch block is executed");
        }
    }
}