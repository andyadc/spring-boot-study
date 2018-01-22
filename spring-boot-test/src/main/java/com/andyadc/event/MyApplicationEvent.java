package com.andyadc.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author andaicheng
 * @since 2018/1/10
 */
public class MyApplicationEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyApplicationEvent(Object source) {
        super(source);
    }

}
