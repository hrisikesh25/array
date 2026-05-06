import java.util.*;

public class array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int remainder = arr[0] % k;

        boolean possible = true;

        for(int i = 1; i < n; i++) {

            if(arr[i] % k != remainder) {

                possible = false;

                break;
            }
        }

        if(!possible) {

            System.out.println(-1);

            sc.close();

            return;
        }

        int steps[] = new int[n];

        for(int i = 0; i < n; i++) {

            steps[i] = (arr[i] - remainder) / k;
        }

        Arrays.sort(steps);

        int median = steps[n / 2];

        long totalOperations = 0;

        for(int i = 0; i < n; i++) {

            totalOperations += Math.abs(steps[i] - median);
        }

        System.out.println(totalOperations);

        sc.close();
    }
}
