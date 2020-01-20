package vip.abatt.unit02;

import java.util.prefs.Preferences;

/**
 * Author:yankai1101
 * Desc: 依赖注入模式，App04的创建，需要配置信息（Preferences）的支持
 **/
public class App04 {
    private final String preferences;

    public App04(String preferences) {
        this.preferences = preferences;
    }
}
