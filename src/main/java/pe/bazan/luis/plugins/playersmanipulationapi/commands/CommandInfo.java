package pe.bazan.luis.plugins.playersmanipulationapi.commands;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface CommandInfo {
    /**
     * The actual name of the command. Not really used anywhere.
     */
    String name();

    /**
     * A regex pattern that allows minor oddities and alternatives to the command name.
     */
    String pattern();

    /**
     * The usage message, i.e. how the command should be used.
     */
    String usage();

    /**
     * A description of what the command does.
     */
    String desc();

    /**
     * The permission required to execute this command.
     */
    String permission();
}
