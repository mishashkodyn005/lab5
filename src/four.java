public class four {
    public static void main(String[] args){
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] sum_arr = new int[10];
        System.out.println("Перший масив: ");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = (int) (Math.random()*10);
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\n\nДругий масив: ");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = (int) (Math.random()*10);
            System.out.print(arr2[i] + " ");
        }
        System.out.println("\n\nМассив з сумою: ");
        for(int i = 0; i < sum_arr.length; i++){
            sum_arr[i] = arr1[i] + arr2[i];
            System.out.print(sum_arr[i] + " ");
        }
    }
}
