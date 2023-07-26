
# IoKruiseAppsV1alpha1WorkloadSpreadStatusSubsetStatuses

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditions** | [**List&lt;IoKruiseAppsV1alpha1WorkloadSpreadStatusConditions&gt;**](IoKruiseAppsV1alpha1WorkloadSpreadStatusConditions.md) | Conditions is an array of current observed subset conditions. |  [optional]
**creatingPods** | [**Map&lt;String, OffsetDateTime&gt;**](OffsetDateTime.md) | CreatingPods contains information about pods whose creation was processed by the webhook handler but not yet been observed by the WorkloadSpread controller. A pod will be in this map from the time when the webhook handler processed the creation request to the time when the pod is seen by controller. The key in the map is the name of the pod and the value is the time when the webhook handler process the creation request. If the real creation didn&#39;t happen and a pod is still in this map, it will be removed from the list automatically by WorkloadSpread controller after some time. If everything goes smooth this map should be empty for the most of the time. Large number of entries in the map may indicate problems with pod creations. |  [optional]
**deletingPods** | [**Map&lt;String, OffsetDateTime&gt;**](OffsetDateTime.md) | DeletingPods is similar with CreatingPods and it contains information about pod deletion. |  [optional]
**missingReplicas** | **Integer** | MissingReplicas is the number of active replicas belong to this subset not be found. MissingReplicas &gt; 0 indicates the subset is still missing MissingReplicas pods to create MissingReplicas &#x3D; 0 indicates the subset already has enough pods, there is no need to create MissingReplicas &#x3D; -1 indicates the subset&#39;s MaxReplicas not set, then there is no limit for pods number | 
**name** | **String** | Name should be unique between all of the subsets under one WorkloadSpread. | 
**replicas** | **Integer** | Replicas is the most recently observed number of active replicas for subset. | 



