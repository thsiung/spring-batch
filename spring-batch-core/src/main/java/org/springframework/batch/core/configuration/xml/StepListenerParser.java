/*
 * Copyright 2006-2009 the original author or authors.
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
package org.springframework.batch.core.configuration.xml;

import org.springframework.batch.core.listener.AbstractListenerFactoryBean;
import org.springframework.batch.core.listener.ListenerMetaData;
import org.springframework.batch.core.listener.StepListenerFactoryBean;
import org.springframework.batch.core.listener.StepListenerMetaData;

/**
 * Parser for a step listener element. Builds a {@link StepListenerFactoryBean}
 * using attributes from the configuration.
 * 
 * @author Dan Garrette
 * @since 2.0
 * @see AbstractListenerParser
 */
public class StepListenerParser extends AbstractListenerParser {

	protected Class<? extends AbstractListenerFactoryBean> getBeanClass() {
		return StepListenerFactoryBean.class;
	}

	protected ListenerMetaData[] getMetaDataValues() {
		return StepListenerMetaData.values();
	}

}