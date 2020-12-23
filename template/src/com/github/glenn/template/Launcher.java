package com.github.glenn.template;

import com.badlogic.gdx.*;
import com.badlogic.gdx.assets.*;
import com.badlogic.gdx.utils.*;

import static com.github.glenn.template.Template.*;

public abstract class Launcher extends ApplicationAdapter {
	protected OrderedSet<ApplicationListener> adapters = new OrderedSet<>();
	protected boolean finishedLoading = false;

	@Override
	public void create() {
		assets = new AssetManager();
	}

	@Override
	public void render() {
		if(!finishedLoading) {
			if(assets.update(60)) {
				finishedLoading = true;
			}
		} else {
			for(ApplicationListener adapter : adapters) {
				adapter.render();
			}
		}
	}
}
