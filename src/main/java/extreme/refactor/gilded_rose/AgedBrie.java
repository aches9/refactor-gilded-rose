package extreme.refactor.gilded_rose;

public class AgedBrie extends Item{

    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    public void updateItem() {
        updateOneSellIn();
        increaseOneQuality();
        if (isExpire()) {
            increaseOneQuality();
        }
    }
}
