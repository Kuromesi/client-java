
# IoKruiseAppsV1alpha1ContainerRecreateRequestSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeDeadlineSeconds** | **Long** | ActiveDeadlineSeconds is the deadline duration of this ContainerRecreateRequest. |  [optional]
**containers** | [**List&lt;IoKruiseAppsV1alpha1ContainerRecreateRequestSpecContainers&gt;**](IoKruiseAppsV1alpha1ContainerRecreateRequestSpecContainers.md) | Containers contains the containers that need to recreate in the Pod. | 
**podName** | **String** | PodName is name of the Pod that owns the recreated containers. | 
**strategy** | [**IoKruiseAppsV1alpha1ContainerRecreateRequestSpecStrategy**](IoKruiseAppsV1alpha1ContainerRecreateRequestSpecStrategy.md) |  |  [optional]
**ttlSecondsAfterFinished** | **Integer** | TTLSecondsAfterFinished is the TTL duration after this ContainerRecreateRequest has completed. |  [optional]



