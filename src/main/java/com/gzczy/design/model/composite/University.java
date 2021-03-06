package com.gzczy.design.model.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 大学-第一层
 * @Author chenzhengyu
 * @Date 2020-12-15 16:10
 */
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizations = new ArrayList<>();

    public University(String name,String description) {
        super(name, description);
    }

    @Override
    protected void add(OrganizationComponent organization) {
        organizations.add(organization);
    }

    @Override
    protected void remove(OrganizationComponent organization) {
        organizations.remove(organization);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    protected void print() {
        System.out.println("==========="+getName()+"===========");
        for (OrganizationComponent organization : organizations) {
            organization.print();
        }
    }
}
