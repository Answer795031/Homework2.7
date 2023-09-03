import java.util.*;

public class ListManagement {

    private static List<Integer> nums = new ArrayList<>(List.of(6, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 3, 9, 4));
    private static List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

    public static void oddNumberSort(){

        List<Integer> oddNums = new ArrayList<>();

        System.out.print("\nВсе нечетные числа: ");
        for (Integer num : nums) {
            if (num % 2 != 0){
                oddNums.add(num);
            }
        }
        System.out.println(oddNums);
    }

    public static void evenNumberSort(){

        HashSet<Integer> evenNums = new HashSet<>();

        System.out.print("\nЧетные числа в порядке возрастания без повторений: ");
        for (Integer num : nums){
            if (num % 2 == 0){
                evenNums.add(num);
            }
        }

        List<Integer> sortNums = new ArrayList<>(evenNums);
        Collections.sort(sortNums);
        System.out.println(sortNums);
    }

    public static void uniqueElementsSort(){

        HashSet<String> uniqueElements = new HashSet<>(strings);

        System.out.print("\nУникальные значения: ");
        System.out.println(uniqueElements);
    }

    public static void elementsFrequency(){

        Set<String> elementsFrequency = new HashSet<>(strings);

        System.out.print("\nЧисло вхождений элементов в список:\n");
        for (String s: elementsFrequency) {
            System.out.println(s + ": " + Collections.frequency(strings, s));
        }
    }
}
