package lesson6.examples.TestInterfaceWithParent;

public class TestInterfaceWithParent implements WidgetSalesCalcs {
    @Override
    public String getWidgetType() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public double calcSalesPrice() {
        return 0;
    }

    @Override
    public double calcCost() {
        return 0;
    }

    @Override
    public double calcProfit() {
        return 0;
    }
}
