public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
    }
    public  static  void Task1(){
        //Задание1
        int sum=0;
        int month=0;
        int salary= 65_535;
        while (sum< 2_459_000){
            month+=1;
            sum+=salary;
        }
        System.out.println("Месяц "+month+" сумма накоплений равна "+sum+" рублей");
        //Зажание2
        byte i=0;
        while ( i<10){
            i+=1;
            System.out.print(i+" ");
        }
        System.out.println();


        for ( i=10 ;i<=10 & i>0;i--){
            System.out.print(i+" ");
        }
        System.out.println();
        //Задание3
        int people=12_000_000;
        short birthRateOneThousand =17;
        short mortalityOneThousand=8;
        short yearsTime= 0;
        int summ=0;
        while (yearsTime<10){
            yearsTime+=1;
            int cof=people/1000;
            summ=summ+birthRateOneThousand*cof-cof*mortalityOneThousand;
            System.out.println("Год "+yearsTime+" численность населения составляет "+(people+summ));

        }


    }
    public  static void Task2(){
        //Задание2-Задание2
        int initialPayment=15_000;
        float percent=1.07f;
        byte month=0;
        int purpose=12_000_000;
        double i=initialPayment;
        while( i<=purpose){
            month+=1;
            i=i*percent;
            if (month%6==0) {
                System.out.println("Месяц "+month+" накопленно "+i);
            }
        }
        //Задание3
        System.out.println("Задание3");
        month=0;

        i=initialPayment;
        while( month<=108){
            month+=1;
            i=i*percent;
            if (month%6==0) {
                System.out.println("Месяц "+month+" накопленно "+i);
            }
        }
        //Задание4
        int firstFriday=2;
        System.out.println("Сегодня пятница,"+firstFriday+"-е число. Необходимо подготовить отчёт");
        short dayWeek=0;
        while (dayWeek<=31){
            dayWeek+=1;
            if (dayWeek-firstFriday==7 | dayWeek-firstFriday==14 | dayWeek-firstFriday==21){
                System.out.println("Сегодня пятница, "+dayWeek+"-e чсило. Необходимо подготовть отчёт");
            }
            }
        }

    }



