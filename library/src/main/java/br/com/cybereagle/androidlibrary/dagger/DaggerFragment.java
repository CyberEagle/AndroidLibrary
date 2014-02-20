package br.com.cybereagle.androidlibrary.dagger;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public abstract class DaggerFragment extends Fragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ((DaggerFragmentActivity) getActivity()).inject(this);
    }

}
