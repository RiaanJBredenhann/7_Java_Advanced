package lesson9.exercises.SalesTxnPkg;

import java.util.function.Function;

public interface UnaryOperator<T> extends Function<T,T> {
    @Override
    public T apply(T t);
}