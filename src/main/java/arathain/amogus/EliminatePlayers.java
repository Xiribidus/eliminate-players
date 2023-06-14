package arathain.amogus;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import java.util.ArrayList;
import java.util.UUID;

public class EliminatePlayers implements ModInitializer {
	public static final ArrayList<UUID> bannedUuids = new ArrayList<>();

	@Override
	public void onInitialize(ModContainer mod) {
		bannedUuids.add(UUID.fromString("f6d26886-456c-4c25-a785-fbc9323e69cb"));
	}
}
