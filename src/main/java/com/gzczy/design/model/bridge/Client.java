package com.gzczy.design.model.bridge;

import com.gzczy.design.model.bridge.brand.Vivo;
import com.gzczy.design.model.bridge.brand.XiaoMi;
import com.gzczy.design.model.bridge.type.FoldedPhone;
import com.gzczy.design.model.bridge.type.UpRightPhone;

/**
 * @Description 客户端
 * @Author chenzhengyu
 * @Date 2020-12-03 20:06
 */
public class Client {

    public static void main(String[] args) {
        Phone ViVOPhone = new FoldedPhone(new Vivo());

        ViVOPhone.open();
        ViVOPhone.call();
        ViVOPhone.close();

        Phone XiaoMiPhone = new UpRightPhone(new XiaoMi());
        XiaoMiPhone.open();
        XiaoMiPhone.call();
        XiaoMiPhone.close();
    }
}
