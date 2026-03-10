public class combination {
    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        int result = factorial(n) / (factorial(r) * factorial(n - r));  // n!/(r! * (n-r)!)
        System.out.println(result);
    }
    public static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);  // Recursive call to calculate factorial
    }
}
