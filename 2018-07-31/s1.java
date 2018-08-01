import com.sun.javafx.css.FontFace;

// warmup exercise

class s1 {
    public static void main(String[] args) {
        // tree(6);
        // tree2(10);
        // tree3(9);
        tree4(5);
    }

    public static void tree(int n) {}

    public static void tree2(int n) {

        for(int i=0; i<5; i++) {
            for(int j=0; j< i+1 ;j++) {
                System.out.print("*");
            }

            for(int j=0; j< 4-i ;j++) {
                System.out.print("-");
            }
            System.out.println();

        }

    }

    public static void tree3(int n) {
        
        for(int j=1; j<=n; j++) {
            for(int i=1; i<=j; i++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static void tree4(int n) {
        int x = 0;

        for(int num=1; num<=n; num++) {
            for(int j=0; j< num ;j++) {
                System.out.print(x);
                
                if (x == 0) {
                    x = 1;
                }
                else {
                    x = 0;
                }
                
            }
            System.out.println();
        }
    }


}