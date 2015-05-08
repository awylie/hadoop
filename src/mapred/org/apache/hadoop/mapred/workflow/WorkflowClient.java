/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.hadoop.mapred.workflow;

import java.io.IOException;

import org.apache.hadoop.mapred.JobTracker;

/**
 * <code>WorkflowClient</code> is the primary interface for the user-workflow to
 * interact with the {@link JobTracker}.
 */
// See JobClient.
public class WorkflowClient {

  public static final String MAPREDUCE_CLIENT_RETRY_POLICY_ENABLED_KEY = "";
  public static final Boolean MAPREDUCE_CLIENT_RETRY_POLICY_ENABLED_DEFAULT = false;
  public static final String MAPREDUCE_CLIENT_RETRY_POLICY_SPEC_KEY = "";
  public static final String MAPREDUCE_CLIENT_RETRY_POLICY_SPEC_DEFAULT = "";

  public static RunningWorkflow runWorkflow(WorkflowConf workflow)
      throws IOException {
    return null;
  }
}
