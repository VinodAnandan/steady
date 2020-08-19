/**
 * This file is part of Eclipse Steady.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.sap.psr.vulas.shared.connectivity;

import java.net.URI;

/**
 * Thrown to indicate a problem when calling RESTful services.
 */
public class ServiceConnectionException extends Exception {

  private static final long serialVersionUID = 1L;

  private URI uri;

  /**
   * <p>Constructor for ServiceConnectionException.</p>
   *
   * @param _message a {@link java.lang.String} object.
   * @param _cause a {@link java.lang.Throwable} object.
   */
  public ServiceConnectionException(String _message, Throwable _cause) {
    super(_message, _cause);
  }

  /**
   * <p>Constructor for ServiceConnectionException.</p>
   *
   * @param _uri a {@link java.net.URI} object.
   * @param _cause a {@link java.lang.Throwable} object.
   */
  public ServiceConnectionException(URI _uri, Throwable _cause) {
    super("Error calling [" + _uri + "]: " + _cause.getMessage(), _cause);
    this.uri = _uri;
  }
}
