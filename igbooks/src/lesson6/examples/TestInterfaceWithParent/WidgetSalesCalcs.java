package lesson6.examples.TestInterfaceWithParent;

import lesson6.exercises.ProductSalesInterface2.SalesCalcs;

public interface WidgetSalesCalcs extends SalesCalcs {
  public String getWidgetType();
}
