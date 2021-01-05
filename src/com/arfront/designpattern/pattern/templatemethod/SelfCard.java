package com.arfront.designpattern.pattern.templatemethod;

public class SelfCard extends ACard{
    @Override
    public void create() {
        // 比如，微信号，公司，职业是必填项
        System.out.println("创建自己的名片");
    }

    @Override
    public void share() {
        // 比如，分享给他人只是在名片夹表增加一条记录
        System.out.println("分享自己的名片");
    }
}
