public class five {
    public static void main(String[] args){
        int[] arr = new int[15];
        int count = 0;
        System.out.println("Массив:");
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random()*10);
            if (arr[i] % 2 == 0) count++;
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n\nКількість парних елементів: " + count);
    }
}
