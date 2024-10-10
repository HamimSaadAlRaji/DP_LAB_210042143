public class Milk implements ICondiment{
    ICondiment condiment;
    public Milk(ICondiment condiment){
        this.condiment = condiment;
    }
    public String Description(){
        return condiment.Description() + "+ Milk";
    }
   public double cost(){
        return condiment.cost() + 2 ;
   }
}
