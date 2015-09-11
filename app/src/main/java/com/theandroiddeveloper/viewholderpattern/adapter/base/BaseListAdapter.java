package com.theandroiddeveloper.viewholderpattern.adapter.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * @author jonatan.salas
 */
public class BaseListAdapter extends BaseAdapter {
    protected Context mContext;
    protected List mItems;

    /**
     *
     * @param context
     * @param items
     */
    public BaseListAdapter(@NonNull final Context context,
                           @NonNull final List items) {
        this.mContext = context;
        this.mItems = items;
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Object getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        return null;
    }

    /**
     *
     */
    public static abstract class ViewHolder {

        protected ViewHolder(@NonNull final View view) {
            findViews(view);
        }

        /**
         * @param view
         */
        public abstract void findViews(@NonNull final View view);

        /**
         *
         * @param item
         */
        public abstract void bindViews(@NonNull final Object item);
    }
}
