/*******************************************************************************
 * Copyright (c) 2012-2015 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package com.codenvy.ide.env.client;


import com.codenvy.ide.api.action.permits.RunActionPermit;

/**
 * Implementation of Locale permit for run action.
 *
 * @author Oleksii Orel
 */
public class RunActionPermitImpl implements RunActionPermit {
    @Override
    public boolean isAllowed() {
        return true;
    }
}
