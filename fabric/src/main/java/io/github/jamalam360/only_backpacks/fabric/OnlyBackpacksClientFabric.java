package io.github.jamalam360.only_backpacks.fabric;

import io.github.jamalam360.only_backpacks.OnlyBackpacks;
import io.github.jamalam360.only_backpacks.client.OnlyBackpacksClient;
import net.fabricmc.api.ClientModInitializer;

public class OnlyBackpacksClientFabric implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		OnlyBackpacksClient.init();
	}
}
