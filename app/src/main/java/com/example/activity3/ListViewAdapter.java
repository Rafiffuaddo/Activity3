package com.example.activity3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    Context mContext;
    LayoutInflater inflater;
    private ArrayList<ClassNama>arrayList;
    public ListViewAdapter(Context context){
        mContext = context;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<ClassNama>();
        this.arrayList.addAll(activity_home.classNamaArrayList);
    }
    public class ViewHolder{
        TextView Name;
    }

    @Override
    public int getCount() {
        return activity_home.classNamaArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return activity_home.classNamaArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder holder;
        if (view == null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.item_listview,null);
            holder.Name = (TextView) view.findViewById(R.id.tvnama_item);
            view.setTag(holder);
        }else {
            holder = (ViewHolder)view.getTag();
        }
        holder.Name.setText(activity_home.classNamaArrayList.get(i).getNama());
        return view;
    }
}

