public class Main {
    public static void main(String[] args) {
        int first_int = 2;
        int second_int = 3;
        int third_int = 2;
        int fourth_int = 6;

        int sum_one = first_int + second_int;
        int sum_two = third_int + fourth_int;

        boolean result_one = sum_one < sum_two;
        System.out.println(result_one);

        ++sum_one;
        sum_two -= 2;

        boolean result_two = sum_one > sum_two;
        System.out.println(result_two);

        if (sum_one % 2 == 0 | sum_two % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

}
