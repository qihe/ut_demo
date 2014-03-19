package com.baidu.crm.insurance;

/**
 * User: howard
 * Date: 06/04/12
 * Time: 15:39
 */
public class Insurance {
    @Override
    public boolean equals(Object o) {
        return o.getClass().equals(this.getClass());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
