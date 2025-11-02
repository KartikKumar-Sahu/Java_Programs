public class Program116 {
    public static void main(String[] args) {
        int num, temp, remainder, sum;
        System.out.println("Armstrong numbers between 1 to 600 are:");

        for (num = 1; num <= 600; num++) {
            temp = num;
            sum = 0;

            while (temp != 0) {
                remainder = temp % 10;
                sum = sum + (remainder * remainder * remainder);
                temp = temp / 10;
            }

            if (sum == num)
                System.out.println(num);
        }
    }
}
