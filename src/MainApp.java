public class MainApp {

    public static void main(String[] args) {
//        //zadanie 4a
        int[] numbers = {1, 2, 3, 4, 5};

        numbers[numbers.length - 1] = numbers[numbers.length - 1] + numbers[0];
        numbers[0] = numbers[numbers.length - 1] - numbers[0];
        numbers[numbers.length - 1] = numbers[numbers.length - 1] - numbers[0];

        for (int number : numbers) {

            System.out.println(number);
        }
//
//        //zadanie 4b
        int[] evenAndOddNumbers = {2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2};

        int odd = 0;
        int even = 0;

        for (int number : evenAndOddNumbers) {
            if (number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }

        }
        System.out.println("There are " + odd + " odd numbers and " + even + " even numbers.");


        // zadanie 4c - posortuj tablicę malejąco
        int[] descendingArray = {2, 4, 1, 9, 5, 2, 4, 8, 5, 8};
        int max;

        for (int i = 0; i < descendingArray.length; i++) {
            max = descendingArray[i];
            for (int j = i + 1; j < descendingArray.length; j++) {
                if (descendingArray[j] > max) {
                    max = descendingArray[j];
                    descendingArray[j] = descendingArray[i];
                    descendingArray[i] = max;
                }
            }
        }
        for (int number : descendingArray) {
            System.out.println(number);
        }

    }
}