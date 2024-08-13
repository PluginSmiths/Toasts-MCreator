package net.goldorion.toasts;

import net.mcreator.element.ModElementType;
import net.mcreator.element.ModElementTypeLoader;
import net.mcreator.plugin.JavaPlugin;
import net.mcreator.plugin.Plugin;
import net.mcreator.plugin.events.PreGeneratorsLoadingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.mcreator.element.ModElementTypeLoader.register;

public class ToastsLauncher extends JavaPlugin {

    private static final Logger LOG = LogManager.getLogger("Toasts");
    public ToastsLauncher(Plugin plugin) {
        super(plugin);

        addListener(PreGeneratorsLoadingEvent.class, e-> register(new ModElementType<>("toast", 'T', ToastGUI::new, Toast.class)));

        LOG.info("Toasts plugin was loaded");
    }
}
