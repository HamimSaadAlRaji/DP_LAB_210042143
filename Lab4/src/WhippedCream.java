public class WhippedCream implements ICondiment{
    ICondiment condiment;
    public WhippedCream(ICondiment condiment){
        this.condiment = condiment;
    }
    public String Description(){
        return condiment.Description() + "+ WhippedCream";
    }
    public double cost(){
        return condiment.cost() + 3 ;
    }
}