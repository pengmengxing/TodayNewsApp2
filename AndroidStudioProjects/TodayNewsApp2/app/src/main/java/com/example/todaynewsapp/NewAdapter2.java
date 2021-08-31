package com.example.todaynewsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

class NewsAdapter2 extends BaseAdapter
{
    private List<News> mData;
    private Context mContext;

    private static final int TYPE_NEWS_0 = 0;
    private static final int TYPE_NEWS_1= 1;
    private static final int TYPE_NEWS_2 = 2;
    private static final int TYPE_NEWS_3 = 3;

    public NewsAdapter2(List<News> mData,Context mContext)
    {
        this.mData=mData;
        this.mContext=mContext;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        if(position % 4 == 0)
        {
            return TYPE_NEWS_0;
        }
        else if(position % 4 == 1)
        {
            return TYPE_NEWS_1;
        }
        else if(position % 4 == 2)
        {
            return TYPE_NEWS_2;
        }
        else
        {
            return TYPE_NEWS_3;
        }
    }

    @Override
    public int getViewTypeCount() {
        return 4;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        int type = getItemViewType(position);
        ViewHolder0 holder0 = null;
        ViewHolder1 holder1 = null;
        ViewHolder2 holder2 = null;
        ViewHolder3 holder3 = null;
        if (convertView == null)
        {
            switch (type)
            {
                case TYPE_NEWS_0:
                    holder0 = new ViewHolder0();
                    convertView = LayoutInflater.from(mContext).inflate(R.layout.listview_item_no_picture_layout,parent,false);
                    holder0.title=(TextView) convertView.findViewById(R.id.tv_title);
                    holder0.content= (TextView) convertView.findViewById(R.id.tv_content);
                    convertView.setTag(holder0);
                    break;
                case TYPE_NEWS_1:
                    holder1 = new ViewHolder1();
                    convertView = LayoutInflater.from(mContext).inflate(R.layout.listview_item_layout,parent,false);
                    holder1.img_icon=(ImageView) convertView.findViewById(R.id.img_icon);
                    holder1.title=(TextView) convertView.findViewById(R.id.tv_title);
                    holder1.content= (TextView) convertView.findViewById(R.id.tv_content);
                    convertView.setTag(holder1);
                    break;
                case TYPE_NEWS_2:
                    holder2 = new ViewHolder2();
                    convertView = LayoutInflater.from(mContext).inflate(R.layout.listview_item_layout2,parent,false);
                    holder2.img_icon=(ImageView) convertView.findViewById(R.id.img_icon);
                    holder2.img_icon2=(ImageView) convertView.findViewById(R.id.img_icon2);
                    holder2.title=(TextView) convertView.findViewById(R.id.tv_title);
                    holder2.content= (TextView) convertView.findViewById(R.id.tv_content);
                    convertView.setTag(holder2);
                    break;

                case TYPE_NEWS_3:
                    holder3 = new ViewHolder3();
                    convertView = LayoutInflater.from(mContext).inflate(R.layout.listview_item_layout3,parent,false);
                    holder3.img_icon=(ImageView) convertView.findViewById(R.id.img_icon);
                    holder3.img_icon2=(ImageView) convertView.findViewById(R.id.img_icon2);
                    holder3.img_icon3=(ImageView) convertView.findViewById(R.id.img_icon3);
                    holder3.title=(TextView) convertView.findViewById(R.id.tv_title);
                    holder3.content= (TextView) convertView.findViewById(R.id.tv_content);
                    convertView.setTag(holder3);
                    break;
            }

        }
        else {
            switch(type)
            {
                case TYPE_NEWS_0:
                    holder0 = (ViewHolder0) convertView.getTag();
                    break;
                case TYPE_NEWS_1:
                    holder1 = (ViewHolder1) convertView.getTag();
                    break;
                case TYPE_NEWS_2:
                    holder2 = (ViewHolder2) convertView.getTag();
                    break;
                case TYPE_NEWS_3:
                    holder3 = (ViewHolder3) convertView.getTag();
                    break;
            }

        }

        switch(type)
        {
            case TYPE_NEWS_0:
                holder0.title.setText(mData.get(position).getTitle());
                holder0.content.setText(mData.get(position).getContent());
                break;
            case TYPE_NEWS_1:
                holder1.img_icon.setBackgroundResource(mData.get(position).getaIcon());
                holder1.title.setText(mData.get(position).getTitle());
                holder1.content.setText(mData.get(position).getContent());
                break;
            case TYPE_NEWS_2:
                holder2.img_icon.setBackgroundResource(mData.get(position).getaIcon());
                holder2.img_icon2.setBackgroundResource(mData.get(position).getaIcon2());
                holder2.title.setText(mData.get(position).getTitle());
                holder2.content.setText(mData.get(position).getContent());
                break;

            case TYPE_NEWS_3:
                holder3.img_icon.setBackgroundResource(mData.get(position).getaIcon());
                holder3.img_icon2.setBackgroundResource(mData.get(position).getaIcon2());
                holder3.img_icon3.setBackgroundResource(mData.get(position).getaIcon3());
                holder3.title.setText(mData.get(position).getTitle());
                holder3.content.setText(mData.get(position).getContent());
                break;

        }
        return convertView;
    }

    static class ViewHolder0{
        TextView title;
        TextView content;
    }

    static class ViewHolder1{
        ImageView img_icon;
        TextView title;
        TextView content;
    }

    static class ViewHolder2{
        ImageView img_icon;
        ImageView img_icon2;
        TextView title;
        TextView content;
    }

    static class ViewHolder3{
        ImageView img_icon;
        ImageView img_icon2;
        ImageView img_icon3;
        TextView title;
        TextView content;
    }
}