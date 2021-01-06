package com.arfront.designpattern.pattern.bridge;


public class ChinaBank {

    private String type;

    public ChinaBank(String type) {
        this.type = type;
    }


    public void openCount()
    {
        System.out.println("打开中国银行账号");
        switch (type) {
            case "Deposit":
                System.out.println("打开定期账号");
                break;
            case "Saving":
                System.out.println("打开活期账号");
                break;
        }
    }

    public void showCount()
    {
        System.out.println("打开中国银行账号");
        switch (type) {
            case "Deposit":
                System.out.println("这是定期账号");
                break;
            case "Saving":
                System.out.println("这是活期账号");
                break;
        }
    }

    public static void main(String[] args) {
        ChinaBank chinaBank = new ChinaBank("Deposit");
        chinaBank.openCount();
        chinaBank.showCount();
    }
}
