package br.com.cybereagle.androidlibrary.dagger;

import android.app.Application;
import dagger.ObjectGraph;

import java.util.List;

public abstract class DaggerApplication extends Application {

    private ObjectGraph applicationGraph;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationGraph = ObjectGraph.create(getModules().toArray());
    }

    /**
     * A list of modules to use for the application graph. Subclasses can override this method to
     * provide additional modules provided they call {@code super.getModules()}.
     */
    protected abstract List<Object> getModules();

    public ObjectGraph getApplicationGraph() {
        return applicationGraph;
    }

}
