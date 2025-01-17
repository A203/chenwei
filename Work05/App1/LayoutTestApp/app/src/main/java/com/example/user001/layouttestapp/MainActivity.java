package com.example.user001.layouttestapp;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;


public class MainActivity extends TabActivity {
    private TabHost host;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabhost);
        host=getTabHost();

        //创建标签页
        TabHost.TabSpec s1=host.newTabSpec("one");
        //标签名
        s1.setIndicator("s1");
        //内容
        s1.setContent(R.id.tv1);
        //s1.setContent(new Intent(this.OtherActivity.calss));
        //将标签添加到tabHost组件
        host.addTab(s1);

        //创建标签页
        TabHost.TabSpec s2=host.newTabSpec("two");
        //标签名
        s2.setIndicator("s2");
        //内容
        s2.setContent(R.id.tv2);
        //将标签添加到tabHost组件
        host.addTab(s2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
