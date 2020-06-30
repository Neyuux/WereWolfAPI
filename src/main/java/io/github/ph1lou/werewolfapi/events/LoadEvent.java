package io.github.ph1lou.werewolfapi.events;

import io.github.ph1lou.werewolfapi.WereWolfAPI;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class LoadEvent extends Event {

    private static final HandlerList HANDLERS_LIST = new HandlerList();
    private final WereWolfAPI wereWolfAPI;


    public LoadEvent(WereWolfAPI wereWolfAPI) {
        this.wereWolfAPI=wereWolfAPI;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public WereWolfAPI getWereWolfAPI() {
        return wereWolfAPI;
    }
}