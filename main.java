public class main {
    public void main(String[] args) {
        System.out.println(sumOfEvenOrOdd(new int[] {1,2,3,4,5,2}));
    }
    public String sumOfEvenOrOdd(int[] array) {
        int sumE = 0;
        int sumO = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumE+=array[i];
            }
            else {
                sumO +=array[i];
            }
        }
       return "The even sum: " + sumE + "\n" + "The odd sum: " + sumO;
    }
}