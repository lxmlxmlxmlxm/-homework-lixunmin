package com_nf.text;

import com_nf.dao.PhoneIM;
import com_nf.entity.Phone;

public class texts {
    public static void main(String[] args) {
        PhoneIM a=new PhoneIM();
        a.delete(2);
        for (Phone phone:PhoneIM.phone)
        {
            System.out.print(phone.getId());
        }
    }
}
