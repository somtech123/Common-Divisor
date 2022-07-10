public class HigestCommonDivisior {

    public static int highestDivisor(int n1, int n2){
        int hcf = 1;
        for (int i=1; i<= n1 && i<= n2; i++){
            if (n1 % i == 0 && n2 % i == 0){
                hcf = i;
            }
        }
        System.out.println("The hcf of " + n1 + " and " + n2 + " is " + hcf);
        return hcf;

    }
}
