package com.batista.foodapp.model;

import java.sql.Date;

public interface User {

    String getName();

    void setName(String name);

    String getLastName();

    void setLastName(String lastName);

    Date getBirthDate();

    void setBirthDate(Date birthDate);
}
