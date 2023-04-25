public class three {
    public static void main(String[] args){
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr3 = new int[5];
        int ave1 = 0, ave2 = 0, ave3 = 0;
        System.out.println("Перший масив:");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = (int) (Math.random()*10);
            ave1 += arr1[i];
            System.out.print(arr1[i] + " ");

        }
        System.out.println("\n\nДругий масив:");
        for(int i = 0; i < arr1.length; i++){
            arr2[i] = (int) (Math.random()*10);
            ave2 += arr2[i];
            System.out.print(arr2[i] + " ");
        }
        System.out.println("\n\nТретій масив:");
        for(int i = 0; i < arr1.length; i++){
            arr3[i] = (int) (Math.random()*10);
            ave3 += arr3[i];
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        float average1 = (float) (ave1 / 5.0);
        float average2 = (float) (ave2 / 5.0);
        float average3 = (float) (ave3 / 5.0);
        if(average1 == average2 && average1 == average3){
            System.out.println("Всі три рівні");
        } else if (average1 > average2) {
            if(average1 > average3){
                System.out.println("1");
            }else if (average1 < average3) {
                System.out.println("3");
            }else System.out.println("1 and 3");
        } else if (average1 < average2) {
            if (average2 > average3){
                System.out.println("2");
            }else if(average3 > average2){
                System.out.println("3");
            }else System.out.println("2 and 3");
        }else{
            if(average1 < average3){
                System.out.println("3");
            }else System.out.println("1 and 2");
        }
    }
}
