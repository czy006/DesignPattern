package com.gzczy.design.model.factory.absfactory.pizza;


public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("伦敦胡椒披萨 prepare;");
    }

}
