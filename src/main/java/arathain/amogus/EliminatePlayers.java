package arathain.amogus;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import java.util.ArrayList;
import java.util.UUID;

public class EliminatePlayers implements ModInitializer {
	public static final ArrayList<UUID> bannedUuids = new ArrayList<>();

	@Override
	public void onInitialize(ModContainer mod) {
		bannedUuids.add(UUID.fromString("5c969ebe-d015-4863-9e2e-f790eff63de4"));
	}
}
