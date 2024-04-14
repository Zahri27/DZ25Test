public class ArrayOperations {

    public double calculateAverage(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }
}
