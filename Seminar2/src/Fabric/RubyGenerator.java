package Fabric;

import Interface.iGameItem;
import Product.Gem;
import Product.Ruby;

public class RubyGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {

        return new Ruby();
    }
    
}
