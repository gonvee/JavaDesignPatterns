package com.anly.designpattern.simplefactory;

/**
 * Created by mingjun on 16/11/10.
 */
public class XiaoGuang {

//	不知道为什么这个方法无法运行，具体原因未知
    public static void main(String[] args) {

        Drink drink = Cousins.create("可乐");
        drink.make();
    }
}
