//figure out how to edit code so I can calculate price per pound

//ASSUME THIS STORE ONLY SELLS PRODUCE :)

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> inventory = new ArrayList<Product>();
        inventory.add(new Product("Apple, Fuji", 4001, true, 1.05, 400, "Tree Fruit"));
        inventory.add(new Product("Apple, Granny Smith", 4002, true, 1.05, 388, "Tree Fruit"));
        inventory.add(new Product("Apple, Pink Lady", 4003, true, 1.05, 350, "Tree Fruit"));
        inventory.add(new Product("Apple, Red Delicious", 4004, true, 1.05, 371, "Tree Fruit"));
        inventory.add(new Product("Lettuce, Butter", 5601, true, 1.05, 98, "Leafy Greens"));
        inventory.add(new Product("Lettuce, Romaine", 5602, true, 1.05, 94, "Leafy Greens"));
        inventory.add(new Product("Lettuce, Iceberg", 5603, true, 1.05, 88, "Leafy Greens"));
        inventory.add(new Product("Strawberry container, large,", 4131, true, 1.05, 40, "Berry"));
        inventory.add(new Product("Strawberry container, small,", 4132, true, 1.05, 39, "Berry"));
        inventory.add(new Product("Raspberry container, large,", 4231, true, 1.05, 45, "Berry"));
        inventory.add(new Product("Raspberry container, small,", 4232, true, 1.05, 47, "Berry"));
        inventory.add(new Product("Blackberry container, large,", 4331, true, 1.05, 49, "Berry"));
        inventory.add(new Product("Blackberry container, small,", 4332, true, 1.05, 42, "Berry"));
        inventory.add(new Product("Blueberry container, large,", 4441, true, 1.05, 43, "Berry"));
        inventory.add(new Product("Blueberry container, small,", 4442, true, 1.05, 44, "Berry"));
        inventory.add(new Product("Peach", 3004, true, 1.05, 102, "Tree Fruit"));
        inventory.add(new Product("Apricot", 3005, true, 1.05, 21, "Tree Fruit"));
        inventory.add(new Product("Lemon", 0101, true, 1.05, 45, "Citrus"));
        inventory.add(new Product("Lime", 0102, true, 1.05, 49, "Citrus"));
        inventory.add(new Product("Spinach, large container,", 5677, true, 1.05, 22, "Leafy Greens"));
        inventory.add(new Product("Spinach, small container,", 5678, true, 1.05, 43, "Leafy Greens"));
        inventory.add(new Product("Watermelon, large,", 3020, true, 1.05, 40, "Misc Fruit"));
        inventory.add(new Product("Watermelon, small,", 3021, true, 1.05, 40, "Misc Fruit"));
        inventory.add(new Product("Carrot, full size,", 5787, true, 1.05, 40, "Produce"));
        inventory.add(new Product("Baby carrots, large bag,", 5788, true, 1.05, 40, "Misc Vegetable"));
        inventory.add(new Product("Baby carrots, small bag,", 5789, true, 1.05, 40, "Misc Vegetable"));
        inventory.add(new Product("Plum", 3006, true, 1.05, 40, "Tree Fruit"));
        inventory.add(new Product("Fig", 3010, true, 1.05, 40, "Tree Fruit"));
        inventory.add(new Product("Orange, navel,", 0115, false, 1.05, 40, "Citrus"));
        inventory.add(new Product("Orange, blood,", 0116, false, 1.05, 40, "Citrus"));
        inventory.add(new Product("Tangerine", 0017, true, 1.05, 40, "Citrus"));
        inventory.add(new Product("Banana bunch", 4500, true, 1.05, 40, "Tropical Fruit"));
        inventory.add(new Product("Pineapple", 4600, true, 1.05, 40, "Tropical Fruit"));
        inventory.add(new Product("Mango", 4680, true, 1.05, 40, "Tropical Fruit"));
        inventory.add(new Product("Asparagus bag", 5993, true, 1.05, 40, "Misc Vegetable"));
        inventory.add(new Product("Brussels sprouts bag", 5994, true, 1.05, 40, "Misc Vegetable"));
        inventory.add(new Product("Green beans bag", 5995, true, 1.05, 40, "Misc Vegetable"));
        inventory.add(new Product("Broccoli bag", 5996, true, 1.05, 40, "Misc Vegetable"));


        //inventory.get(0).SetQuantity(25);
    }
}

