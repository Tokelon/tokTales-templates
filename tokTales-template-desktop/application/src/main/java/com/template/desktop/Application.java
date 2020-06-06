package com.template.desktop;

import com.tokelon.toktales.core.engine.EngineException;
import com.tokelon.toktales.core.game.IGameAdapter;
import com.tokelon.toktales.desktop.application.TokTalesApplication;

public class Application extends TokTalesApplication {


    @Override
    public Class<? extends IGameAdapter> makeDefaultGameAdapter() {
        return GameAdapter.class;
    }


    public static void main(String[] args) throws EngineException {
        new Application().run(args);
    }

}
