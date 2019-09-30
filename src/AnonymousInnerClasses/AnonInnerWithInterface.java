package AnonymousInnerClasses;

public class AnonInnerWithInterface {
    interface SaleTodayOnly{ int dollarsOff(); }

    public int pay(){
        return admission(5, new SaleTodayOnly() {
            @Override
            public int dollarsOff() {
                return 3;
            }
        });
    }

    public int admission(int basePrice, SaleTodayOnly saleTodayOnly){
        return basePrice - saleTodayOnly.dollarsOff();
    }
}
