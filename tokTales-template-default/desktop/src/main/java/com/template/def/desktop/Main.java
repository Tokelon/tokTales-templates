package com.template.def.desktop;

import com.template.def.core.GameAdapter;
import com.tokelon.toktales.core.engine.EngineException;
import com.tokelon.toktales.core.game.IGameAdapter;
import com.tokelon.toktales.desktop.application.TokTalesApplication;

public class Main extends TokTalesApplication {


    @Override
    public Class<? extends IGameAdapter> makeDefaultGameAdapter() {
        return GameAdapter.class;
    }


    public static void main(String[] args) throws EngineException {
        new Main().run(args);
    }

}
