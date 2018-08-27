package com_nf.dao;

import com_nf.entity.Phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneIM implements PhoneDao {
    public static ArrayList<Phone> phone=new ArrayList<Phone>();

    static {
        Phone p1=new Phone(1,"三星",12334);
        Phone p2=new Phone(2,"三星",12334);
        Phone p3=new Phone(3,"三星",12334);
        Phone p4=new Phone(4,"三星",12334);
        Phone p5=new Phone(5,"三星",12334);
        phone.add(p1);
        phone.add(p2);
        phone.add(p3);
        phone.add(p4);
        phone.add(p5);
    }
    @Override
    public List<Phone> listAll() {
        return phone ;

    }

    @Override
    public Phone getPhoneById(int id) {
        for(Phone phone:phone)
        {
            if(phone.getId()==id)
            {
                return phone;
            }

        }
        return null;
    }

    @Override
    public List<Phone> getPhonesByName(String name) {
        return null;
    }

    @Override
    public boolean update(Phone phone) {
        for(Phone a:this.phone){
            if(a.getId()==phone.getId())
            {
                a.setName(phone.getName());
                a.setPrice(phone.getPrice());
            }

        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        for (Phone phone : phone) {
            if(phone.getId()==id){
                return this.phone.remove(phone);
            }
        }
        return false;

    }

    @Override
    public Phone add(Phone phone) {
        if(this.phone.add(phone)){
            return  phone;
        }
        return null;
    }


}
