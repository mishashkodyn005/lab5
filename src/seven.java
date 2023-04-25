public class seven {
    public static void main(String[] args){
        int[][] arr = new int[7][7];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int) (Math.random()*7);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int index_max = 0, max = 0;

        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
            if (sum > max){
                max = sum;
                index_max = i;
            }
        }
        System.out.println("\n" + index_max);
    }
}
