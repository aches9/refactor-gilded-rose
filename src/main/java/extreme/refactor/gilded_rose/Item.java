package extreme.refactor.gilded_rose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

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

    public boolean isAgedBrie(){
        return AGED_BRIE.equals(name);
    }

    public boolean isBackstagePasses(){
        return BACKSTAGE_PASSES.equals(name);
    }

    public boolean isSulfuras(){
        return SULFURAS.equals(name);
    }

    public void updateSellIn(){
        if (!isSulfuras()) {
            sellIn -= 1;
        }
    }

    public void updateItem (){
        if (!isAgedBrie() && !isBackstagePasses()) {
            if (quality > MIN_VALUE) {
                if (!isSulfuras()) {
                    quality -= 1;
                }
            }
        } else {
            if (quality < MAX_QUALITY) {
                quality += 1;

                if (isBackstagePasses()) {
                    if (sellIn < 11) {
                        if (quality < MAX_QUALITY) {
                            quality += 1;
                        }
                    }

                    if (sellIn < 6) {
                        if (quality < MAX_QUALITY) {
                            quality += 1;
                        }
                    }
                }
            }
        }

        updateSellIn();

        if (sellIn < MIN_VALUE) {
            if (!isAgedBrie()) {
                if (!isBackstagePasses()) {
                    if (quality > MIN_VALUE) {
                        if (!isSulfuras()) {
                            quality -= 1;
                        }
                    }
                } else {
                    quality = MIN_VALUE;
                }
            } else {
                if (quality < MAX_QUALITY) {
                    quality += 1;
                }
            }
        }
    }
}
