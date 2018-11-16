package com.example.luoyangcomputer.localbook;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * package: com.example.luoyangcomputer.localbook
 * created by luoyangcomputer
 * on 2018/10/28 16:42
 */
public abstract class SingleFragmentActivity extends AppCompatActivity {
    /**
     * @function 返回托管的fragment
     */
    protected abstract Fragment createFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setScreen();
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }

    /**
     * @function 设置屏幕显示状态
     */
    protected void setScreen() {
    }

}
