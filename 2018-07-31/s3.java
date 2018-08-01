
// streak (level-2 array Q)
class s3 {
    public static void main(String[] args) {
        int[] ar = {1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 5, 6, 6, 6, 2, 2, 2, 2};
        int len = 0;
        int maxLen = 0;

        for(int i=0; i<ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

        System.out.println();

        for(int i=0; i<ar.length; i++) {
            if (i == 0) len = 1;
            else if (ar[i] == ar[i-1]) len++;
            else len = 1;

            if (len > maxLen) {
                maxLen = len;
            }

            System.out.print(len + " ");
        }

        System.out.println();
        System.out.println(maxLen);
    }
}