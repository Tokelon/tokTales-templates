package com.template.def.desktop;

import com.tokelon.toktales.core.engine.EngineException;
import com.tokelon.toktales.desktop.engine.inject.MasterDesktopInjectConfig;
import com.tokelon.toktales.desktop.lwjgl.DefaultDesktopEngineLauncher;
import com.template.def.core.GameAdapter;

public class Main {


    public static void main(String[] args) throws EngineException {
        DefaultDesktopEngineLauncher launcher = new DefaultDesktopEngineLauncher(new MasterDesktopInjectConfig());

        // Configure the default window size and title here
        launcher.useDefaultWindowBuilderWith(800, 600, "Application");

        launcher.launch(GameAdapter.class);
    }

}
