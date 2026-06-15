package io.github.jamalam360.only_backpacks.datagen.providers;

import io.github.jamalam360.only_backpacks.content.registry.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import org.jspecify.annotations.NonNull;

public class ItemModelProvider extends FabricModelProvider {
	public ItemModelProvider(FabricPackOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(@NonNull BlockModelGenerators ignored) {
	}

	@Override
	public void generateItemModels(ItemModelGenerators gen) {
		gen.generateFlatItem(ModItems.LEATHER_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
		gen.generateFlatItem(ModItems.ENDER_BACKPACK.get(), ModelTemplates.FLAT_ITEM);
	}
}
