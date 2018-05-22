package cc.dc.designPatterns.decorator;

public class TShit extends ClothesDecorator {

    @Override
    public void designClothes() {
        System.out.print("生产TShit");
        super.designClothes();
    }
}
