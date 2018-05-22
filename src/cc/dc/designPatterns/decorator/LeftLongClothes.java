package cc.dc.designPatterns.decorator;

public class LeftLongClothes extends ClothesDecorator {

    @Override
    public void designClothes() {
        System.out.print(",and left long right short");
        super.designClothes();
    }
}
