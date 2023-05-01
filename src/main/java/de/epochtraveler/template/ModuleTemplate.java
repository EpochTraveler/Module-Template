package de.epochtraveler.template;

import de.epochtraveler.epochapi.Core;
import de.epochtraveler.epochapi.CoreServer;
import de.epochtraveler.epochapi.modules.Module;
import de.epochtraveler.epochapi.modules.ModuleDescription;
import de.epochtraveler.template.commands.ExampleCommand;
import de.epochtraveler.template.events.TemplateEvent;

@ModuleDescription(
        name = "Template Module",
        version = "1.3.0"
)
public final class ModuleTemplate extends Module {

    public ModuleTemplate(CoreServer server) {
        super(server);
    }

    @Override
    public void enable() {
        getModuleLogger().info("§aStarted " + getModuleDescription().name() + " Module!");
        new TemplateEvent();
        Core.registerCommand(new ExampleCommand());
    }

    @Override
    public void disable() {
        getModuleLogger().info("§cStopped " + getModuleDescription().name() + " Module!");
    }
}
