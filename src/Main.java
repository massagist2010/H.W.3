public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //задача 6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var twoFighters = firstBoxer + secondBoxer;
        System.out.println("общий вес бойцов " + twoFighters + "кг");
        var difference = firstBoxer - secondBoxer;
        System.out.println("разница веса " + difference + " кг ");
        //задача 7
        difference = secondBoxer - firstBoxer;
        System.out.println("разница в " + difference + " кг первый вариант ");
        difference = (secondBoxer) % firstBoxer;
        System.out.println("разница в " + difference + " кг второй вариант ");
        //задача 8
        var totalHours = 640;
        var hoursOnOne = 8;
        var totalEmployees = totalHours / hoursOnOne;
        System.out.println("всего работников в компании " + totalEmployees + " человек ");
        totalEmployees = totalEmployees + 94;
        System.out.println(totalEmployees);
        var nowHours = totalHours / totalEmployees;
        System.out.println("если в компании работает " + totalEmployees + " человек, то всего " + nowHours + " часов работы может быть поделено между сотрудниками ");
    }
}