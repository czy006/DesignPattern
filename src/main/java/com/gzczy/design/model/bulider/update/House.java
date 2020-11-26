package com.gzczy.design.model.bulider.update;

/**
 * @Description 房子类
 * @Author chenzhengyu
 * @Date 2020-11-26 11:01
 */
public class House {

    private String basic;
    private String wall;
    private String roofed;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("House{");
        sb.append("basic='").append(basic).append('\'');
        sb.append(", wall='").append(wall).append('\'');
        sb.append(", roofed='").append(roofed).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
