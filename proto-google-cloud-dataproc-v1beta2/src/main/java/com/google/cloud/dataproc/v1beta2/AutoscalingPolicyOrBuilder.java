/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/autoscaling_policies.proto

package com.google.cloud.dataproc.v1beta2;

public interface AutoscalingPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.AutoscalingPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The policy id.
   * The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). Cannot begin or end with underscore
   * or hyphen. Must consist of between 3 and 50 characters.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Required. The policy id.
   * The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). Cannot begin or end with underscore
   * or hyphen. Must consist of between 3 and 50 characters.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The "resource name" of the autoscaling policy, as described
   * in https://cloud.google.com/apis/design/resource_names.
   * * For `projects.regions.autoscalingPolicies`, the resource name of the
   *   policy has the following format:
   *   `projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id}`
   * * For `projects.locations.autoscalingPolicies`, the resource name of the
   *   policy has the following format:
   *   `projects/{project_id}/locations/{location}/autoscalingPolicies/{policy_id}`
   * </pre>
   *
   * <code>string name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The "resource name" of the autoscaling policy, as described
   * in https://cloud.google.com/apis/design/resource_names.
   * * For `projects.regions.autoscalingPolicies`, the resource name of the
   *   policy has the following format:
   *   `projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id}`
   * * For `projects.locations.autoscalingPolicies`, the resource name of the
   *   policy has the following format:
   *   `projects/{project_id}/locations/{location}/autoscalingPolicies/{policy_id}`
   * </pre>
   *
   * <code>string name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   * <code>.google.cloud.dataproc.v1beta2.BasicAutoscalingAlgorithm basic_algorithm = 3;</code>
   *
   * @return Whether the basicAlgorithm field is set.
   */
  boolean hasBasicAlgorithm();
  /**
   * <code>.google.cloud.dataproc.v1beta2.BasicAutoscalingAlgorithm basic_algorithm = 3;</code>
   *
   * @return The basicAlgorithm.
   */
  com.google.cloud.dataproc.v1beta2.BasicAutoscalingAlgorithm getBasicAlgorithm();
  /** <code>.google.cloud.dataproc.v1beta2.BasicAutoscalingAlgorithm basic_algorithm = 3;</code> */
  com.google.cloud.dataproc.v1beta2.BasicAutoscalingAlgorithmOrBuilder getBasicAlgorithmOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Describes how the autoscaler will operate for primary workers.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1beta2.InstanceGroupAutoscalingPolicyConfig worker_config = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the workerConfig field is set.
   */
  boolean hasWorkerConfig();
  /**
   *
   *
   * <pre>
   * Required. Describes how the autoscaler will operate for primary workers.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1beta2.InstanceGroupAutoscalingPolicyConfig worker_config = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The workerConfig.
   */
  com.google.cloud.dataproc.v1beta2.InstanceGroupAutoscalingPolicyConfig getWorkerConfig();
  /**
   *
   *
   * <pre>
   * Required. Describes how the autoscaler will operate for primary workers.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1beta2.InstanceGroupAutoscalingPolicyConfig worker_config = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataproc.v1beta2.InstanceGroupAutoscalingPolicyConfigOrBuilder
      getWorkerConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Describes how the autoscaler will operate for secondary workers.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1beta2.InstanceGroupAutoscalingPolicyConfig secondary_worker_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the secondaryWorkerConfig field is set.
   */
  boolean hasSecondaryWorkerConfig();
  /**
   *
   *
   * <pre>
   * Optional. Describes how the autoscaler will operate for secondary workers.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1beta2.InstanceGroupAutoscalingPolicyConfig secondary_worker_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The secondaryWorkerConfig.
   */
  com.google.cloud.dataproc.v1beta2.InstanceGroupAutoscalingPolicyConfig getSecondaryWorkerConfig();
  /**
   *
   *
   * <pre>
   * Optional. Describes how the autoscaler will operate for secondary workers.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1beta2.InstanceGroupAutoscalingPolicyConfig secondary_worker_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1beta2.InstanceGroupAutoscalingPolicyConfigOrBuilder
      getSecondaryWorkerConfigOrBuilder();

  public com.google.cloud.dataproc.v1beta2.AutoscalingPolicy.AlgorithmCase getAlgorithmCase();
}
