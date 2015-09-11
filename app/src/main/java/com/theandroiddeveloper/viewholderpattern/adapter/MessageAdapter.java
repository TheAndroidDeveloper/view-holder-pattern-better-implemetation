package com.theandroiddeveloper.viewholderpattern.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.theandroiddeveloper.viewholderpattern.R;
import com.theandroiddeveloper.viewholderpattern.adapter.base.BaseListAdapter;
import com.theandroiddeveloper.viewholderpattern.adapter.model.MessageContent;

import java.util.List;

/**
 * Custom adapter class
 *
 * @author jonatan.salas
 */
public class MessageAdapter extends BaseListAdapter {

    /**
     * Constructor with parameters
     *
     * @param context - the context where the adapter is going to be used.
     * @param items - the list of items that the adapter must represent.
     */
    public MessageAdapter(@NonNull final Context context,
                          @NonNull final List items) {
        super(context, items);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        final ViewHolder viewHolder;

        if(null != view) {
            viewHolder = (ViewHolder) view.getTag();
        } else {
            view = LayoutInflater
                    .from(mContext)
                    .inflate(R.layout.message_item, parent, false);

            viewHolder = ViewHolder.newInstance(view);
        }

        viewHolder.bindViews(getItem(position));

        return view;
    }

    /**
     * @author jonatan.salas
     */
    protected static class ViewHolder extends BaseListAdapter.ViewHolder {
        private ImageView profile;
        private TextView  name;
        private TextView message;
        private TextView hour;

        /**
         *
         * @param view
         */
        protected ViewHolder(@NonNull final View view) {
            super(view);
        }

        @Override
        public void findViews(@NonNull final View view) {
            profile = (ImageView) view.findViewById(R.id.profile_picture);
            name = (TextView) view.findViewById(R.id.contact_name);
            message = (TextView) view.findViewById(R.id.message);
            hour = (TextView) view.findViewById(R.id.message_hour);
            view.setTag(this);
        }

        @Override
        public void bindViews(@NonNull final Object item) {
            final MessageContent content = (MessageContent) item;

            this.profile.setImageDrawable(content.getImage());
            this.name.setText(content.getName());
            this.message.setText(content.getMessage());
            this.hour.setText(content.getHour());
        }

        /**
         *
         * @param view
         * @return
         */
        public static ViewHolder newInstance(@NonNull final View view) {
            return new ViewHolder(view);
        }
    }
}
