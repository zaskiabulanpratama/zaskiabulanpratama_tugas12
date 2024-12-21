public class SumOfThree {
    // Fungsi untuk menghasilkan deret SumOfThree
    public static int[] sumOfThree(int n, int a, int b, int c) {
        // Jika n kurang dari atau sama dengan 0, kembalikan array kosong
        if (n <= 0) {
            return new int[0];
        }

        // Buat array untuk menyimpan deret
        int[] series = new int[n];

        // Inisialisasi tiga angka pertama
        series[0] = a;
        if (n > 1) {
            series[1] = b;
        }
        if (n > 2) {
            series[2] = c;
        }

        // Hitung deret untuk sisa elemen
        for (int i = 3; i < n; i++) {
            series[i] = series[i - 1] + series[i - 2] + series[i - 3];
        }

        return series;
    }

    public static void main(String[] args) {
        int n = 5; // Jumlah bilangan
        int a = 1; // Angka pertama
        int b = 1; // Angka kedua
        int c = 1; // Angka ketiga

        int[] result = sumOfThree(n, a, b, c);

        // Cetak hasil deret
        System.out.print("Deret SumOfThree: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

