package Fabric;

import Interface.iGameItem;
import Product.Sapphire;

public class SapphireGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {

        return new Sapphire();
    }
    
}
