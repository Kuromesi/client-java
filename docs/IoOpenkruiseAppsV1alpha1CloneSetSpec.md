
# IoKruiseAppsV1alpha1CloneSetSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lifecycle** | [**IoKruiseAppsV1alpha1CloneSetSpecLifecycle**](IoKruiseAppsV1alpha1CloneSetSpecLifecycle.md) |  |  [optional]
**minReadySeconds** | **Integer** | Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) |  [optional]
**replicas** | **Integer** | Replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template. If unspecified, defaults to 1. |  [optional]
**revisionHistoryLimit** | **Integer** | RevisionHistoryLimit is the maximum number of revisions that will be maintained in the CloneSet&#39;s revision history. The revision history consists of all revisions not represented by a currently applied CloneSetSpec version. The default value is 10. |  [optional]
**scaleStrategy** | [**IoKruiseAppsV1alpha1CloneSetSpecScaleStrategy**](IoKruiseAppsV1alpha1CloneSetSpecScaleStrategy.md) |  |  [optional]
**selector** | [**IoKruiseAppsV1alpha1CloneSetSpecSelector**](IoKruiseAppsV1alpha1CloneSetSpecSelector.md) |  | 
**template** | **Object** | Template describes the pods that will be created. | 
**updateStrategy** | [**IoKruiseAppsV1alpha1CloneSetSpecUpdateStrategy**](IoKruiseAppsV1alpha1CloneSetSpecUpdateStrategy.md) |  |  [optional]
**volumeClaimTemplates** | **Object** | VolumeClaimTemplates is a list of claims that pods are allowed to reference. Note that PVC will be deleted when its pod has been deleted. |  [optional]



