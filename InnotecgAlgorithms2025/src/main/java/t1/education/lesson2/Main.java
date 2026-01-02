package t1.education.lesson2;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11, 13};

        // 0
        System.out.println(binarySearch(arr, 1));

        // 6
        System.out.println(binarySearch(arr, 13));

        // 3
        System.out.println(binarySearch(arr, 7));

        // -1
        System.out.println(binarySearch(arr, 20));


    }

    /**
     * Ответы на вопросы:
     * 1) Почему бинарный поиск нельзя применять к неотсортированному массиву?
     * Так как бинарный поиск основан на идее отсортированности чисел в массиве. Без порядка нельзя гарантировать, что искомое число не находится в отбрасываемой половине.
     * <p>
     * <p>
     * 2) Какая асимптотическая сложность алгоритма по времени?
     * Асимптотическая сложность по времени равняется O(logn), где n - размер массива.
     * Так как каждый раз мы делим пополам, то кол-во элементов будет меняться следующим образом:
     * n -> n/2 -> n/4 -> ... -> 1. На каждом шаге мы за O(1) сравниваем искомый элемент с array[mid].
     * Поэтому кол-во операций равняется кол-во шагов в этой цепочки - пусть оно равняется k.
     * Тогда имеем, что n / 2 ^ k = 1 -> 2^k = n -> k = logn
     * <p>
     * <p>
     * Какая сложность по памяти?
     * По памяти сложность O(1), так как мы не создаём объектов, размер которых зависит от n.
     *
     * @param array  отсортированный массив
     * @param target искомое число
     * @return индекс числа target в массиве array
     */
    public static int binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {

            int mid = left + ((right - left) / 2);

            if (array[mid] == target) {

                return mid;
            } else if (array[mid] < target) {

                left = mid + 1;
            } else {

                // тут случай array[mid] > target
                right = mid - 1;
            }

        }

        return -1;


    }
}
