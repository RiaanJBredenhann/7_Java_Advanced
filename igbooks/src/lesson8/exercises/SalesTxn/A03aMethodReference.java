package lesson8.exercises.SalesTxn;

import lesson9.exercises.SalesTxnPkg.Predicate;

import java.util.List;

public class A03aMethodReference
{
    public static void main(String[] args)
    {
        List<SalesTxn> tList = SalesTxn.createTxnList();
        Predicate<SalesTxn> predicate  = t -> t.getState().equals(State.CA);

        System.out.println("\n== CA Transations Lambda ==");
        tList.stream()
            .filter(t -> t.getState().equals(State.CA))
            .forEach(t -> t.printSummary());

        tList.stream()
                .filter(t -> t.getState().equals(State.CA))
                .forEach(SalesTxn::printSummary);
    }   
}
