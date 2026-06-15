package io.github.jamalam360.only_backpacks.content.item;

import io.github.jamalam360.only_backpacks.tier.BackpackTier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class TieredBackpackItem extends BackpackItem {
	private final BackpackTier tier;

	public TieredBackpackItem(ResourceKey<Item> id, BackpackTier tier) {
		super(id);
		this.tier = tier;
	}
}
