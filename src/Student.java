public class Student {

    public static void main(String[] args) {

        String name = "Rocky";
        int avg = 33;

        if (avg == 100) {
            System.out.println(name + " " + "got a perfect score of " + avg);
        }else if (avg >= 50){
            System.out.println(name + " " + "got a passing grade of " + avg);
        }else if (avg < 50 ) {
            System.out.println(name + " " + "did not pass with a score of " + avg);
        }
    }

}
