package extreme.refactor.gilded_rose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    private static final int MAX_QUALITY = 50;
    private static final int MIN_VALUE = 0;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public static Item newItem(String name, int sellIn, int quality){
        switch (name) {
            case AGED_BRIE:
                return new AgedBrie(sellIn, quality);
            case SULFURAS:
                return new Sulfuras(sellIn, quality);
            case BACKSTAGE_PASS:
                return new BackstagePass(sellIn, quality);
            default:
                return new Item(name, sellIn, quality);
        }
    }

    void updateOneSellIn(){
        sellIn -= 1;
    }

    void increaseOneQuality(){
        if (quality < MAX_QUALITY) {
            quality += 1;
        }
    }

    void decreaseOneQuality(){
        if (quality > MIN_VALUE) {
            quality -= 1;
        }
    }

    boolean isExpire() {
        return sellIn < MIN_VALUE;
    }

    public void updateItem (){
        updateOneSellIn();
        decreaseOneQuality();
        if(isExpire()){
            decreaseOneQuality();
        }
    }
}
