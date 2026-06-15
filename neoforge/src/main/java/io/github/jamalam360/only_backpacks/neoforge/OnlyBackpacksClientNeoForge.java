package io.github.jamalam360.only_backpacks.neoforge;

import io.github.jamalam360.only_backpacks.OnlyBackpacks;
import io.github.jamalam360.only_backpacks.client.OnlyBackpacksClient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

@Mod(value = OnlyBackpacks.MOD_ID, dist = Dist.CLIENT)
public class OnlyBackpacksClientNeoForge {
	public OnlyBackpacksClientNeoForge() {
		OnlyBackpacksClient.init();
	}
}
