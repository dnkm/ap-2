class s2 {
    public static void main(String[] args) {
        int[] ar = {1, 2, -1, -2, 1, 2};

        printNextToOne(ar);

        // int[] clone = doClone(ar);

        // print(ar);
        // print(clone);
    }

    public static int[] doClone(int[] ar) {
        int[] clone = new int[ar.length];

        for(int i=0; i<ar.length; i++) {
            clone[i] = ar[i];
        }

        return clone;
    }


    public static void print(int[] ar) {
        for(int i=0; i<ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
        System.out.println();
    }


    public static void printNextToOne(int[] ar) {

        if (ar[1] == 1) {
            System.out.println(ar[0]);
        }

        for(int i=1; i<ar.length-1; i++) {

            if ( ar[i-1] == 1 || ar[i+1] == 1 ) {
                System.out.println(ar[i]);
            }

        }

        if (ar[ar.length-2] == 1) {
            System.out.println(ar[ar.length-1]);
        }

    }

    public static int someMethod() {
        return 0;
    }

}