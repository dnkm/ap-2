class test {
    public static void main(String[] args) {
        int x = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print(x);

            if (x == 0) {
                x = 1;
            } else {
                x = 0;
            }
        }


    }
}