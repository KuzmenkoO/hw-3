public class ATM {
    public int countBanknotes(int sum) {
        int zal = sum;
        int a = zal / 500;
        if (a > 0) {
            zal = zal - (a * 500);
        }
        int b = zal / 200;
        if (a > 0) {
            zal = zal - (b * 200);
        }
        int c = zal / 100;
        if (a > 0) {
            zal = zal - (c * 100);
        }
        int d = zal / 50;
        if (d > 0) {
            zal = zal - (d * 50);
        }
        int e = zal / 20;
        if (e > 0) {
            zal = zal - (e * 20);
        }
        int f = zal / 10;
        if (f > 0) {
            zal = zal - (f * 10);
        }
        int g = zal / 5;
        if (g > 0) {
            zal = zal - (g * 5);
        }
        int s = zal / 2;
        if (s > 0) {
            zal = zal - (s * 2);
        }
        int r = zal / 1;
        if (r > 0) {
            zal = zal - (r * 1);
        }


        int result = a + b + c + d + e + f + g + s + r;
        return result;
    }
}
