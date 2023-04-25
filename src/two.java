public class two {
    public static void main(String[] args){
        int[] arr = new int[20];
        System.out.println("Original arrays: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*10);
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\n\nChanged arrays: ");
        for(int j = 0; j < arr.length; j++){
            if(j % 2 == 1) arr[j] = 0;
            System.out.print(arr[j] + ", ");
        }
    }
}
