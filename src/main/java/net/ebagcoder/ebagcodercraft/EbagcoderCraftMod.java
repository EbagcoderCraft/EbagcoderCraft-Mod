package net.ebagcoder.ebagcodercraft;

import net.fabricmc.api.ModInitializer;

public class EbagcoderCraftMod implements ModInitializer {
	public static final Item FABRIC_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));

	
	@Override
	public void onInitialize() {
 Registry.register(Registry.ITEM, new Identifier("flight_ring", "fabric_item"), FABRIC_ITEM);
    }
}
