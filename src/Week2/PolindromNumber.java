package Week2;

public class PolindromNumber {
    // not: başta is takısı jargon olarak true-false yapılacağı durumlarda kullanılabilir.

    static boolean isPalindorm(int number) {
        int temp = number,reversenumber=0, lastNumber;
        while (temp!=0) {
            lastNumber = temp%10; //son basamağı verir.
            reversenumber = (reversenumber*10) + lastNumber;
            temp /= 10;  // son basamağı silme


        }
        //Polindrom sayı olup, olmadığını analiz etme
        if(number==reversenumber) {
            return true;

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
       System.out.println(isPalindorm(363));

    }
}

