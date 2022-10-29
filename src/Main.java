public class Main {
    public static void main(String[] args) {
        // task1
        int trez = 30;
        byte on = 10;
        short duz = 20;
        long katorz = 40L;
        float faif = 50;
        double six = 60;
        System.out.println("Значение переменной trez с типом int равно " +trez);
        System.out.println("Значение переменной on с типом byte равно " +on);
        System.out.println("Значение переменной duz с типом int равно " +duz);
        System.out.println("Значение переменной katorz с типом long равно " +katorz);
        System.out.println("Значение переменной faif с типом float равно " +faif);
        System.out.println("Значение переменной six с типом double равно " +six);
        //task2
        byte a = 67;
        short b = -159;
        int c = 569;
        long d = 987678965549L;
        float e = 27.12f;
        double f = 27.12;
        //task3
        byte LudmilaPavlovna = 23;
        byte AnnaSergeevna = 27;
        byte EkaterinaAndreevna = 30;
        short sheetsPaper = 480;
        int numberStudents = LudmilaPavlovna + AnnaSergeevna + EkaterinaAndreevna;
        int studentWillGet = sheetsPaper / numberStudents;
        System.out.println("На каждого ученика рассчитано " +studentWillGet+ " листов бумаги");
    }
}