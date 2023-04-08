package de.epochtraveler.template;

import de.epochtraveler.epochapi.CoreServer;
import de.epochtraveler.epochapi.logging.Logger;
import de.epochtraveler.epochapi.modules.Module;
import de.epochtraveler.epochapi.modules.ModuleDescription;

@ModuleDescription(
        name = "Template Module",
        version = "1.0.1"
)
public final class ModuleTemplate extends Module {

    public ModuleTemplate(CoreServer server) {
        super(server);
    }

    @Override
    public void enable() {
        getModuleLogger().info("§aStarted " + getModuleDescription().name() + " Module!");
    }

    @Override
    public void disable() {
        getModuleLogger().info("§cStopped " + getModuleDescription().name() + " Module!");
    }
}
