package cc.dc.designPatterns.decorator;

public class RightRedClothes extends ClothesDecorator{

    @Override
    public void designClothes() {
        System.out.print(",and right red");
        super.designClothes();
    }
}
