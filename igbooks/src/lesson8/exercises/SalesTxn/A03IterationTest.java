package lesson8.exercises.SalesTxn;

import java.util.List;

public class A03IterationTest
{
    public static void main(String[] args)
    {
        List<SalesTxn> tList = SalesTxn.createTxnList();
                      
        System.out.println("\n== CA Transations Lambda ==");
        tList.stream()
            .filter(t -> t.getState().equals("CA"))
            .forEach(SalesTxn::printSummary);    
    }   
}
