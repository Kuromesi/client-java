
# IoKruiseAppsV1alpha1UnitedDeploymentSpecTemplateAdvancedStatefulSetTemplateSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lifecycle** | [**IoKruiseAppsV1alpha1UnitedDeploymentSpecTemplateAdvancedStatefulSetTemplateSpecLifecycle**](IoKruiseAppsV1alpha1UnitedDeploymentSpecTemplateAdvancedStatefulSetTemplateSpecLifecycle.md) |  |  [optional]
**persistentVolumeClaimRetentionPolicy** | [**IoKruiseAppsV1alpha1UnitedDeploymentSpecTemplateAdvancedStatefulSetTemplateSpecPersistentVolumeClaimRetentionPolicy**](IoKruiseAppsV1alpha1UnitedDeploymentSpecTemplateAdvancedStatefulSetTemplateSpecPersistentVolumeClaimRetentionPolicy.md) |  |  [optional]
**podManagementPolicy** | **String** | podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is &#x60;OrderedReady&#x60;, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is &#x60;Parallel&#x60; which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once. |  [optional]
**replicas** | **Integer** | replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1. TODO: Consider a rename of this field. |  [optional]
**reserveOrdinals** | **List&lt;Integer&gt;** | reserveOrdinals controls the ordinal numbers that should be reserved, and the replicas will always be the expectation number of running Pods. For a sts with replicas&#x3D;3 and its Pods in [0, 1, 2]: - If you want to migrate Pod-1 and reserve this ordinal, just set spec.reserveOrdinal to [1].   Then controller will delete Pod-1 and create Pod-3 (existing Pods will be [0, 2, 3]) - If you just want to delete Pod-1, you should set spec.reserveOrdinal to [1] and spec.replicas to 2.   Then controller will delete Pod-1 (existing Pods will be [0, 2]) |  [optional]
**revisionHistoryLimit** | **Integer** | revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet&#39;s revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10. |  [optional]
**scaleStrategy** | [**IoKruiseAppsV1alpha1UnitedDeploymentSpecTemplateAdvancedStatefulSetTemplateSpecScaleStrategy**](IoKruiseAppsV1alpha1UnitedDeploymentSpecTemplateAdvancedStatefulSetTemplateSpecScaleStrategy.md) |  |  [optional]
**selector** | [**IoKruiseAppsV1alpha1StatefulSetSpecSelector**](IoKruiseAppsV1alpha1StatefulSetSpecSelector.md) |  | 
**serviceName** | **String** | serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where \&quot;pod-specific-string\&quot; is managed by the StatefulSet controller. |  [optional]
**template** | **Object** | template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet. | 
**updateStrategy** | [**IoKruiseAppsV1alpha1StatefulSetSpecUpdateStrategy**](IoKruiseAppsV1alpha1StatefulSetSpecUpdateStrategy.md) |  |  [optional]
**volumeClaimTemplates** | **Object** | volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name. TODO: Define the behavior if a claim already exists with the same name. |  [optional]


