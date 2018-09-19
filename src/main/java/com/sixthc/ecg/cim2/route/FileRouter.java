package com.sixthc.ecg.cim2.route;

import org.apache.camel.builder.RouteBuilder;
import com.sixthc.ecg.cim2.processor.*;

public class FileRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:/Users/BenGoodwin/workspace_jboss/cim2/input_folder?noop=true").process(new CIMProcessor()).to("file:/Users/BenGoodwin/workspace_jboss/cim2/output_folder");
    }

}
