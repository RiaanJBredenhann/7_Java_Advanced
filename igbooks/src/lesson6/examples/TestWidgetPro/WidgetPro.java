package lesson6.examples.TestWidgetPro;

import lesson6.exercises.ProductSalesInterface2.Widget;
import lesson6.exercises.ProductSalesInterface2.WidgetSalesCalcs;

public class WidgetPro extends Widget implements WidgetSalesCalcs {
  private String type;
  
  public WidgetPro(double salesPrice, double cost, long quantity, String type){
    super(salesPrice, cost, quantity);
    this.type = type;
  }
  
  public String getWidgetType(){
    return type;
  }
  
}
