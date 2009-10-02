package org.apache.maven.model.profile.activation;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.model.Profile;
import org.apache.maven.model.building.ModelProblemCollector;
import org.apache.maven.model.profile.ProfileActivationContext;

/**
 * Determines whether a profile should be activated.
 * 
 * @author Benjamin Bentmann
 */
public interface ProfileActivator
{

    /**
     * Determines whether the specified profile is active in the given activator context.
     * 
     * @param profile The profile whose activation status should be determined, must not be {@code null}.
     * @param context The environmental context used to determine the activation status of the profile, must not be
     *            {@code null}.
     * @param problems The container used to collect problems (e.g. bad syntax) that were encountered, must not be
     *            {@code null}.
     * @return {@code true} if the profile is active, {@code false} otherwise.
     */
    boolean isActive( Profile profile, ProfileActivationContext context, ModelProblemCollector problems );

}