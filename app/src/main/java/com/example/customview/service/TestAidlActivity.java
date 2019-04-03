package com.example.customview.service;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;

import com.example.customview.BaseActivity;
import com.example.customview.R;
import com.example.customview.util.LogUtil;

import java.util.List;

import aidl.Book;
import aidl.IBookAidlInterface;

/**
 * @author husy
 *
 */
public class TestAidlActivity extends BaseActivity {
    private static String TAG = "TestAidlActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_aidl);

        bindService(new Intent(TestAidlActivity.this, ServerService.class), conn, Service.BIND_AUTO_CREATE);
    }

    private ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            try {
                System.out.println("service conn hash code:" + service.hashCode());
                IBookAidlInterface iBookAidlInterface = IBookAidlInterface.Stub.asInterface(service);
                List<Book> list = iBookAidlInterface.getBookList();
                LogUtil.i(TAG, list.toString());
                Book book = new Book();
                book.setBookId(1);
                book.setName("Android艺术探索");
                iBookAidlInterface.addBook(book);

                list = iBookAidlInterface.getBookList();
                LogUtil.i(TAG, list.toString());

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    list.forEach((Book item) ->
                            LogUtil.i(TAG, item.toString())
                    );
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbindService(conn);
    }
}
