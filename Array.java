public class Array {
    public static void main(String[] args){
        //int[] array={1,2,3,4,5};//Creating an array
        //System.out.println("Array: "+ array[10]);
        try{
            int[] array={1,2,3,4,5};//Creating an array
            System.out.println("Array: "+ array[10]);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Array out of bound is 10");
        }
    }
}
