package com.donnie.disruptor.demo0;

import com.lmax.disruptor.EventFactory;

/**
 * @Description
 * @auther donnie
 * @create 2020-11-04 21:29
 */
public class PersonEventFactory implements EventFactory<PersonEvent> {
    @Override
    public PersonEvent newInstance() {
        return new PersonEvent();
    }
}
