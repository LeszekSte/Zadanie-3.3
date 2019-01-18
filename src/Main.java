public class Main {

    public static void main(String[] args) {

        Dzialanka działanka = new Dzialanka();

        int kolejnosc = 0;
        int liczba1 = 3;
        System.out.printf("%d. Czy liczba %d jest parzysta      -  %s\n", ++kolejnosc,liczba1, działanka.isEvent(liczba1));
        System.out.printf("%d. Czy liczba %d jest nieparzysta   -  %s\n", ++kolejnosc,liczba1, działanka.isOdd(liczba1));
        System.out.printf("%d. Pole pow koła o promieniu %d     =  %.2f\n", ++kolejnosc,liczba1, działanka.circleField(liczba1));
        System.out.printf("%d. Potęga liczby %d                 =  %s\n", ++kolejnosc,liczba1, działanka.power(liczba1));
    }
}
