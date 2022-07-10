public class LowestCommonDivisor {
    public static int lowestDivisor(int n1, int n2){
        int gcd = 1;
        for (int i=1; i<=n1 && i<= n2; i++){
            if (n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        int value = (n1 * n2) / gcd;
        System.out.println("The LCM of " + n1 + " and " + n2 + " is " + value);
        return value;
    }
}

