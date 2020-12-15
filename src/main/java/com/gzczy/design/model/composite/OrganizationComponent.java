package com.gzczy.design.model.composite;

/**
 * @Description
 * @Author chenzhengyu
 * @Date 2020-12-15 16:10
 */

public abstract class OrganizationComponent {

    private String name;

    private String description;

    public OrganizationComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    protected void add(OrganizationComponent organization){
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organization){
        throw new UnsupportedOperationException();
    }

    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
