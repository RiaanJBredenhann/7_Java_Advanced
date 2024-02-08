package lesson8.exercises.SalesTxn;

import java.util.List;

public class A04IterationTest
{
    public static void main(String[] args)
    {
        List<SalesTxn> tList = SalesTxn.createTxnList();
        
        System.out.println("\n== CA Transations for ACME double filter ==");
        tList.stream()
            .filter(t -> t.getState().equals(State.CA))
            .filter(t -> t.getBuyerName().equals("Acme Electronics"))
            .forEach(SalesTxn::printSummary);

        System.out.println("\n== CA Transations for ACME logical operators==");
        tList.stream()
            .filter(t -> t.getState().equals(State.CA) && t.getBuyer().getName().equals("Acme Electronics"))
            .forEach(SalesTxn::printSummary);
    }  
}