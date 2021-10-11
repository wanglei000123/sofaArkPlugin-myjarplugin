package com.quadtalent.sofaark.myjarplugin.activator;

import com.alipay.sofa.ark.exception.ArkRuntimeException;
import com.alipay.sofa.ark.spi.model.PluginContext;
import com.alipay.sofa.ark.spi.service.PluginActivator;
import com.quadtalent.sofaark.myjarplugin.service.SamplePluginService;
import com.quadtalent.sofaark.myjarplugin.service.impl.SamplePluginServiceImpl;

/**
 * @author wanglei
 * @since 2021/10/8 7:34 下午
 */
public class SamplePluginActivator implements PluginActivator {

    public void start(PluginContext context) throws ArkRuntimeException {
        System.out.println("starting in sample ark plugin activator");
        System.out.println();
        context.publishService(SamplePluginService.class, new SamplePluginServiceImpl());
    }

    public void stop(PluginContext context) throws ArkRuntimeException {
        System.out.println("stopping in ark plugin activator");
        System.out.println();
    }

}
