package extreme.refactor.gilded_rose;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = getItems();

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        printResult(days,items,app);

    }

    public static Item[] getItems(){
        return new Item[] {
                Item.newItem("+5 Dexterity Vest", 10, 20), //
                Item.newItem("Aged Brie", 2, 0), //
                Item.newItem("Elixir of the Mongoose", 5, 7), //
                Item.newItem("Sulfuras, Hand of Ragnaros", 0, 80), //
                Item.newItem("Sulfuras, Hand of Ragnaros", -1, 80),
                Item.newItem("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                Item.newItem("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                Item.newItem("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet ??
                Item.newItem("Conjured Mana Cake", 3, 6)
        };
    }

    public static void printResult(int days, Item[] items, GildedRose app){
        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}