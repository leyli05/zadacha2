public class Main {
    public static void main(String[] args) {
        int amount;
        amount = 1100;
        int chet;
        chet = 200;
        int percent;
        if (amount > 1000) {
            percent = amount / 100;
        } else {
            percent = 0;
        }
        System.out.println(chet + amount + (amount / 100));
        System.out.println(amount / 100);
    }

}

