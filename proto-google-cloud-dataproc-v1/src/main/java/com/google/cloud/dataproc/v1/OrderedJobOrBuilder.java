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
// source: google/cloud/dataproc/v1/workflow_templates.proto

package com.google.cloud.dataproc.v1;

public interface OrderedJobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.OrderedJob)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The step id. The id must be unique among all jobs
   * within the template.
   * The step id is used as prefix for job id, as job
   * `goog-dataproc-workflow-step-id` label, and in
   * [prerequisiteStepIds][google.cloud.dataproc.v1.OrderedJob.prerequisite_step_ids] field from other
   * steps.
   * The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). Cannot begin or end with underscore
   * or hyphen. Must consist of between 3 and 50 characters.
   * </pre>
   *
   * <code>string step_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The stepId.
   */
  java.lang.String getStepId();
  /**
   *
   *
   * <pre>
   * Required. The step id. The id must be unique among all jobs
   * within the template.
   * The step id is used as prefix for job id, as job
   * `goog-dataproc-workflow-step-id` label, and in
   * [prerequisiteStepIds][google.cloud.dataproc.v1.OrderedJob.prerequisite_step_ids] field from other
   * steps.
   * The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). Cannot begin or end with underscore
   * or hyphen. Must consist of between 3 and 50 characters.
   * </pre>
   *
   * <code>string step_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for stepId.
   */
  com.google.protobuf.ByteString getStepIdBytes();

  /**
   * <code>.google.cloud.dataproc.v1.HadoopJob hadoop_job = 2;</code>
   *
   * @return Whether the hadoopJob field is set.
   */
  boolean hasHadoopJob();
  /**
   * <code>.google.cloud.dataproc.v1.HadoopJob hadoop_job = 2;</code>
   *
   * @return The hadoopJob.
   */
  com.google.cloud.dataproc.v1.HadoopJob getHadoopJob();
  /** <code>.google.cloud.dataproc.v1.HadoopJob hadoop_job = 2;</code> */
  com.google.cloud.dataproc.v1.HadoopJobOrBuilder getHadoopJobOrBuilder();

  /**
   * <code>.google.cloud.dataproc.v1.SparkJob spark_job = 3;</code>
   *
   * @return Whether the sparkJob field is set.
   */
  boolean hasSparkJob();
  /**
   * <code>.google.cloud.dataproc.v1.SparkJob spark_job = 3;</code>
   *
   * @return The sparkJob.
   */
  com.google.cloud.dataproc.v1.SparkJob getSparkJob();
  /** <code>.google.cloud.dataproc.v1.SparkJob spark_job = 3;</code> */
  com.google.cloud.dataproc.v1.SparkJobOrBuilder getSparkJobOrBuilder();

  /**
   * <code>.google.cloud.dataproc.v1.PySparkJob pyspark_job = 4;</code>
   *
   * @return Whether the pysparkJob field is set.
   */
  boolean hasPysparkJob();
  /**
   * <code>.google.cloud.dataproc.v1.PySparkJob pyspark_job = 4;</code>
   *
   * @return The pysparkJob.
   */
  com.google.cloud.dataproc.v1.PySparkJob getPysparkJob();
  /** <code>.google.cloud.dataproc.v1.PySparkJob pyspark_job = 4;</code> */
  com.google.cloud.dataproc.v1.PySparkJobOrBuilder getPysparkJobOrBuilder();

  /**
   * <code>.google.cloud.dataproc.v1.HiveJob hive_job = 5;</code>
   *
   * @return Whether the hiveJob field is set.
   */
  boolean hasHiveJob();
  /**
   * <code>.google.cloud.dataproc.v1.HiveJob hive_job = 5;</code>
   *
   * @return The hiveJob.
   */
  com.google.cloud.dataproc.v1.HiveJob getHiveJob();
  /** <code>.google.cloud.dataproc.v1.HiveJob hive_job = 5;</code> */
  com.google.cloud.dataproc.v1.HiveJobOrBuilder getHiveJobOrBuilder();

  /**
   * <code>.google.cloud.dataproc.v1.PigJob pig_job = 6;</code>
   *
   * @return Whether the pigJob field is set.
   */
  boolean hasPigJob();
  /**
   * <code>.google.cloud.dataproc.v1.PigJob pig_job = 6;</code>
   *
   * @return The pigJob.
   */
  com.google.cloud.dataproc.v1.PigJob getPigJob();
  /** <code>.google.cloud.dataproc.v1.PigJob pig_job = 6;</code> */
  com.google.cloud.dataproc.v1.PigJobOrBuilder getPigJobOrBuilder();

  /**
   * <code>.google.cloud.dataproc.v1.SparkSqlJob spark_sql_job = 7;</code>
   *
   * @return Whether the sparkSqlJob field is set.
   */
  boolean hasSparkSqlJob();
  /**
   * <code>.google.cloud.dataproc.v1.SparkSqlJob spark_sql_job = 7;</code>
   *
   * @return The sparkSqlJob.
   */
  com.google.cloud.dataproc.v1.SparkSqlJob getSparkSqlJob();
  /** <code>.google.cloud.dataproc.v1.SparkSqlJob spark_sql_job = 7;</code> */
  com.google.cloud.dataproc.v1.SparkSqlJobOrBuilder getSparkSqlJobOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this job.
   * Label keys must be between 1 and 63 characters long, and must conform to
   * the following regular expression:
   * [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   * Label values must be between 1 and 63 characters long, and must conform to
   * the following regular expression: [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   * No more than 32 labels can be associated with a given job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this job.
   * Label keys must be between 1 and 63 characters long, and must conform to
   * the following regular expression:
   * [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   * Label values must be between 1 and 63 characters long, and must conform to
   * the following regular expression: [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   * No more than 32 labels can be associated with a given job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this job.
   * Label keys must be between 1 and 63 characters long, and must conform to
   * the following regular expression:
   * [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   * Label values must be between 1 and 63 characters long, and must conform to
   * the following regular expression: [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   * No more than 32 labels can be associated with a given job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this job.
   * Label keys must be between 1 and 63 characters long, and must conform to
   * the following regular expression:
   * [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   * Label values must be between 1 and 63 characters long, and must conform to
   * the following regular expression: [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   * No more than 32 labels can be associated with a given job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with this job.
   * Label keys must be between 1 and 63 characters long, and must conform to
   * the following regular expression:
   * [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   * Label values must be between 1 and 63 characters long, and must conform to
   * the following regular expression: [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   * No more than 32 labels can be associated with a given job.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Job scheduling configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobScheduling scheduling = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the scheduling field is set.
   */
  boolean hasScheduling();
  /**
   *
   *
   * <pre>
   * Optional. Job scheduling configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobScheduling scheduling = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The scheduling.
   */
  com.google.cloud.dataproc.v1.JobScheduling getScheduling();
  /**
   *
   *
   * <pre>
   * Optional. Job scheduling configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JobScheduling scheduling = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.JobSchedulingOrBuilder getSchedulingOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The optional list of prerequisite job step_ids.
   * If not specified, the job will start at the beginning of workflow.
   * </pre>
   *
   * <code>repeated string prerequisite_step_ids = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the prerequisiteStepIds.
   */
  java.util.List<java.lang.String> getPrerequisiteStepIdsList();
  /**
   *
   *
   * <pre>
   * Optional. The optional list of prerequisite job step_ids.
   * If not specified, the job will start at the beginning of workflow.
   * </pre>
   *
   * <code>repeated string prerequisite_step_ids = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of prerequisiteStepIds.
   */
  int getPrerequisiteStepIdsCount();
  /**
   *
   *
   * <pre>
   * Optional. The optional list of prerequisite job step_ids.
   * If not specified, the job will start at the beginning of workflow.
   * </pre>
   *
   * <code>repeated string prerequisite_step_ids = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The prerequisiteStepIds at the given index.
   */
  java.lang.String getPrerequisiteStepIds(int index);
  /**
   *
   *
   * <pre>
   * Optional. The optional list of prerequisite job step_ids.
   * If not specified, the job will start at the beginning of workflow.
   * </pre>
   *
   * <code>repeated string prerequisite_step_ids = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the prerequisiteStepIds at the given index.
   */
  com.google.protobuf.ByteString getPrerequisiteStepIdsBytes(int index);

  public com.google.cloud.dataproc.v1.OrderedJob.JobTypeCase getJobTypeCase();
}
