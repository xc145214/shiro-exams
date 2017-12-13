package com.xc.shiro.chapter10.web.listener;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListenerAdapter;

/**
 *
 * @author xiachuan at 2017/12/13 15:54。
 */

public class MySessionListener2 extends SessionListenerAdapter {

    @Override
    public void onStart(Session session) {
        System.out.println("会话创建：" + session.getId());
    }
}

