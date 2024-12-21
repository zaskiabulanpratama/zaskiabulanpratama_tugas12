public class MaxValue {
    // Fungsi untuk menemukan nilai maksimum dalam array menggunakan rekursi
    public static int findMax(int[] arr, int n) {
        // Kasus dasar: jika hanya ada satu elemen, kembalikan elemen itu
        if (n == 1) {
            return arr[0];
        }

        // Temukan nilai maksimum dari sisa array
        int maxOfRest = findMax(arr, n - 1);

        // Kembalikan nilai maksimum antara elemen terakhir dan maksimum dari sisa array
        return Math.max(arr[n - 1], maxOfRest);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, 1, 10};
        int n = arr.length;

        int max = findMax(arr, n);
        System.out.println("Nilai maksimum dalam array adalah: " + max);
    }
}

