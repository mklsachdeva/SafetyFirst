package com.vikas.dtu.safetyfirst2.mDiscussion.fragment;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;
import com.vikas.dtu.safetyfirst2.R;

public class MyPostsFragment extends PostListFragment {

    public MyPostsFragment() {
    }

    private TextView textView1;
    private LinearLayout lltext;
    private ProgressBar progressBar;


    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // All my posts
        progressBar = (ProgressBar) getView().findViewById(R.id.progressBar);
           Query tempQuery= databaseReference.child("user-posts").child(getUid());
        if(String.valueOf(tempQuery.equalTo("null")).startsWith("com.google.")){
            {
                progressBar.setVisibility(View.INVISIBLE);
            }

        }

        return tempQuery;

    }
}


