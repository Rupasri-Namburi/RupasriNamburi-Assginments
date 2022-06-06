import java.util.function.Supplier;

public class SupplierFun {
    public static void main(String[] args) {
        int n = 13;
        display(() -> n + 10);
        display(() -> n + 100);
    }

    static void display(Supplier<Integer> arg) 
    {
        System.out.println(arg.get());
    }
}