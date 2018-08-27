package com_nf.dao;

import com_nf.entity.Phone;

import java.util.List;

public interface PhoneDao {
    List<Phone> listAll();
    Phone getPhoneById(int id);
    List<Phone> getPhonesByName(String name);
    boolean update(Phone phone);
    boolean delete(int id);
    Phone add(Phone phone);
  }


