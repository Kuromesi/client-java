
# IoKruiseAppsV1alpha1SidecarSetStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collisionCount** | **Integer** | CollisionCount is the count of hash collisions for the SidecarSet. The SidecarSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision. |  [optional]
**latestRevision** | **String** | LatestRevision, if not empty, indicates the latest controllerRevision name of the SidecarSet. |  [optional]
**matchedPods** | **Integer** | matchedPods is the number of Pods whose labels are matched with this SidecarSet&#39;s selector and are created after sidecarset creates | 
**observedGeneration** | **Long** | observedGeneration is the most recent generation observed for this SidecarSet. It corresponds to the SidecarSet&#39;s generation, which is updated on mutation by the API Server. |  [optional]
**readyPods** | **Integer** | readyPods is the number of matched Pods that have a ready condition | 
**updatedPods** | **Integer** | updatedPods is the number of matched Pods that are injected with the latest SidecarSet&#39;s containers | 
**updatedReadyPods** | **Integer** | updatedReadyPods is the number of matched pods that updated and ready |  [optional]



