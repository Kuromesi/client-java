
# IoKruiseAppsV1alpha1DaemonSetSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**burstReplicas** | **Object** | BurstReplicas is a rate limiter for booting pods on a lot of pods. The default value is 250 |  [optional]
**lifecycle** | [**IoKruiseAppsV1alpha1DaemonSetSpecLifecycle**](IoKruiseAppsV1alpha1DaemonSetSpecLifecycle.md) |  |  [optional]
**minReadySeconds** | **Integer** | The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready). |  [optional]
**revisionHistoryLimit** | **Integer** | The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10. |  [optional]
**selector** | [**IoKruiseAppsV1alpha1DaemonSetSpecSelector**](IoKruiseAppsV1alpha1DaemonSetSpecSelector.md) |  | 
**template** | **Object** | An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every node that matches the template&#39;s node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template | 
**updateStrategy** | [**IoKruiseAppsV1alpha1DaemonSetSpecUpdateStrategy**](IoKruiseAppsV1alpha1DaemonSetSpecUpdateStrategy.md) |  |  [optional]



