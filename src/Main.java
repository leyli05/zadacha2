public class Main {
    public static void main(String[] args) {
        int amount = 1100;
        int balance = 200;
        int percent;
        if (amount > 1000) {
            percent = amount / 100;
        } else {
            percent = 0;
        }
        System.out.println(balance + amount + (amount / 100));
        System.out.println(amount / 100);
    }

}

