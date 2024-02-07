package lesson6.examples.TestWidgetPro;

public class Main
{
    public static void main(String[] args)
    {
        WidgetPro wp = new WidgetPro(900, 200, 300L, "Type");

        wp.getWidgetType();
        wp.calcCost();
        wp.calcProfit();
        wp.calcSalesPrice();
        wp.getName();
        wp.printItemReport();

        System.out.println(wp.calcProfit());
    }
}
