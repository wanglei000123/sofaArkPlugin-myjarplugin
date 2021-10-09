package com.quadtalent.sofaark.myjarplugin.service.impl;

import com.alipay.sofa.ark.spi.event.ArkEvent;
import com.alipay.sofa.ark.spi.service.ArkInject;
import com.alipay.sofa.ark.spi.service.event.EventAdminService;
import com.quadtalent.sofaark.myjarplugin.service.SamplePluginService;

/**
 * @author wanglei
 * @since 2021/10/8 7:37 下午
 */
public class SamplePluginServiceImpl implements SamplePluginService {

    @ArkInject
    private EventAdminService eventAdminService;

    public String service() {
        return "I'm a sample plugin service published by ark-plugin";
    }

    public void sendEvent(ArkEvent arkEvent) {
        eventAdminService.sendEvent(arkEvent);
    }
}
