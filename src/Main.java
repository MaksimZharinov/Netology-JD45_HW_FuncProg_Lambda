public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        try {
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: на ноль делить нельзя!");
        } catch (Exception e) {
            System.out.println("Общий обработчик исключений.");
        }

//        Программа кидает ошибку типа ArithmeticException, т.к.
//        в переменной b получается ноль, а на ноль делить нельзя

        OnTaskDoneListener listenerDone = System.out::println;
        OnTaskErrorListener listenerError = System.out::println;
        Worker worker = new Worker(listenerDone, listenerError);

        worker.start();
    }
}
