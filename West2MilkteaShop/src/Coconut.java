import java.util.Calendar;

public class Coconut extends Ingredient {
    Coconut() {
        super("Coconut", 5);
    }
    String getName(){
        return super.name;
    }
    Calendar getData(){
        return super.date;
    }
    int getWarranty(){
        return  super.warranty;
    }
}
