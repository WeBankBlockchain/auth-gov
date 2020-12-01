/**
 * Copyright 2014-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.webank.authmanager.config;

import com.webank.authmanager.utils.HashUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import lombok.Data;

/**
 * System Environment Config.
 *
 * @Description: SystemEnvironmentConfig
 * @author maojiayu
 * @data Dec 28, 2018 5:21:48 PM
 *
 */
@Configuration
@ConfigurationProperties("system")
@Data
@Order(5)
public class SystemEnvironmentConfig{
    private String orgId;
    private String nodeStr;
    private int groupId;
    private int encryptType;
    private String certPath;
    private String privateKeyPem;
    private String privateKey;
}