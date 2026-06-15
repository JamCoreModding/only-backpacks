package io.github.jamalam360.only_backpacks.content.registry;

import io.github.jamalam360.jamlib.api.registry.DeferredRegistry;
import io.github.jamalam360.jamlib.api.registry.RegistryObject;
import io.github.jamalam360.only_backpacks.OnlyBackpacks;
import io.github.jamalam360.only_backpacks.content.item.EnderBackpackItem;
import io.github.jamalam360.only_backpacks.content.item.TieredBackpackItem;
import io.github.jamalam360.only_backpacks.tier.DefaultBackpackTiers;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

public class ModItems {
	private static final DeferredRegistry<Item> ITEMS = DeferredRegistry.create(OnlyBackpacks.MOD_ID, BuiltInRegistries.ITEM);
	public static final RegistryObject<Item> LEATHER_BACKPACK = ITEMS.register("leather_backpack", (k) -> new TieredBackpackItem(k, DefaultBackpackTiers.LEATHER));
	public static final RegistryObject<Item> ENDER_BACKPACK = ITEMS.register("ender_backpack", EnderBackpackItem::new);

	public static void register() {
		ITEMS.registerEntries();
	}
}
