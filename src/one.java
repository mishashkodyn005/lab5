public class one {
    public static void main(String[] args) {
        int n = 0, num = 1;
        for(int i = 1; i < 100; i++) {
            if (i % 2 == 1) n++;
        }
        int[] arr = new int[n];
        for(int j = 0; j < n; j++){
            arr[j] = num;
            System.out.println(arr[j]);
            num += 2;
        }
    }
}