public class MilkTea {
    private String name;
    private Ingredient ingredient;
    MilkTea(String name,Ingredient ingredient){
        this.name=name;
        this.ingredient=ingredient;
    }
    public int getType(){
        if(this.ingredient instanceof Bubble){
            return 0;
        }
        return 1;
    }
}
