package com.niyati.designpattern.behavioral.cor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddNumbers implements Chain {
    private static Logger logger= LoggerFactory.getLogger(Chain.class);
    private Chain nextChain;

    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if (request.getCalculationWanted() == "add") {
            logger.info("Addition of {} + {} = {}",request.getNumber1(),request.getNumber2(), (request.getNumber1() + request.getNumber2()));
        } else {
            nextChain.calculate(request);
        }
    }
}
