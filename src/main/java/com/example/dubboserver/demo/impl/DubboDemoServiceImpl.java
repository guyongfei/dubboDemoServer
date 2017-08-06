package com.example.dubboserver.demo.impl;

import com.example.dubboserver.demo.DubboDemoService;
import org.springframework.stereotype.Service;

/**
 * Created by gutianzi on 2017/8/6.
 */
@Service("dubboService")
public class DubboDemoServiceImpl implements DubboDemoService {
    @Override
    public Object getAppInfo(String ak) {
        System.out.println(ak);
        return "appinfo";
    }
}
