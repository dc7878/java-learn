package cc.dc.designPatterns.decorator;

public class RightLongClothes extends ClothesDecorator {

    @Override
    public void designClothes() {
        System.out.print(",and right long left short");
        super.designClothes();
    }
}
