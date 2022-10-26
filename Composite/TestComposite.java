package DesignPattern.Composite;

class TestComposite{
    public static void main(String[] args) {
        CompositeGift compositeGift = new CompositeGift("Box 1", 0);
        CompositeGift compositeGift1 = new CompositeGift("Box 2", 0);

        SingleGift singleGift1 = new SingleGift("Doll", 5.5);
        SingleGift singleGift2 = new SingleGift("Ball", 4.6);
        SingleGift singleGift3 = new SingleGift("Ballon", 10.5);

        compositeGift1.addChildGift(singleGift3);
        compositeGift.addChildGift(singleGift1);
        compositeGift.addChildGift(singleGift2);
        compositeGift.addChildGift(compositeGift1);

        System.out.println(compositeGift.CalculateTotalPrice());


    }
}