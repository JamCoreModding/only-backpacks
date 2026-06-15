package io.github.jamalam360.only_backpacks;

import io.github.jamalam360.jamlib.JamLib;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OnlyBackpacks {
	public static final String MOD_ID = "only_backpacks";
	public static final String MOD_NAME = "Only Backpacks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	public static void init() {
		JamLib.checkForJarRenaming(OnlyBackpacks.class);
	}
}
