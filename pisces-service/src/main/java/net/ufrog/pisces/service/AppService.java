package net.ufrog.pisces.service;

import net.ufrog.pisces.domain.models.App;

/**
 * 应用业务接口
 *
 * @author ultrafrog, ufrog.net@gmail.com
 * @version 0.1, 2017-09-06
 * @since 0.1
 */
public interface AppService {

    /**
     * 通过用户中心编号查询应用
     *
     * @param leoAppId 用户中心编号
     * @return 应用对象
     */
    App findByLeoAppId(String leoAppId);

    /**
     * 创建应用
     *
     * @param app 应用实例
     * @return 应用实例
     */
    App create(App app);
}
