import java.util.ArrayList;
import java.util.List;

public class Result {

    private List<Integer> bill;
    private int indexItemRefused;
    private double valuePerPesson;

    public Result(List<Integer> items, int indexItemRefused, double valuePerPesson) {
        this.bill = items;
        this.indexItemRefused = indexItemRefused;
        this.valuePerPesson = valuePerPesson;
        removeItem();
    }

    public void removeItem() {
        bill.remove(indexItemRefused);
    }

    public double sumValue() {
        double soma = 0;
        for (int i = 0; i < bill.size(); i++) {
            soma += bill.get(i);
        }
        return soma;
    }

    public double splitBill() {
        return sumValue() / 2;
    }

    public boolean givesValue() {
        if (splitBill() == valuePerPesson) {
            return true;
        } else return false;
    }

    public double calculateRefund() {
        if (givesValue()) {
            return 0;
        } else {
            return valuePerPesson - splitBill();
        }
    }

    public void printRefund() {
        if (calculateRefund() == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(calculateRefund());
        }
    }

}


