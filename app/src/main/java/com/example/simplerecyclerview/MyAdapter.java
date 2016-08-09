package com.example.simplerecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

//implement an array
    private ArrayList<String> mStrings;

//implement all methods
    public static class ViewHolder extends RecyclerView.ViewHolder {

//reference to viewholder
    public TextView textViewName;

//create constructor matching super
    public ViewHolder(View itemView) {
        super(itemView);

//call the view id
        textViewName = (TextView) itemView.findViewById(R.id.rlist);
    }
}
public MyAdapter(ArrayList<String> strings) {
    this.mStrings = strings;
}

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
        //create a view
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
//add the item names
        String string = mStrings.get(position);

        TextView textView = holder.textViewName;
        textView.setText(string);
    }

    @Override
    public int getItemCount() {
        return mStrings == null
                ? 0
                : mStrings.size();
    }
}