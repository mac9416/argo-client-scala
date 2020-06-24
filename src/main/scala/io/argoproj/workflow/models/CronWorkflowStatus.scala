/**
 * Argo
 * Argo
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package io.argoproj.workflow.models

import java.time.OffsetDateTime
import io.argoproj.workflow.ApiModel

case class CronWorkflowStatus (
  /* Active is a list of active workflows stemming from this CronWorkflow */
  active: Option[Seq[ObjectReference]] = None,
  /* Conditions is a list of conditions the CronWorkflow may have */
  conditions: Option[Seq[Condition]] = None,
  /* Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers. */
  lastScheduledTime: Option[OffsetDateTime] = None
) extends ApiModel


