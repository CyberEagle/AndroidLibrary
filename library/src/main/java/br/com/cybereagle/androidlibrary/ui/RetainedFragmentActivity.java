package br.com.cybereagle.androidlibrary.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import br.com.cybereagle.androidlibrary.ui.helper.RetainedActivityHelper;
import br.com.cybereagle.androidlibrary.ui.interfaces.RetainedActivity;

public abstract class RetainedFragmentActivity extends FragmentActivity implements RetainedActivity {

    private RetainedActivityHelper retainedActivityHelper;

    protected RetainedFragmentActivity() {
        this.retainedActivityHelper = new RetainedActivityHelper(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        retainedActivityHelper.onCreate(savedInstanceState);
    }

    public void callSuperOnCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public Object onRetainCustomNonConfigurationInstance() {
        return retainedActivityHelper.onRetainCustomNonConfigurationInstance();
    }

    public void beforeCreate(Bundle savedInstanceState){

    }

    public void initializeUnretainedInstanceFields(Bundle savedInstanceState) {

    }

    public void initializeRetainedInstanceFields(Bundle savedInstanceState){

    }

    public void afterCreateView(Bundle savedInstanceState){

    }

}
