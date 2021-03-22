public class BonusMilesService {
    public long calculate(int price) {
        int priceBonus = 20;
        int customerBonus = 1;
        int miles = price / priceBonus * customerBonus;
        return miles;
    }
}
