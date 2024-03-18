public class StudentMachine extends Student {
    private double scoreCNC;
    private double scorePLC;

    StudentMachine(double scoreCNC, double scorePLC) {
        this.scoreCNC = scoreCNC;
        this.scorePLC = scorePLC;
    }

    @Override
    double getPoint() {
        return ((scoreCNC + scorePLC) / 2);
    }

}
