public class Dzialanka {
    double add(double a, double b) {
        return a + b;
    }

    boolean isEvent(int liczba) {
        return liczba % 2 == 0;
    }

    boolean isOdd(int liczba) {
        return !(liczba % 2 == 0);
    }

    double circleField(double promien) {
        return Math.PI * Math.pow(promien, 2);
    }

    double power (int liczba){
        return liczba * liczba;
    }

}