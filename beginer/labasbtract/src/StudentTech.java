public class StudentTech extends Student {
    private double scoreJava;
    private double scoreHTML;

    StudentTech(double scoreJava, double scoreHTML) {
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;
    }

    @Override
    double getPoint() {
        return (double) ((scoreJava * 2 + scoreHTML) / 3);
    }
}
