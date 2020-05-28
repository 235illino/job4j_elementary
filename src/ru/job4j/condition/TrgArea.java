package ru.job4j.condition;

public class TrgArea {
    private Point first;
    private Point second;
    private Point third;

    public TrgArea(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }


    public double area(Point first, Point second, Point third) {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = this.period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    private boolean exist(double a, double c, double b) {
        return a + b > c && c + a > b && b + c > a;
    }

}

