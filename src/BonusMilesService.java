public class BonusMilesService {
    public int calculate(int price) {
        int miles;
        int onemile = 20;
        miles = price / onemile;
        return miles;
    }
}
