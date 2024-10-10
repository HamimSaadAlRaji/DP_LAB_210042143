public class Sugar implements ICondiment{
    ICondiment condiment;
    public Sugar(ICondiment condiment){
        this.condiment = condiment;
    }
    public String Description(){
        return condiment.Description() + "+ Sugar";
    }
    public double cost(){
        return condiment.cost() + 1 ;
    }
}
