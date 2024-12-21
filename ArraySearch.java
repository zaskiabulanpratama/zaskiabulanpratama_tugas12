public class ArraySearch {
    // Fungsi untuk memeriksa apakah array mengandung elemen tertentu menggunakan rekursi
    public static boolean contains(int[] arr, int n, int target) {
        // Kasus dasar: jika ukuran array adalah 0, elemen tidak ditemukan
        if (n <= 0) {
            return false;
        }

        // Jika elemen terakhir sama dengan target, kembalikan true
        if (arr[n - 1] == target) {
            return true;
        }

        // Panggil fungsi secara rekursif untuk sisa array
        return contains(arr, n - 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, 1};
        int target = 7;

        boolean found = contains(arr, arr.length, target);
        if (found) {
            System.out.println("Array mengandung elemen: " + target);
        } else {
            System.out.println("Array tidak mengandung elemen: " + target);
        }
    }
}

