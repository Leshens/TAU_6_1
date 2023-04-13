package LAB_6;

public class Sum {
    public static void main(String[] args) {

    }
    public double sum(double[] percentages) {
        double sums=0;
        for (double percentage:percentages){
            sums+= percentage;
        }
        return sums;
    }
}
