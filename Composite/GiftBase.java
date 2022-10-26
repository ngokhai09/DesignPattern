package DesignPattern.Composite;

public abstract class GiftBase {
    public abstract String getName();
    public abstract double getPrice();

    public void addChildGift(GiftBase gift) {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    public void removeChildGift(GiftBase gift) {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }
    public void getChildren(GiftBase gift) {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    public abstract int CalculateTotalPrice();
}