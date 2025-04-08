
public class Calculator {
    private final Reader reader;
    private int calculations;

    public Calculator() {
        this.reader = new Reader();
        this.calculations = 0;
    }

    public void start() {
        label: while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            
            if (command.equals("end")) {
                break label;
            } else if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }
        statistics();
    }

    private void sum() {
        System.out.print("Value1: ");
        int value1 = reader.readInteger();
        System.out.print("Value2: ");
        int value2 = reader.readInteger();
        int sum = value1 + value2;
        System.out.println("sum of the values " + sum);
        calculations++;
    }

    private void difference() {
        System.out.print("Value1: ");
        int value1 = reader.readInteger();
        System.out.print("Value2: ");
        int value2 = reader.readInteger();
        int difference = value1 - value2;
        System.out.println("difference of the values " + difference);
        calculations++;
    }

    private void product() {
        System.out.print("Value1: ");
        int value1 = reader.readInteger();
        System.out.print("Value2: ");
        int value2 = reader.readInteger();
        int product = value1 * value2;
        System.out.println("product of the values " + product);
        calculations++;
    }

    private void statistics() {
        System.out.println("Calculations done " + calculations);
    }
}
