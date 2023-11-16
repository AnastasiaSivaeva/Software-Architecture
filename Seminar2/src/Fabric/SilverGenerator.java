package Fabric;

import Interface.iGameItem;

import Product.Silver;

public class SilverGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new Silver();

    }
    
}
