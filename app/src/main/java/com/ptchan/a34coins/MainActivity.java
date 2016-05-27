package com.ptchan.a34coins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listViewMyDomain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initListView();
    }

    private void initListView() {
        String[] domainData = new String[] {"导出表格","关于我们","版本号"};
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,domainData);
        listViewMyDomain.setAdapter(adapter);
    }

    private void init() {
        listViewMyDomain.findViewById(R.id.lv_my_domain);
    }
}
