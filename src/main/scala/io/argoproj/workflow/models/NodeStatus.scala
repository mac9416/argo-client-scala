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

case class NodeStatus (
  /* BoundaryID indicates the node ID of the associated template root node in which this node belongs to */
  boundaryID: Option[String] = None,
  /* Children is a list of child node IDs */
  children: Option[Seq[String]] = None,
  /* Daemoned tracks whether or not this node was daemoned and need to be terminated */
  daemoned: Option[Boolean] = None,
  /* DisplayName is a human readable representation of the node. Unique within a template boundary */
  displayName: String,
  /* Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers. */
  finishedAt: Option[OffsetDateTime] = None,
  /* HostNodeName name of the Kubernetes node on which the Pod is running, if applicable */
  hostNodeName: Option[String] = None,
  /* ID is a unique identifier of a node within the worklow It is implemented as a hash of the node name, which makes the ID deterministic */
  id: String,
  inputs: Option[Inputs] = None,
  /* A human readable message indicating details about why the node is in this condition. */
  message: Option[String] = None,
  /* Name is unique name in the node tree used to generate the node ID */
  name: String,
  /* OutboundNodes tracks the node IDs which are considered \"outbound\" nodes to a template invocation. For every invocation of a template, there are nodes which we considered as \"outbound\". Essentially, these are last nodes in the execution sequence to run, before the template is considered completed. These nodes are then connected as parents to a following step.  In the case of single pod steps (i.e. container, script, resource templates), this list will be nil since the pod itself is already considered the \"outbound\" node. In the case of DAGs, outbound nodes are the \"target\" tasks (tasks with no children). In the case of steps, outbound nodes are all the containers involved in the last step group. NOTE: since templates are composable, the list of outbound nodes are carried upwards when a DAG/steps template invokes another DAG/steps template. In other words, the outbound nodes of a template, will be a superset of the outbound nodes of its last children. */
  outboundNodes: Option[Seq[String]] = None,
  outputs: Option[Outputs] = None,
  /* Phase a simple, high-level summary of where the node is in its lifecycle. Can be used as a state machine. */
  phase: Option[String] = None,
  /* PodIP captures the IP of the pod for daemoned steps */
  podIP: Option[String] = None,
  /* ResourcesDuration is indicative, but not accurate, resource duration. This is populated when the nodes completes. */
  resourcesDuration: Option[Map[String, Long]] = None,
  /* Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers. */
  startedAt: Option[OffsetDateTime] = None,
  /* StoredTemplateID is the ID of stored template. DEPRECATED: This value is not used anymore. */
  storedTemplateID: Option[String] = None,
  /* TemplateName is the template name which this node corresponds to. Not applicable to virtual nodes (e.g. Retry, StepGroup) */
  templateName: Option[String] = None,
  templateRef: Option[TemplateRef] = None,
  /* TemplateScope is the template scope in which the template of this node was retrieved. */
  templateScope: Option[String] = None,
  /* Type indicates type of node */
  `type`: String,
  /* WorkflowTemplateName is the WorkflowTemplate resource name on which the resolved template of this node is retrieved. DEPRECATED: This value is not used anymore. */
  workflowTemplateName: Option[String] = None
) extends ApiModel

