package extreme.refactor.gilded_rose;

public class BackstagePass extends Item{

    public BackstagePass(int sellIn, int quality) {
        super(BACKSTAGE_PASS, sellIn, quality);
    }

    @Override
    public void updateItem() {
        increaseOneQuality();
        if (sellIn < 11) {
            increaseOneQuality();
        }
        if (sellIn < 6) {
            increaseOneQuality();
        }
        updateOneSellIn();
        if (isExpire()) {
            quality = 0;
        }
    }
}
