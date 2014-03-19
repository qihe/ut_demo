package com.baidu.crm;

//子类的实现不可控
interface Subscriber {
   public boolean receive(String message);
}