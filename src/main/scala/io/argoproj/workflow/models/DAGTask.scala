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

import io.argoproj.workflow.ApiModel

case class DAGTask (
  arguments: Option[Arguments] = None,
  continueOn: Option[ContinueOn] = None,
  /* Dependencies are name of other targets which this depends on */
  dependencies: Option[Seq[String]] = None,
  /* Depends are name of other targets which this depends on */
  depends: Option[String] = None,
  /* Name is the name of the target */
  name: String,
  /* OnExit is a template reference which is invoked at the end of the template, irrespective of the success, failure, or error of the primary template. */
  onExit: Option[String] = None,
  /* Name of template to execute */
  template: String,
  templateRef: Option[TemplateRef] = None,
  /* When is an expression in which the task should conditionally execute */
  when: Option[String] = None,
  /* WithItems expands a task into multiple parallel tasks from the items in the list */
  withItems: Option[Seq[String]] = None,
  /* WithParam expands a task into multiple parallel tasks from the value in the parameter, which is expected to be a JSON list. */
  withParam: Option[String] = None,
  withSequence: Option[Sequence] = None
) extends ApiModel


