package io.github.jamalam360.only_backpacks.datagen;

import io.github.jamalam360.only_backpacks.datagen.providers.ItemModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class OnlyBackpacksDataGen implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator gen) {
		FabricDataGenerator.Pack pack = gen.createPack();
		pack.addProvider(ItemModelProvider::new);
	}
}
