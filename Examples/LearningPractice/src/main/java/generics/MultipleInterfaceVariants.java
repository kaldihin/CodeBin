package generics;

interface Payable<T> {}

class Employee1 implements Payable {}

class Hourly extends Employee1 implements Payable {}

public class MultipleInterfaceVariants {
}
