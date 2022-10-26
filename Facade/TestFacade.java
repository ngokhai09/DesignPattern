package DesignPattern.Facade;

class TestFacade {
    public static void main(String[] args) {
        ShopingFacade shopingFacade = new ShopingFacade();
        shopingFacade.buyProductByCashWithFreeShipping("khaingovan2001@gmail.com");
        shopingFacade.buyProductByPaypalWithStandardShipping("khaingovan2001@gmail.com", "0394229171");
    }
}