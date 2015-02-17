package com.zhw.Guess_Word.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import com.zhw.Guess_Word.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Wymon Zhang
 * Date: 13-8-10
 * Time: 上午11:44
 * To change this template use File | Settings | File Templates.
 */


public class GroupListFragment extends Fragment {
    private GroupListAdapter adapter = null;
    private ListView listView = null;
    private List<String> list = new ArrayList<String>();
    private List<String> listTag = new ArrayList<String>();
    private  int png=R.drawable.restaurant;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.group_list_activity, container, false);
        setData();
        adapter = new GroupListAdapter(getActivity(), list, listTag);
        listView = (ListView) v.findViewById(R.id.group_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    default:
                          Log.i("hehe","点击了");
                        break;
                }
            }
        });
        return v;
    }


    public void setData() {

        list.add("词库");
        listTag.add("词库");
        list.add("四级词汇");
        list.add("六级词汇");
        list.add("考研核心");
        list.add("GRE");
        list.add("TOEFL");
        list.add("生词本");
        list.add("分享");
        listTag.add("分享");
        list.add("好友排名");
        list.add("截图分享");

    }

    private class GroupListAdapter extends ArrayAdapter<String> {

        private List<String> listTag = null;

        public GroupListAdapter(Context context, List<String> objects, List<String> tags) {
            super(context, 0, objects);
            this.listTag = tags;
        }

        @Override
        public boolean isEnabled(int position) {
            if (listTag.contains(getItem(position))) {
                return false;
            }
            return super.isEnabled(position);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;
            if (position == 0) {
                view = LayoutInflater.from(getContext()).inflate(R.layout.left_menu_head, null);
                ImageButton imageButton  = (ImageButton)view.findViewById(R.id.left_head_user);
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.i("hehe","点击和头像！");
                    }
                });
            } else {
                if (listTag.contains(getItem(position))) {
                    view = LayoutInflater.from(getContext()).inflate(R.layout.group_list_item_tag, null);
                } else {
                    view = LayoutInflater.from(getContext()).inflate(R.layout.group_list_item, null);
                }



            }
            TextView textView = (TextView) view.findViewById(R.id.group_list_item_text);
            textView.setText(getItem(position));
            return view;
        }
    }
}