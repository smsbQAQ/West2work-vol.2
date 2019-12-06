import java.util.Calendar;

public class Bubble extends Ingredient {
    Bubble() {
        super("Bubble",7);
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
