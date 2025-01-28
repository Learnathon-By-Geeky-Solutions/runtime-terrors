package com.pluralsight.util;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

public class CalendarFactory implements FactoryBean<Calendar> {
    @Override
    public Calendar getObject() throws Exception {
        return Calendar.getInstance();
    }

    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }
    public void addDays(int num)
    {
        Calendar.getInstance().add(Calendar.DAY_OF_YEAR, num);
    }
    @Override
    public boolean isSingleton() {
        return true;
    }
}
