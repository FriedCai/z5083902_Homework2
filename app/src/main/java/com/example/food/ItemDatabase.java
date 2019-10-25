package com.example.food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ItemDatabase {
    public static Item getItemById(int itemID){return items.get(itemID);}

    public static ArrayList<Item> getAllItems(){
        return new ArrayList<Item>((List) Arrays.asList(items.values().toArray()));
    }

    private static final HashMap<Integer, Item> items = new HashMap<>();

    private static final HashMap<Integer, Item> cartList = new HashMap<>();

    public static void addItem(int number,Item itemObj){
        Item item = cartList.get(itemObj.id);
        if (item==null){
            itemObj.count = number;

            cartList.put(itemObj.id,itemObj);
        }else{
            item.count +=number;
        }
    }

    public static ArrayList<Item> getCart(){
        return new ArrayList<Item>((List) Arrays.asList(cartList.values().toArray()));
    }

    static{
        items.put(1, new Item(
                1,
                "RODEO CHEESEBURGER",
                7,
                "Try another twist on our classic cheeseburger. Flame-grilled 100% Australian beef and a slice of cheese topped off with crisp onion rings, lashings of mayo and BBQ sauce, all on a toasted sesame seed bun.",
                R.drawable.i1
        ));
        items.put(2, new Item(
                2,
                "HASH BROWN CHEESEBURGER",
                7,
                "Classic combo of a flame-grilled Aussie beef patty topped with cheese, mayo, mustard and ketchup, finished off with a golden crunchy hash brown.",
                R.drawable.i2
        ));
        items.put(3, new Item(
                3,
                "BACON DELUXE",
                7,
                "Tackle hunger head-on with this unbeatable combo of flame-grilled Aussie beef, plus fresh lettuce, ripe hand-cut tomato and mayo, teamed up with premium eye bacon and a slice of cheese.",
                R.drawable.i3
        ));

        items.put(4, new Item(
                4,
                "CHEESEBURGER",
                7,
                "Classic combo of a flame-grilled Aussie beef patty topped with cheese, crunchy pickle, mustard and tomato sauce, served on a freshly toasted sesame seed bun. Basic - but brilliant.",
                R.drawable.i4
        ));

        items.put(5, new Item(
                5,
                "DOUBLE CHEESEBURGER",
                7,
                "The Cheeseburger with twice the flavour. Two flame-grilled 100% beef patties, two slices of cheese, pickles, mustard and tomato sauce on a toasted sesame seed bun.",
                R.drawable.i5
        ));
        items.put(6, new Item(
                6,
                "TRIPLE CHEESEBURGER",
                7,
                "Our classic cheeseburger to the power three: Triple the flame-grilled Aussie beef, triple the cheese, finished off with pickles, mustard and tomato sauce. Because you just can’t have too much of a good thing.",
                R.drawable.i6
        ));
        items.put(7, new Item(
                7,
                "BBQ CHEESEBURGER",
                7,
                "Made with 100% flame-grilled Australian beef with no added hormones, cheese, lashings of BBQ sauce and mayonnaise, all on a toasted bun",
                R.drawable.i7
        ));
        items.put(8, new Item(
                8,
                "GRILLED CHICKEN BURGER",
                7,
                "Flame-grilled chicken breast fillet, topped with fresh salad and our creamy Ranch dressing on a toasted sesame seed bun. If you love chicken, you will love our succulent flame-grilled breast fillet chicken burger.",
                R.drawable.i8
        ));
        items.put(9, new Item(
                9,
                "TENDERCRISP BURGER",
                7,
                "Like tender, juicy, 100% chicken breast fillets in a golden crispy coating? Then Tendercrisp is made for you. It comes with hand-cut tomato, lettuce and creamy mayo on a sesame seed bun.",
                R.drawable.i9
        ));
        items.put(10, new Item(
                10,
                "CHICKEN ROYALE BURGER",
                7,
                "Get the royal treatment, chicken style. We're talking 100% crispy coated chicken layered with lettuce and creamy mayo.",
                R.drawable.i10
        ));
        items.put(11, new Item(
                11,
                "CHICKEN NUGGETS",
                7,
                "Crispy, golden nuggets made with 100% chicken breast, cooked in sunflower and canola oil for a better tasting golden finish. Our nuggets are as good as gold. Choose from our delicious dipping sauces BBQ, Spicy, Honey Mustard or Sweet 'n Sour sauce.",
                R.drawable.i11
        ));
        items.put(12, new Item(
                12,
                "THICK CUT CHIPS",
                7,
                "Our thick cut chips are deliciously seasoned, delivering a crispier crunch on the outside, fluffy and hot on the inside. The chips are better at Hungry Jack's. Available in Small, Medium or Large.",
                R.drawable.i12
        ));
        items.put(13, new Item(
                13,
                "ONION RINGS",
                7,
                "A Hungry Jack's favourite, you'll be crying over if you miss them! Freshly battered, crispy onion rings available in Medium or Large.",
                R.drawable.i13
        ));
        items.put(14, new Item(
                14,
                "COKE",
                7,
                "Your favourite thirst-quenching Coke.",
                R.drawable.i14
        ));
        items.put(15, new Item(
                15,
                "COKE NO SUGAR",
                7,
                "Your favourite thirst-quenching Coke No Sugar",
                R.drawable.i15
        ));
    }


















}
