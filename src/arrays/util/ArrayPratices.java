package arrays.util;

import java.util.Scanner;

public class ArrayPratices {
        //1 İstifadəçidən 5 tam ədəd al, array-a yığ və ekrana yazdır.
        public static void printUserInputArray(){
            int[] arr = new int[5];
            for (int i=0;i<arr.length;i++){
                arr[i] = new Scanner(System.in).nextInt();
            }
            for (int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }

        //2 int[] arr = {3, 7, 2, 9, 1}; – bu array-ın bütün elementlərini for ilə çap et.
        public static void printFixedArray(){
            int[] arr = {3,7,2,9,1};
            for (int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }

        //3 Scanner ilə istifadəçidən 10 ədəd al, array-a yığ və yalnız cüt olanları çap et.
        public static void printEvenNumbers(){
            Scanner sc = new Scanner(System.in);
            System.out.println("ne qeder massiv doldurmaq isteyirsiz?");
            int massivSayi = sc.nextInt();
            int[] arr = new int[massivSayi];


            for (int i=0;i<arr.length;i++){
                arr[i] = new Scanner(System.in).nextInt();
            }
            for (int i=0;i<arr.length;i++){
                if (arr[i]%2 == 0){
                    System.out.println("cut ededlerdi: "+ arr[i]);
                }
            }
        }

        //4. 5 ədəd al, yalnız tək ədədləri çap et
        public static void printOddNumbers(){
            int[] eded = new int[5];
            for (int i=0;i<eded.length;i++){
                eded[i] = new Scanner(System.in).nextInt();
            }
            for (int i=0;i<eded.length;i++){
                if (eded[i]%2 == 1){
                    System.out.println("tek eded" + eded[i]);
                }
            }
        }

        //5 Array-da neçə cüt ədəd olduğunu tap
        public static void countEvenNumbers(){
            int count = 0;
            int[] eded = new int[5];
            for (int i=0;i<eded.length;i++){
                eded[i] = new Scanner(System.in).nextInt();
            }
            for (int i=0;i<eded.length;i++){
                if (eded[i]%2 == 0){
                    count++;
                }
            }
            System.out.println("Daxil edilmis arraylarda cemi ="+count + "cut eded var");
        }

        //6 Array-da neçə tək ədəd olduğunu tap
        public static void countOddNumbers(){
            int count = 0;
            int[] eded = new int[5];
            for (int i=0;i<eded.length;i++){
                eded[i] = new Scanner(System.in).nextInt();
            }
            for (int i=0;i<eded.length;i++){
                if (eded[i]%2 == 1){
                    count++;
                }
            }
            System.out.println("Daxil edilmis arraylarda cemi ="+count + "tek eded var");
        }

        //7 Array-dakı ədədlərin cəmini tap
        public static void sumOfArray(){
            int toplama = 0;
            int[] arr = {1,2,3,4,5,10,1,5,3,6};
            for (int i=0;i<arr.length;i++){
                toplama+=arr[i];
            }
            System.out.println(toplama);
        }

        //8 Əvvəlcə cütləri, sonra tək ədədləri çap et
        public static void printEvenThenOdd(){
            int[] arr = {1,2,3,4,5,6,7,8,9,10};

            //cut ededler
            for (int i=0;i<arr.length;i++){
                if (arr[i]%2 == 0){
                    System.out.println(arr[i] + ": cut eded");
                }
            }
            //tek eded
            for (int i=0;i<arr.length;i++){
                if (arr[i]%2==1){
                    System.out.println(arr[i] + ": tek eded");
                }
            }
        }

        //9 	5-dən böyük ədədlərin sayını tap
        public static void countGreaterThanFive(){
            int[] arr = {1,5,8,7,8,5,1,2,3,5,4,5,6,9,5,5,5,5,5,5};
            int count = 0;

            for (int i=0;i<20;i++){
                if (arr[i] > 5){
                    count++;
                }
            }
            System.out.println("arrayda bu qeder 5 den boyuk eded var: "+count);
        }

        //10. 5-ə tam bölünənləri çap et
        public static void printDivisibleByFive(){
            int[] arr = {15,12,14,11,25,20,24,28,30,35,66,89};
            for (int i=0;i<arr.length;i++){
                if (arr[i]%5 == 0){
                    System.out.println("bu ededler 5 tam bolunur"+ arr[i]);
                }
            }
        }


        //11. Scanner ilə istifadəçidən 10 ədəd daxil et və bu ədədlərdən yalnız 3-ə tam bölünənləri çap et.
        public static void printDivisibleByThree(){
            int[] number = new int[10];
            for (int i=0;i<number.length;i++){
                number[i] = new Scanner(System.in).nextInt();
            }
            for (int i=0;i<number.length;i++){
                if (number[i]%3 == 0){
                    System.out.println("3 bolunen tam ededler: " + number[i]);
                }
            }
        }

        //12. Scanner ilə 10 ədəd al, həm 2-yə, həm də 3-ə bölünənləri çap et.
        public static void printDivisibleByTwoAndThree(){
            int[] numbers = new int[10];
            for (int i=0;i<numbers.length;i++){
                numbers[i] = new Scanner(System.in).nextInt();
            }
            for (int j=0;j<numbers.length;j++){
                if (numbers[j]%2==0){
                    System.out.println("2 ye bolunen ededler" + numbers[j]);
                }
            }
            for (int k=0;k<numbers.length;k++){
                if (numbers[k]%3==0){
                    System.out.println("3 bolunen ededler: " + numbers[k]);
                }
            }
        }

        //13. Scanner ilə ədədləri array-a yığ və hər bir ədədin kvadratını çap et.
        public static void printSquaresOfNumbers(){
            int[] number = new int[10];
            for (int i=0;i<number.length;i++){
                number[i] = new Scanner(System.in).nextInt();
            }

            for (int i=0;i<number.length;i++){
                System.out.println(number[i] + " * " + number[i] + " = " + (number[i] * number[i]) );
            }
        }

        //14. Verilmiş int[] arr = {2, 4, 6, 8, 10}; – bu array-dakı bütün cüt
        public static void sumOfEvenNumbers(){
            int[] numbers = {2,4,6,8,10,44,12,58,99,22,36,52};
            int count = 0;

            for (int i=0;i<numbers.length;i++){
                if (numbers[i]%2 == 0){
                    count+=numbers[i];
                    System.out.println("cut eded: "+ numbers[i]);
                }
            }
            System.out.println(count);
        }

        //15. Scanner ilə daxil edilən array-da 10-dan böyük və 20-dən kiçik ədədləri
        public static void printBetween10And20(){
            int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,54,44,100,1000,225,25};

            for (int i=0;i<numbers.length;i++){
                if (numbers[i] >= 10 && numbers[i] <= 20){
                    System.out.println(numbers[i]);
                }
            }
        }

        //16. Scanner ilə array-a 10 ədəd yığ və neçə dənəsinin mənfi olduğunu say.
        public static void countNegativeNumbers(){
            int[] numbers = {-1,-2,0,-3,5,-4,1,-5,-1,5,8,-8};
            int menfiReqemler = 0;

            for (int i=0;i<numbers.length;i++){
                if (numbers[i] < 0){
                    menfiReqemler++;
                }
            }
            System.out.println("Massivde :" + menfiReqemler + " eded  menfi reqem var");
        }

        //17. Scanner ilə daxil edilmiş array-dakı tək ədədlərin cəmini tap.
        public static void sumOfOddNumbers(){
            int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
            int tekededCemi = 0;
            for (int i=0;i<numbers.length;i++){
                if (numbers[i]%2 == 1){
                    System.out.println(numbers[i] + ": tek eded");
                    tekededCemi+=numbers[i];
                }
            }
            System.out.println("tek ededlerin cemisi: " + tekededCemi);

        }

        //18. Scanner ilə 5 ədəd daxil et, içində 0 varsa, onu ayrıca “0 tapıldı” deyə çap et.
        public static void checkIfZeroExists(){
            int[] numbers = {1,0,2,5,8,1,0,3,0};
            int say = 0;

            for (int i=0;i<numbers.length;i++){
                if (numbers[i] ==0){
                    say ++;
                }
                System.out.println(numbers[i]);
            }
            System.out.println("bu qeder 0 var: "+ say);
        }

        //19. Verilmiş int[] arr = {1, 2, 3, 4, 5} – bu array-da neçə dənə 2-dən böyük ədəd var?
        public static void countGreaterThanTwo(){
            int[] numbers = {5,1,2,3,6,8,9,7,4,5,2,3,6,2};
            int count = 0;

            for (int i=0;i<numbers.length;i++){
                if (numbers[i] > 2){
                    count++;
                }
            }
            System.out.println("massivde 2 den boyuq reqemler bu qederdi: " + count);
        }

        //20. Scanner ilə istifadəçidən 10 ədəd al və yalnız tək, amma 5-ə bölünən ədədləri çap et.
        public static void printOddAndDivisibleByFive(){
            int[] numbers = {22,15,78,45,88,69,51,23,66,58,45,21,102,111,120,255,1,2,3,68,5};
            for (int i=0;i<numbers.length;i++){
                if (numbers[i]%2 == 1 && numbers[i]%5 == 0) {
                    System.out.println(numbers[i]);
                }
            }
        }

        //21. Scanner ilə istifadəçidən 10 ədəd al və cüt və tək ədədlərin sayını ayrı-ayrılıqda çap et.
        public static void countEvenAndOddNumbers(){
            Scanner sc = new Scanner(System.in);
            System.out.println("massiv sayi daxil edin: ");
            int say = sc.nextInt();
            int[] numbers = new int[say];


            int cutEded = 0;
            int tekEded = 0;

            //scanner for
            for (int i=0;i<numbers.length;i++){
                numbers[i] = sc.nextInt();
            }

            //tek eded
            for (int i=0;i<numbers.length;i++){
                if (numbers[i]%2 == 0){
                    tekEded++;
                }else {
                    cutEded++;
                }
            }

            System.out.println("tek eded: " + tekEded + "\n" +
                    "cut eded: "+ cutEded);
        }

        //22. Scanner ilə daxil edilən array-da 2 və 3-ə eyni anda bölünən ədədləri çap et.
        public static void printDivisibleByTwoAndThreeTogether(){
            int[] arr = {4,1,2,55,8,7,44,56,98,25,63,65,5,23,69,85,12,36,52,24,78,5,22,3,9,10,15,12,11,25,22,23,21,20,4,7};

            for (int i=0;i<arr.length;i++){
                if (arr[i]%2 == 0 && arr[i]%3==0){
                    System.out.println("bular hemi 2 ye hemde 3 bolunur"+arr[i] );
                }

            }
        }

        //23. Verilmiş array-dakı bütün ədədlərin orta qiymətini (average) tap və çap et.
        public static void printAverageOfArray(){
            int[] numbers = {2,3,4,5};
            int avargare = 0;

            for (int i=0;i<numbers.length;i++){
                avargare+=numbers[i];
            }
            double ortaHesab = avargare / numbers.length;
            System.out.println(ortaHesab);
        }

        //24. Scanner ilə daxil edilən array-da 5-ə bölünən, amma 2-yə bölünməyən ədədləri çap et.
        public static void printDivByFiveNotByTwo(){
            int[] number = {1,2,3,4,5,6,7,8,9,10};
            for (int i=0;i<number.length;i++){
                if (number[i]%5 == 0 && number[i]%2 != 0){
                    System.out.println(number[i]);
                }
            }
        }

        //25. Scanner ilə istifadəçidən neçə ədəd daxil ediləcəyini soruş və o qədər ədəd daxil et, neçə ədəd 10-a tam bölünür?
        public static void countDivisibleByTen(){
            Scanner sc = new Scanner(System.in);
            System.out.println("massiv sayi elave et");
            int massivSayi = sc.nextInt();

            //10na bolunen ededler
            int result = 0;

            int[] numbers = new int[massivSayi];

            for (int i=0;i<numbers.length;i++){
                numbers[i] = sc.nextInt();
            }

            for (int i=0;i<numbers.length;i++){
                if (numbers[i]%10 == 0){
                    result++;
                }
            }

            System.out.println("bu qeder eded 10 tam bolunur: "+ result);
        }

        //26. Verilmiş int[] arr = {0, 1, 0, 2, 0, 3, 4, 0} – neçə dənə 0 olduğunu tap.
        public static void countZerosInArray(){
            int tapilan = 0;
            int[] numbers = {0,2,0,3,0,3,4,0};
            for (int i=0;i<numbers.length;i++){
                if (numbers[i] == 0){
                    tapilan++;
                }
            }
            System.out.println("massivde bu qeder :" +tapilan + " var");
        }

        //27. Scanner ilə ədədlər al və array-da yalnız müsbət ədədləri çap et.
        public static void printPositiveNumbers(){
            int[] numbers = {-1,-2,0,2,3,5,6};
            for (int i=0;i<numbers.length;i++){
                if (numbers[i] > 0){
                    System.out.println(numbers[i]);
                }
            }
        }

        //28. Scanner ilə daxil edilən array-da neçə ədəd 3 rəqəminə bərabərdir.
        public static void countOfThreeInArray(){
            int[] numbers = {3,4,5,8,9,11,3,89,8,7,3,1,0,3,6,9,8,3,3};
            int bereberliyiYoxlama = 0;

            for (int i=0;i<numbers.length;i++){
                if (numbers[i] == 3){
                    bereberliyiYoxlama++;
                }
            }
            System.out.println("massivde "+bereberliyiYoxlama + " eded 3 reqemi var");
        }

        //29. Scanner ilə istifadəçidən 10 ədəd al və yalnız tək ədədləri tərsinə sırada çap et.
        public static void printOddInReverseOrder(){
            int[] numbers = new int[5];
            for (int i=0;i<numbers.length;i++){
                numbers[i] = new Scanner(System.in).nextInt();
            }
            for (int  i=numbers.length - 1;i>=0;i--){
                if (numbers[i]%2 != 0){
                    System.out.println(numbers[i]);
                }
            }
        }

        //30. Verilmiş array-da bütün ədədlərin hasilini tap və çap et.
        public static void multiplyAllNumbers(){
            int[] numbers = {1,2,3,4,5};
            int hasili = 1;
            for (int i=0;i<numbers.length;i++){
                hasili *= numbers[i];
            }
            System.out.println(hasili);
        }

}
