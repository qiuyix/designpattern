package com.arfront.designpattern.pattern.templatemethod;

public class OtherCard extends ACard{
    @Override
    public void create() {
        // 创建他人名片不需要要增加微信号，头像，公司等信息也能保存
        System.out.println("创建他人的名片");
    }

    @Override
    public void share() {
        // 分享他人的名片，需要创建一条新的记录
        System.out.println("分享他人的名片");
    }
}
