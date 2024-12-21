public class Palindrom {
    public static void main(String[] args) {
        String testString1 = "katak";
        String testString2 = "kodok";
        String testString3 = "mamam";
        String testString4 = "tutut";
        String testString5 = "wah haw"; // Contoh dengan spasi

        System.out.println(isPalindrome(testString1.replace(" ", "").toLowerCase(), 0, testString1.length() - 1)); // true
        System.out.println(isPalindrome(testString2.replace(" ", "").toLowerCase(), 0, testString2.length() - 1)); // true
        System.out.println(isPalindrome(testString3.replace(" ", "").toLowerCase(), 0, testString3.length() - 1)); // true
        System.out.println(isPalindrome(testString4.replace(" ", "").toLowerCase(), 0, testString4.length() - 1)); // true
        System.out.println(isPalindrome(testString5.replace(" ", "").toLowerCase(), 0, testString5.length() - 1)); // true
    }

    public static boolean isPalindrome(String str, int start, int end) {
        // Jika start >= end, berarti sudah memeriksa semua karakter
        if (start >= end) {
            return true;
        }
        
        // Jika karakter di posisi start dan end tidak sama, bukan palindrom
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        
        // Rekursi untuk memeriksa karakter berikutnya
        return isPalindrome(str, start + 1, end - 1);
    }
}
    

