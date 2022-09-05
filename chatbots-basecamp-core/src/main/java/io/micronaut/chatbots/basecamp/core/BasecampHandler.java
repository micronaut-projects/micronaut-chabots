/*
 * Copyright 2017-2022 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.chatbots.basecamp.core;

import io.micronaut.chatbots.basecamp.api.Query;
import io.micronaut.chatbots.core.Handler;

/**
 * Handler for Basecamp Chatbot messages.
 * <a href="https://github.com/basecamp/bc3-api/blob/master/sections/chatbots.md#chatbots">Chatbots</a>
 * @author Sergio del Amo
 * @since 1.0.0
 */
public interface BasecampHandler extends Handler<BasecampBotConfiguration, Query, String> {
}
