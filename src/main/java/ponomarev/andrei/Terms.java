package ponomarev.andrei;

public class Terms {

    double timeToWork;
    String dayWeek;

    public Terms(double timeToWork, String dayWeek) {
        this.timeToWork = timeToWork;
        this.dayWeek = dayWeek;
    }

    void goWork() {
        {
            if (dayWeek == "Суббота" || dayWeek == "Воскресенье") {
                System.out.println("Можно спать дальше! Выходной!");
            } else if (timeToWork <= 06.30) {
                System.out.println("Пора вставать на работу!(");
            } else {
                System.out.println("ТЫ ПРОСПАЛ!!!");

            }
        }
    }
}


