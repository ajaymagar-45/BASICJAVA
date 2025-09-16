package JavaBasics;

class Main {

    public int addNumbers(int a, int b) {
        int sum = a + b;
        // return value
        return sum;
    }

    public static void main(String[] args) {

        int num1 = 95;
        int num2 = 85;
         Main obj = new Main();
         int result = obj.addNumbers(num1, num2);
        System.out.println("Sum : " + result);
    }
}