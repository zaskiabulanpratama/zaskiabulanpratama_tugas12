public class Rekruis {
    public static int sum(int n) {
        System.out.print(n);
        if( n > 1){
            System.out.print(" x ");
        }
        if (n == 1) {
            return 1;
        } else {
            return n * sum(n - 1);
            
        }
    }

    public static void main(String[] args) {
        int result = sum(8);
        System.out.println(" = " + result);
    }


}
    

