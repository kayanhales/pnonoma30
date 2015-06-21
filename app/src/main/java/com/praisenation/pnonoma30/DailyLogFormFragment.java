package com.praisenation.pnonoma30;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.praisenation.pnonoma30.dashboard.DashboardContent;

/**
 * A fragment representing a single Home detail screen.
 * This fragment is either contained in a {@link HomeListActivity}
 * in two-pane mode (on tablets) or a {@link HomeDetailActivity}
 * on handsets.
 */
public class DailyLogFormFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DashboardContent.DashboardItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public DailyLogFormFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DashboardContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dailylog_form, container, false);

        // Show the dummy content as text in a TextView.
        //if (mItem != null) {
       //     ((TextView) rootView.findViewById(R.id.dailylogform_detail)).setText(mItem.content);
        //}

        return rootView;
    }
}
