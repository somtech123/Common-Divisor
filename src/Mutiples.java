public class Mutiples {
    private int firstNumber;
    private int secondNumber;

    public Mutiples(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    public int highestCommonMultiple(){
        int hcf = 1;
        for (int i=1; i<=firstNumber && i<= secondNumber; i++){
            if (this.firstNumber % i == 0 && this.secondNumber % i == 0){
                hcf = i;
            }
        }
        System.out.println("HCF = " + hcf);
        return hcf;
    }

    public int lowestCommonMultiple(){
        int value;
        int gcd = 1;
        for (int i=1; i<= this.firstNumber && i<= this.secondNumber; i++){
            if (this.firstNumber % i == 0 && this.secondNumber % i == 0){
                gcd = i;
            }
        }
        value = ( this.firstNumber * this.secondNumber) / gcd;
        System.out.println("LCM = " + value);
        return value;

    }
}
