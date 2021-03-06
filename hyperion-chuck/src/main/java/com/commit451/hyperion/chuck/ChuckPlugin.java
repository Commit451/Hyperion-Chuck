package com.commit451.hyperion.chuck;

import com.google.auto.service.AutoService;
import com.willowtreeapps.hyperion.plugin.v1.Plugin;
import com.willowtreeapps.hyperion.plugin.v1.PluginModule;

@SuppressWarnings("unused")
@AutoService(Plugin.class)
public class ChuckPlugin extends Plugin {

    @Override
    public PluginModule createPluginModule() {
        return new ChuckModule();
    }

}
