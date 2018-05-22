package cc.dc.designPatterns.decorator;

public class LeftBlueClothes extends ClothesDecorator{

    @Override
    public void designClothes() {
        System.out.print(",and left blue");
        super.designClothes();
    }
}
