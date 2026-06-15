package io.github.jamalam360.only_backpacks.content.registry;

import io.github.jamalam360.jamlib.api.registry.DeferredRegistry;
import io.github.jamalam360.only_backpacks.OnlyBackpacks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

public class ModItems {
	private static final DeferredRegistry<Item> ITEMS = DeferredRegistry.create(OnlyBackpacks.MOD_ID, BuiltInRegistries.ITEM);

	public static void register() {
		ITEMS.registerEntries();
	}
}
