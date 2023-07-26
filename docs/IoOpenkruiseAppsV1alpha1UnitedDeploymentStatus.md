
# IoKruiseAppsV1alpha1UnitedDeploymentStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collisionCount** | **Integer** | Count of hash collisions for the UnitedDeployment. The UnitedDeployment controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision. |  [optional]
**conditions** | [**List&lt;IoKruiseAppsV1alpha1UnitedDeploymentStatusConditions&gt;**](IoKruiseAppsV1alpha1UnitedDeploymentStatusConditions.md) | Represents the latest available observations of a UnitedDeployment&#39;s current state. |  [optional]
**currentRevision** | **String** | CurrentRevision, if not empty, indicates the current version of the UnitedDeployment. | 
**labelSelector** | **String** | LabelSelector is label selectors for query over pods that should match the replica count used by HPA. |  [optional]
**observedGeneration** | **Long** | ObservedGeneration is the most recent generation observed for this UnitedDeployment. It corresponds to the UnitedDeployment&#39;s generation, which is updated on mutation by the API Server. |  [optional]
**readyReplicas** | **Integer** | The number of ready replicas. |  [optional]
**replicas** | **Integer** | Replicas is the most recently observed number of replicas. | 
**subsetReplicas** | **Map&lt;String, Integer&gt;** | Records the topology detail information of the replicas of each subset. |  [optional]
**updateStatus** | [**IoKruiseAppsV1alpha1UnitedDeploymentStatusUpdateStatus**](IoKruiseAppsV1alpha1UnitedDeploymentStatusUpdateStatus.md) |  |  [optional]
**updatedReadyReplicas** | **Integer** | The number of ready current revision replicas for this UnitedDeployment. |  [optional]
**updatedReplicas** | **Integer** | The number of pods in current version. | 



