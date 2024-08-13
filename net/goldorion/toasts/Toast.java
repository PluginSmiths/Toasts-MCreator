package net.goldorion.toasts;

import net.mcreator.element.GeneratableElement;
import net.mcreator.workspace.elements.ModElement;

public class Toast extends GeneratableElement {

    public String title, description, icon, background;
    public int durationTime;

    public Toast(ModElement element) {
        super(element);
    }
}
