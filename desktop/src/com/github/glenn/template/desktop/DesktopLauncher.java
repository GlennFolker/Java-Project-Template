package com.github.glenn.template.desktop;

import com.badlogic.gdx.backends.lwjgl3.*;
import com.github.glenn.template.*;

import static com.github.glenn.template.Template.*;

public class DesktopLauncher extends Launcher {
	public static void main(String[] args) {
        new DesktopLauncher(args);
    }

    public DesktopLauncher(String[] args){
        try {
            new Lwjgl3Application(this, new Lwjgl3ApplicationConfiguration() {{
                setWindowedMode(800, 600);
                setMaximized(true);
                setTitle(APP_NAME);
                setWindowIcon("sprites/icon.png");
            }} );
        } catch(Throwable e) {
            e.printStackTrace();
        }
    }
}
