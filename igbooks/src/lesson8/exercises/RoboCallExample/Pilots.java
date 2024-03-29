package lesson8.exercises.RoboCallExample;

import java.util.function.Predicate;

public class Pilots implements Predicate<Person>{
    
    @Override
    public boolean test(Person p){
        return p.getAge() >= 23 && p.getAge() <= 65;
    }
}
