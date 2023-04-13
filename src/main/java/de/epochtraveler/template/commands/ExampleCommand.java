package de.epochtraveler.template.commands;

import de.epochtraveler.epochapi.commands.CommandInfo;
import de.epochtraveler.epochapi.commands.PlayerCommand;
import de.epochtraveler.epochapi.user.User;

@CommandInfo(
        command = "example",
        syntax = "/example",
        permissions = "epochtravelers.example.command.execute"
)
public class ExampleCommand extends PlayerCommand {
    @Override
    public CommandStatus onCommand(User user, String[] args) {
        if(args.length != 0)
            return CommandStatus.WRONG_SYNTAX;
        user.sendMessage("§aThis is a example message!");
        return CommandStatus.SUCCESS;
    }
}
