package net.openhft.chronicle.engine.api;

/**
 * Created by peter on 22/05/15.
 */
public interface View {
    default boolean keyedView() {
        return false;
    }
}