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

case class WorkflowSpec (
  /* Optional duration in seconds relative to the workflow start time which the workflow is allowed to run before the controller terminates the  A value of zero is used to terminate a Running workflow */
  activeDeadlineSeconds: Option[Long] = None,
  affinity: Option[Affinity] = None,
  arguments: Option[Arguments] = None,
  artifactRepositoryRef: Option[ArtifactRepositoryRef] = None,
  /* AutomountServiceAccountToken indicates whether a service account token should be automatically mounted in pods. ServiceAccountName of ExecutorConfig must be specified if this value is false. */
  automountServiceAccountToken: Option[Boolean] = None,
  dnsConfig: Option[PodDNSConfig] = None,
  /* Set DNS policy for the pod. Defaults to \"ClusterFirst\". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'. */
  dnsPolicy: Option[String] = None,
  /* Entrypoint is a template reference to the starting point of the  */
  entrypoint: Option[String] = None,
  executor: Option[ExecutorConfig] = None,
  hostAliases: Option[Seq[HostAlias]] = None,
  /* Host networking requested for this workflow pod. Default to false. */
  hostNetwork: Option[Boolean] = None,
  /* ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod */
  imagePullSecrets: Option[Seq[LocalObjectReference]] = None,
  metrics: Option[Metrics] = None,
  /* NodeSelector is a selector which will result in all pods of the workflow to be scheduled on the selected node(s). This is able to be overridden by a nodeSelector specified in the template. */
  nodeSelector: Option[Map[String, String]] = None,
  /* OnExit is a template reference which is invoked at the end of the workflow, irrespective of the success, failure, or error of the primary  */
  onExit: Option[String] = None,
  /* Parallelism limits the max total parallel pods that can execute at the same time in a workflow */
  parallelism: Option[Long] = None,
  podDisruptionBudget: Option[PodDisruptionBudgetSpec] = None,
  podGC: Option[PodGC] = None,
  /* Priority to apply to workflow pods. */
  podPriority: Option[Int] = None,
  /* PriorityClassName to apply to workflow pods. */
  podPriorityClassName: Option[String] = None,
  /* PodSpecPatch holds strategic merge patch to apply against the pod spec. Allows parameterization of container fields which are not strings (e.g. resource limits). */
  podSpecPatch: Option[String] = None,
  /* Priority is used if controller is configured to process limited number of workflows in parallel. Workflows with higher priority are processed first. */
  priority: Option[Int] = None,
  /* Set scheduler name for all pods. Will be overridden if container/script template's scheduler name is set. Default scheduler will be used if neither specified. */
  schedulerName: Option[String] = None,
  securityContext: Option[PodSecurityContext] = None,
  /* ServiceAccountName is the name of the ServiceAccount to run all pods of the workflow as. */
  serviceAccountName: Option[String] = None,
  /* Shutdown will shutdown the workflow according to its ShutdownStrategy */
  shutdown: Option[String] = None,
  /* Suspend will suspend the workflow and prevent execution of any future steps in the workflow */
  suspend: Option[Boolean] = None,
  /* Templates is a list of workflow templates used in a workflow */
  templates: Seq[Template],
  /* Tolerations to apply to workflow pods. */
  tolerations: Option[Seq[Toleration]] = None,
  /* TTLSecondsAfterFinished limits the lifetime of a Workflow that has finished execution (Succeeded, Failed, Error). If this field is set, once the Workflow finishes, it will be deleted after ttlSecondsAfterFinished expires. If this field is unset, ttlSecondsAfterFinished will not expire. If this field is set to zero, ttlSecondsAfterFinished expires immediately after the Workflow finishes. DEPRECATED: Use TTLStrategy.SecondsAfterCompletion instead. */
  ttlSecondsAfterFinished: Option[Int] = None,
  ttlStrategy: Option[TTLStrategy] = None,
  /* VolumeClaimTemplates is a list of claims that containers are allowed to reference. The Workflow controller will create the claims at the beginning of the workflow and delete the claims upon completion of the workflow */
  volumeClaimTemplates: Option[Seq[PersistentVolumeClaim]] = None,
  /* Volumes is a list of volumes that can be mounted by containers in a  */
  volumes: Option[Seq[Volume]] = None,
  workflowTemplateRef: Option[WorkflowTemplateRef] = None
) extends ApiModel

