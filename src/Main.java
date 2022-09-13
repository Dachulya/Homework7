public class Main {
    public static void main(String[] args) {
        Task1();
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

}
