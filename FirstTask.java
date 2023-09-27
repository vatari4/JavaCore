
// 1. Входящие данные: расстояние в сантиметрах - N.
int N = 1000; // Пример ввода значения N
int meters = N / 100;
System.out.println("Число полных метров: " + meters);


// // 2. Входящие данные: количество секунд - N.
// int N = 3665; // Пример ввода значения N
// int hours = N / 3600;
// int minutes = (N % 3600) / 60;
// int seconds = (N % 3600) % 60;
// System.out.println("Полных часов: " + hours);
// System.out.println("Полных минут: " + minutes);
// System.out.println("Полных секунд: " + seconds);


// // 3. Входящие данные: двузначное число - N.
// int N = 56; // Пример ввода значения N
// int tens = N / 10;
// int ones = N % 10;
// int sum = tens + ones;
// int product = tens * ones;
// System.out.println("Число десятков: " + tens);
// System.out.println("Число единиц: " + ones);
// System.out.println("Сумма цифр: " + sum);
// System.out.println("Произведение цифр: " + product);


// // 4. Входящие данные: координаты точек (x1, y1) и (x2, y2).
// int x1 = 2; // Пример ввода значения x1
// int y1 = 3; // Пример ввода значения y1
// int x2 = 5; // Пример ввода значения x2
// int y2 = 7; // Пример ввода значения y2
// double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
// System.out.println("Расстояние: " + distance);

// // 5. Входящие данные: целые числа X, Y, Z.
// int X = 3; // Пример ввода значения X
// int Y = 4; // Пример ввода значения Y
// int Z = 5; // Пример ввода значения Z
// boolean isPythagoreanTriple = (X * X + Y * Y == Z * Z) || (X * X + Z * Z == Y * Y) || (Y * Y + Z * Z == X * X);
// System.out.println("Являются ли числа тройкой Пифагора: " + isPythagoreanTriple);

// // 6. Входящие данные: радиус круга - R.
// double R = 5.0; // Пример ввода значения R
// double area = Math.PI * R * R;
// double circumference = 2 * Math.PI * R;
// System.out.println("Площадь круга: " + area);
// System.out.println("Длина окружности: " + circumference);

// // 7. Входящие данные: значение X.
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Введите значение X: ");
//         double x = scanner.nextDouble();
        
//         double y;
//         if (x > 0) {
//             y = Math.pow(Math.sin(x), 2);
//         } else {
//             y = 1 - 2 * Math.pow(Math.sin(x), 2);
//         }
        
//         System.out.println("Значение Y: " + y);
//     }
// }


// ChatGPT & Midjourney | New bot, [17.09.2023 14:19]
// 1. 

// public class Main {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 100; i++) {
//             if (i % 3 == 0) {
//                 System.out.println(i);
//             }
//         }
//     }
// }

// 2. 

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int a = scanner.nextInt();
//         int b = scanner.nextInt();
//         for (int i = a; i <= b; i++) {
//             if (i % 7 == 0) {
//                 System.out.println(i);
//             }
//         }
//     }
// }

// 3. 

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int a = scanner.nextInt();
//         int b = scanner.nextInt();
//         int c = scanner.nextInt();
//         int max = a;
//         if (b > max) {
//             max = b;
//         }
//         if (c > max) {
//             max = c;
//         }
//         System.out.println(max);
//     }
// }

// 4. 

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int a = scanner.nextInt();
//         int b = scanner.nextInt();
//         int c = scanner.nextInt();
//         double average = (a + b + c) / 3.0;
//         System.out.println(average);
//     }
// }

// 5. 

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         boolean isPrime = true;
//         for (int i = 2; i < n; i++) {
//             if (n % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }
//         if (isPrime) {
//             System.out.println("Простое число");
//         } else {
//             System.out.println("Не простое число");
//         }
//     }
// }

// 6. 

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int sum = 0;
//         for (int i = 1; i <= n; i++) {
//             sum += i;
//         }
//         System.out.println(sum);
//     }
// }

// 7. 

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int factorial = 1;
//         for (int i = 2; i <= n; i++) {
//             factorial *= i;
//         }
//         System.out.println(factorial);
//     }
// }

// 8. 

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(i + " * " + n + " = " + i * n);
//         }
//     }
// }

// 9. 

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int sum = 0;
//         while (n > 0) {
//             sum += n % 10;
//             n /= 10;
//         }
//         System.out.println(sum);
//     }
// }

// 10. 

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int[] array = new int[n];
//         for (int i = 0; i < n; i++) {
//             array[i] = scanner.nextInt();
//         }
//         int sumEven = 0;
//         int productOdd = 1;
//         for (int i = 0; i < n; i++) {
//             if (i % 2 == 0) {
//                 sumEven += array[i];
//             } else {
//                 productOdd *= array[i];
//             }
//         }
//         System.out.println("Сумма четных элементов: " + sumEven);
//         System.out.println("Произведение нечетных элементов: " + productOdd);
//     }
// }

// 11. 

// public class Main {
//     public static void main(String[] args) {
//         int[] array = {10, 5, 8, 7, 12, 15, 3, 6, 9, 11, 14, 4, 2, 1, 0, 13, 16, 19, 18, 17};
//         int maxIndex = 0;
//         int minIndex = 0;

// ChatGPT & Midjourney | New bot, [17.09.2023 14:19]
// for (int i = 1; i < array.length; i++) {
//             if (array[i] > array[maxIndex]) {
//                 maxIndex = i;
//             }
//             if (array[i] < array[minIndex]) {
//                 minIndex = i;
//             }
//         }
//         System.out.println("Максимальное количество осадков: " + array[maxIndex] + ", день: " + (maxIndex + 1));
//         System.out.println("Минимальное количество осадков: " + array[minIndex] + ", день: " + (minIndex + 1));
//     }
// }

// 12. 

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         double distance = scanner.nextDouble();
//         double fuelConsumption = scanner.nextDouble();
//         double fuelPrice = scanner.nextDouble();
//         double fuelAmount = distance * fuelConsumption / 100;
//         double moneySpent = fuelAmount * fuelPrice;
//         System.out.println("Расход топлива: " + fuelAmount + " л");
//         System.out.println("Деньги потрачены: " + moneySpent + " руб");
//     }
// }

// 13. 

// public class Main {
//     public static void main(String[] args) {
//         int[] array = {5, 10, 15, 20, 25};
//         int sum = 0;
//         for (int i = 0; i < array.length; i++) {
//             sum += array[i];
//         }
//         double average = sum / (double) array.length;
//         System.out.println("Среднее арифметическое: " + average);
//     }
// }

// 14. 

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int sum = 1;
//         int powerOfTwo = 1;
//         for (int i = 0; i < n; i++) {
//             sum += powerOfTwo;
//             powerOfTwo *= 2;
//         }
//         System.out.println(sum);
//     }
// }

// 15. 

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int x = scanner.nextInt();
//         int y = scanner.nextInt();
//         int product = 0;
//         for (int i = 0; i < y; i++) {
//             product += x;
//         }
//         System.out.println(product);
//     }
// }