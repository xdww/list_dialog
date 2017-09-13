package com.xdh.wyxh.maintenancecenter.views;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.xdh.wyxh.maintenancecenter.R;

import java.util.ArrayList;

/**
 * Created by ${XuDan} on 2017/8/30.
 */

public class ListDialogView {
    ArrayList<String> itemList;
    Context context;
    private LayoutInflater mInflater;
    private AlertDialog mAlertDialog;
    private ListView mListview;

    public ListDialogView(ArrayList<String> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
        mInflater = LayoutInflater.from(context);
        initView();
    }

    private void initView() {
        View view = mInflater.inflate(R.layout.alertdialog, null);
        mAlertDialog = new AlertDialog.Builder(context).create();
        mAlertDialog.setView(view);
        mListview = (ListView) view.findViewById(android.R.id.list);
        mListview.setAdapter(new ArrayAdapter<String>(context, R.layout.list_text,
                itemList));
        mAlertDialog.show();
    }

    //获取listView
    public ListView getListview() {
        return mListview;
    }

    //获取ListView,设置点击事件
    public void setListview(ListView listview) {
        mListview = listview;
    }

    //取消dialog
    public void no() {
        if (mAlertDialog != null) {
            mAlertDialog.dismiss();
        }

    }

}