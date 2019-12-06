import java.util.Calendar;

public class Ingredient {
    protected String name;
    protected Calendar date=Calendar.getInstance();
    protected int warranty;
    Ingredient(String name,int warranty){
        this.name=name;
        this.warranty=warranty;
    }

}
