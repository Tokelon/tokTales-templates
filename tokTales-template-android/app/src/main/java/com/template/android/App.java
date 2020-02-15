package com.template.android;

import com.tokelon.toktales.android.app.TokTalesApp;
import com.tokelon.toktales.android.engine.AndroidEngineLauncher;
import com.tokelon.toktales.android.engine.inject.MasterAndroidInjectConfig;
import com.tokelon.toktales.core.engine.EngineException;
import com.tokelon.toktales.core.engine.IEngineLauncher;

public class App extends TokTalesApp {


    @Override
    protected void launchEngine(IEngineLauncher defaultLauncher) throws EngineException {
        AndroidEngineLauncher launcher = new AndroidEngineLauncher(new MasterAndroidInjectConfig(), getApplicationContext());

        launcher.launch(GameAdapter.class);
    }

}
