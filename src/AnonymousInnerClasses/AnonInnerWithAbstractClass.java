package AnonymousInnerClasses;

public class AnonInnerWithAbstractClass {
    abstract class SaleTodayOnly{
        abstract int dollarsOff();
    }

    public int addmission(int basePrice){
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }
}
