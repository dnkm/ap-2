class s4 {
    public static void main(String[] args) {
        int[] ar = { 1, 3, 4, 6, 2, -5, 1, 0, 1 };
        
        System.out.println(countPeaks(ar));
        System.out.println(tallestPeaks(ar));
    }

    public static int countPeaks(int[] ar) {
        int cnt = 0;

        if (ar[0] > ar[1])
            cnt++;

        if (ar[ar.length - 1] > ar[ar.length - 2])
            cnt++;

        for (int i = 1; i < ar.length - 1; i++) {

            if (ar[i] > ar[i - 1] && ar[i] > ar[i + 1]) {
                cnt++;
            }

        }

        return cnt;
    }

    public static int tallestPeaks(int[] ar) {
        int maxHeight = 0;

        if (ar[0] > ar[1]) {
            int height = ar[0] - ar[1];
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
            

        if (ar[ar.length - 1] > ar[ar.length - 2]) {
            int height = ar[ar.length - 1] - ar[ar.length - 2];
            if (height > maxHeight) {
                maxHeight = height;
            }
        }

        for (int i = 1; i < ar.length - 1; i++) {

            if (ar[i] > ar[i - 1] && ar[i] > ar[i + 1]) {
                int height = ar[i] - ar[i-1];
                if (height > maxHeight) {
                    maxHeight = height;
                }

                height = ar[i] - ar[i+1];
                if (height > maxHeight) {
                    maxHeight = height;
                }
            }

        }

        return maxHeight;
    }
}