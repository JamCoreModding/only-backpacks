package io.github.jamalam360.only_backpacks.content.item;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class BackpackItem extends Item {
	public BackpackItem(ResourceKey<Item> id) {
		super(new Properties().setId(id).stacksTo(1));
	}
}
