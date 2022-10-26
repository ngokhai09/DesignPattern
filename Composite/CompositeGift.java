package DesignPattern.Composite;


class CompositeGift extends GiftBase{
    private String name;
    private double price;

    @Override
    public void addChildGift(GiftBase gift) {
        // TODO Auto-generated method stub
        super.addChildGift(gift);
    }

    @Override
    public void getChildren(GiftBase gift) {
        // TODO Auto-generated method stub
        super.getChildren(gift);
    }

    @Override
    public void removeChildGift(GiftBase gift) {
        // TODO Auto-generated method stub
        super.removeChildGift(gift);
    }

    @Override
    public int CalculateTotalPrice() {
        
        return 0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
    
}