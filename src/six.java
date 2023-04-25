public class six {
    public static void main(String[] args){
        int[][] arr = new int[15][];
        for(int i = 0; i < arr.length; i++){
            if (i < 4){
                arr[i] = new int[5];
            } else if (i < 8) {
                arr[i] = new int[8];
            } else if (i < 12) {
                arr[i] = new int[3];
            } else {
                arr[i] = new int[9];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 9);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
