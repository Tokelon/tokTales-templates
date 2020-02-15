package com.template.android;

import com.tokelon.toktales.core.engine.IEngineContext;
import com.tokelon.toktales.core.game.EmptyGameAdapter;

import javax.inject.Inject;

public class GameAdapter extends EmptyGameAdapter {


    private final Gamestate gamestate;

    @Inject
    public GameAdapter(Gamestate gamestate) {
        this.gamestate = gamestate;
    }


    @Override
    public void onCreate(IEngineContext engineContext) {
        // Add any gamestates here
        engineContext.getGame().getStateControl().addState("Gamestate", gamestate);

        // Select the startup gamestate
        engineContext.getGame().getStateControl().changeState("Gamestate");
    }

}
