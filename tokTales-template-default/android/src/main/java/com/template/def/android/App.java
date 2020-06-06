package com.template.def.android;

import com.template.def.core.GameAdapter;
import com.tokelon.toktales.android.application.TokTalesApp;
import com.tokelon.toktales.core.game.IGameAdapter;

public class App extends TokTalesApp {


    @Override
    public Class<? extends IGameAdapter> makeDefaultGameAdapter() {
        return GameAdapter.class;
    }

}
