
# IoKruiseAppsV1alpha1CloneSetStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availableReplicas** | **Integer** | AvailableReplicas is the number of Pods created by the CloneSet controller that have a Ready Condition for at least minReadySeconds. | 
**collisionCount** | **Integer** | CollisionCount is the count of hash collisions for the CloneSet. The CloneSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision. |  [optional]
**conditions** | [**List&lt;IoKruiseAppsV1alpha1CloneSetStatusConditions&gt;**](IoKruiseAppsV1alpha1CloneSetStatusConditions.md) | Conditions represents the latest available observations of a CloneSet&#39;s current state. |  [optional]
**currentRevision** | **String** | currentRevision, if not empty, indicates the current revision version of the CloneSet. |  [optional]
**expectedUpdatedReplicas** | **Integer** | ExpectedUpdatedReplicas is the number of Pods that should be updated by CloneSet controller. This field is calculated via Replicas - Partition. |  [optional]
**labelSelector** | **String** | LabelSelector is label selectors for query over pods that should match the replica count used by HPA. |  [optional]
**observedGeneration** | **Long** | ObservedGeneration is the most recent generation observed for this CloneSet. It corresponds to the CloneSet&#39;s generation, which is updated on mutation by the API Server. |  [optional]
**readyReplicas** | **Integer** | ReadyReplicas is the number of Pods created by the CloneSet controller that have a Ready Condition. | 
**replicas** | **Integer** | Replicas is the number of Pods created by the CloneSet controller. | 
**updateRevision** | **String** | UpdateRevision, if not empty, indicates the latest revision of the CloneSet. |  [optional]
**updatedAvailableReplicas** | **Integer** | UpdatedAvailableReplicas is the number of Pods created by the CloneSet controller from the CloneSet version indicated by updateRevision and have a Ready Condition for at least minReadySeconds. | 
**updatedReadyReplicas** | **Integer** | UpdatedReadyReplicas is the number of Pods created by the CloneSet controller from the CloneSet version indicated by updateRevision and have a Ready Condition. | 
**updatedReplicas** | **Integer** | UpdatedReplicas is the number of Pods created by the CloneSet controller from the CloneSet version indicated by updateRevision. | 



