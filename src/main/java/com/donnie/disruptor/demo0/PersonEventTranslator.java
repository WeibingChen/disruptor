package com.donnie.disruptor.demo0;

import com.lmax.disruptor.EventTranslator;

/**
 * @Description
 * @auther donnie
 * @create 2020-11-04 21:53
 */
public class PersonEventTranslator implements EventTranslator<PersonEvent> {
    @Override
    public void translateTo(PersonEvent event, long sequence) {
        Person p = new Person(1, "Zhang San");
        event.setPerson(p);
    }
}
