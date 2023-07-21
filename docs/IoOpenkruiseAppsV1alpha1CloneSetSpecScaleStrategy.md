
# IoKruiseAppsV1alpha1CloneSetSpecScaleStrategy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disablePVCReuse** | **Boolean** | Indicate if cloneSet will reuse already existed pvc to rebuild a new pod |  [optional]
**maxUnavailable** | **Object** | The maximum number of pods that can be unavailable for scaled pods. This field can control the changes rate of replicas for CloneSet so as to minimize the impact for users&#39; service. The scale will fail if the number of unavailable pods were greater than this MaxUnavailable at scaling up. MaxUnavailable works only when scaling up. |  [optional]
**podsToDelete** | **List&lt;String&gt;** | PodsToDelete is the names of Pod should be deleted. Note that this list will be truncated for non-existing pod names. |  [optional]



