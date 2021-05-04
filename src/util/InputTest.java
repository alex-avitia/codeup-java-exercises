package util;

public class InputTest {

    public static void main(String[] args) {

        Input scan = new Input();

        scan.getString();

        if (scan.yesNo()){

            // num2 should always exceed num1, creating a min and max with at least 5 numbers difference
            int num1 = (int)(Math.random() * 20) + 1;
            int num2 = (int)(Math.random() * 20 + 5) + num1;

            System.out.println(scan.getInt(num1, num2));

            System.out.println(scan.getInt());

        } else {
            double dub1 = (Math.random() * 20) + 1;
            double dub2 = (Math.random() * 20) + dub1;

            System.out.println(scan.getDouble(dub1, dub2));

            System.out.println(scan.getDouble());
        }

    }
}
