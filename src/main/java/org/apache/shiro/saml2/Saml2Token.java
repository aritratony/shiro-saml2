/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.shiro.saml2;

import org.apache.shiro.authc.RememberMeAuthenticationToken;

public class Saml2Token implements RememberMeAuthenticationToken {

	private static final long serialVersionUID = -5283169468296310309L;

	private String samlToken = null;
	private String nameId = null;
	private boolean rememberMe = false;

	public Saml2Token(String samlToken) {
		this.samlToken = samlToken;
	}

	public Object getCredentials() {
		return samlToken;
	}

	public Object getPrincipal() {
		return nameId;
	}

	public boolean isRememberMe() {
		return rememberMe;
	}

	public void setNameId(String nameId) {
		this.nameId = nameId;
	}

	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}

}
