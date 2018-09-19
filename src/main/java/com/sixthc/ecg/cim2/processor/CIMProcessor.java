package com.sixthc.ecg.cim2.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CIMProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        System.out.println("hello");
    }

}
