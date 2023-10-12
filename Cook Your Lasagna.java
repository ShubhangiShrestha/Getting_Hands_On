public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    private final int expectedTime=40;
    private final int timeToCookOneLayer=2;
    public int expectedMinutesInOven(){
        return expectedTime;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int inTheOven){
        int actualMinutes=expectedTime-inTheOven;
        return actualMinutes;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return (timeToCookOneLayer*layers);
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int inTheOven){
        return ((timeToCookOneLayer*layers)+inTheOven);
    }
}
