package de.epochtraveler.template;

import de.epochtraveler.epochapi.CoreServer;
import de.epochtraveler.epochapi.modules.Module;
import de.epochtraveler.epochapi.modules.ModuleDescription;

@ModuleDescription(
        name = "Template Module",
        version = "1.0.0"
)
public final class ModuleTemplate extends Module {

    public ModuleTemplate(CoreServer server) {
        super(server);
    }

    @Override
    public void enable() {
        System.out.println("Module loaded!");
    }

    @Override
    public void disable() {
        System.out.println("Module disabled!");
    }
}
