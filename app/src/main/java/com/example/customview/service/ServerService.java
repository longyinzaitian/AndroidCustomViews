package com.example.customview.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import aidl.Book;
import aidl.IBookAidlInterface;

/**
 * @author husy
 * @date 2019/4/3
 */
public class ServerService extends Service {

    private CopyOnWriteArrayList<Book> bookList = new CopyOnWriteArrayList<>();

    @Override
    public IBinder onBind(Intent intent) {
        System.out.println("service stub hash code:" + serviceStub.hashCode());
        return serviceStub;
    }

    private IBinder serviceStub = new IBookAidlInterface.Stub() {
        @Override
        public void addBook(Book book) throws RemoteException {
            bookList.add(book);
        }

        @Override
        public List<Book> getBookList() throws RemoteException {
            return bookList;
        }
    };
}
