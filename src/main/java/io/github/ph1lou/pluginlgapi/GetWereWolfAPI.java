package io.github.ph1lou.pluginlgapi;

import io.github.ph1lou.pluginlgapi.rolesattributs.Roles;

import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;

public interface GetWereWolfAPI {
    WereWolfAPI getWereWolfAPI();
    Map<String,String> getExtraTexts();
    Map<String, Constructor<? extends Roles>> getRegisterRoles();
    Map<String, List<String>> getExtraLore();
}